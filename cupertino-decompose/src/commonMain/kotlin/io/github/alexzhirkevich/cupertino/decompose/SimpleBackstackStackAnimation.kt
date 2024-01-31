package com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.arkivanov.decompose.Child
import io.github.alexzhirkevich.cupertino.decompose.AbstractBackstackStackAnimation
import io.github.alexzhirkevich.cupertino.decompose.SheetStackAnimator

private class SimpleBackstackStackAnimation<C : Any, T : Any>(
    disableInputDuringAnimation: Boolean,
    private val selector: (Child.Created<C, T>) -> SheetStackAnimator,
) : AbstractBackstackStackAnimation<C, T>(disableInputDuringAnimation = disableInputDuringAnimation) {

    @Composable
    override fun Child(
        item: AnimationItem<C, T>,
        onFinished: () -> Unit,
        content: @Composable (child: Child.Created<C, T>) -> Unit,
    ) {
        val animator = remember(item.child.configuration) { selector(item.child)  }

        animator(
            direction = item.direction,
            isInitial = item.isInitial,
            onFinished = onFinished,
        ) { modifier ->
            Box(modifier = modifier) {
                content(item.child)
            }
        }
    }
}

fun <C : Any, T : Any> backstackStackAnimation(
    animator: SheetStackAnimator,
    disableInputDuringAnimation: Boolean = true,
): StackAnimation<C, T> =
    SimpleBackstackStackAnimation(
        disableInputDuringAnimation = disableInputDuringAnimation,
        selector = { animator },
    )

