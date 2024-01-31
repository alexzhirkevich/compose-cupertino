package io.github.alexzhirkevich.cupertino.decompose

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import com.arkivanov.decompose.Child
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.Direction
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.StackAnimation
import com.arkivanov.decompose.router.stack.ChildStack

internal abstract class AbstractBackstackStackAnimation<C : Any, T : Any>(
    private val disableInputDuringAnimation: Boolean,
) : StackAnimation<C, T> {
    @Composable
    protected abstract fun Child(
        item: AnimationItem<C, T>,
        onFinished: () -> Unit,
        content: @Composable (child: Child.Created<C, T>) -> Unit,
    )

    @Composable
    override operator fun invoke(stack: ChildStack<C, T>, modifier: Modifier, content: @Composable (child: Child.Created<C, T>) -> Unit) {
        var currentStack by remember { mutableStateOf(stack) }
        var items by remember { mutableStateOf(getAnimationItems(newStack = currentStack, oldStack = null)) }

        if (stack.active.configuration != currentStack.active.configuration) {
            val oldStack = currentStack
            currentStack = stack
            items = getAnimationItems(newStack = currentStack, oldStack = oldStack)
        }

        var gestureEnabled by remember(items) {
            mutableStateOf(items.size == 1)
        }

        Box(modifier = modifier) {
            items.forEach { (configuration, item) ->
                key(configuration) {
                    Child(
                        item = item,
                        onFinished = {
                           gestureEnabled = true
                        },
                        content = content,
                    )
                }
            }

            if (disableInputDuringAnimation && !gestureEnabled) {
                Overlay(modifier = Modifier.matchParentSize())
            }
        }
    }

    @Composable
    private fun Overlay(modifier: Modifier) {
        Box(
            modifier = modifier.pointerInput(Unit) {
                awaitPointerEventScope {
                    while (true) {
                        val event = awaitPointerEvent()
                        event.changes.forEach { it.consume() }
                    }
                }
            }
        )
    }

    private fun getAnimationItems(newStack: ChildStack<C, T>, oldStack: ChildStack<C, T>?): Map<C, AnimationItem<C, T>> {

        val pop = oldStack != null && (newStack.size < oldStack.size) && (newStack.active.configuration in oldStack.backStack)

        return when {
            oldStack == null ->
                listOf(
                    AnimationItem(child = newStack.active, direction = TriDirection.ENTER_FRONT, isInitial = true)
                )

            pop && newStack.backStack.isNotEmpty()->
                listOf(
                    AnimationItem(child = newStack.backStack.last(), direction = TriDirection.ENTER_BACK_SECOND),
                    AnimationItem(child = newStack.active, direction = TriDirection.ENTER_BACK),
                    AnimationItem(child = oldStack.active, direction = TriDirection.EXIT_FRONT),
                )

            pop ->
                listOf(
                    AnimationItem(child = newStack.active, direction = TriDirection.ENTER_BACK),
                    AnimationItem(child = oldStack.active, direction = TriDirection.EXIT_FRONT),
                )

            oldStack.backStack.isNotEmpty() -> listOf(
                AnimationItem(child = oldStack.backStack.last(), direction = TriDirection.EXIT_BACK_SECOND),
                AnimationItem(child = oldStack.active, direction = TriDirection.EXIT_BACK),
                AnimationItem(child = newStack.active, direction = TriDirection.ENTER_FRONT),
            )
            else ->
                listOf(
                    AnimationItem(child = oldStack.active, direction = TriDirection.EXIT_BACK),
                    AnimationItem(child = newStack.active, direction = TriDirection.ENTER_FRONT),
                )
        }.associateBy { it.child.configuration }
        }

    private val ChildStack<*, *>.size: Int
        get() = items.size

    private operator fun <C : Any> Iterable<Child<C, *>>.contains(config: C): Boolean =
        any { it.configuration == config }

    protected data class AnimationItem<out C : Any, out T : Any>(
        val child: Child.Created<C, T>,
        val direction: TriDirection,
        val isInitial: Boolean = false,
    )
}
