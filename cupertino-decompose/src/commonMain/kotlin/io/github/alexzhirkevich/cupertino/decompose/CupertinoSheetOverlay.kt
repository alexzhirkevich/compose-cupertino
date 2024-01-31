package com.arkivanov.decompose.extensions.compose.stack.animation.predictiveback

import androidx.compose.foundation.gestures.awaitEachGesture
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.pointer.AwaitPointerEventScope
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.compose.ui.input.pointer.PointerInputChange
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.essenty.backhandler.BackCallback
import com.arkivanov.essenty.backhandler.BackDispatcher
import com.arkivanov.essenty.backhandler.BackDispatcher.PredictiveBackDispatcher
import com.arkivanov.essenty.backhandler.BackEvent
import com.arkivanov.essenty.backhandler.BackEvent.SwipeEdge

/**
 * Handles back gestures on both edges of the screen and drives the provided [backDispatcher] accordingly,
 * while showing the provided [backIcon].
 *
 * @param backDispatcher [BackDispatcher] where callbacks should be registered.
 * @param backIcon an icon to be shown while the gesture is being performed. A default icon can be shown
 * using [PredictiveBackGestureIcon].
 * @param modifier a [Modifier] to applied to the overlay.
 * @param startEdgeEnabled controls whether the start edge is enabled or not,
 * left in RTL mode and right in LTR mode.
 * @param endEdgeEnabled controls whether the end edge is enabled or not,
 * right in RTL mode and left in LTR mode.
 * @param onClose If supplied, then the back gesture is also handled when there are no other enabled back
 * callbacks registered in [backDispatcher], can be used to close the application.
 * @param content a content to be shown under the overlay.
 */
@ExperimentalDecomposeApi
@Composable
internal fun PredictiveSheetGestureOverlay(
    backDispatcher: BackDispatcher,
    modifier: Modifier = Modifier,
    onClose: (() -> Unit)? = null,
    topPadding: Float,
    content: @Composable () -> Unit,
) {
    Box(
        modifier = modifier.handleBackGestures(
            backDispatcher = backDispatcher,
            topPadding = topPadding
        ),
    ) {
        content()
    }

    if (onClose != null) {
        DisposableEffect(backDispatcher, onClose) {
            val callback = BackCallback(priority = BackCallback.PRIORITY_MIN, onBack = onClose)
            backDispatcher.register(callback)
            onDispose { backDispatcher.unregister(callback) }
        }
    }
}

private fun Modifier.handleBackGestures(
    backDispatcher: BackDispatcher,
    topPadding: Float
): Modifier =
    pointerInput(backDispatcher) {
        awaitEachGesture {

            val down = awaitFirstDown(pass = PointerEventPass.Initial)
            if (down.position.y < topPadding)
                return@awaitEachGesture
            val startPosition = down.position

            val handler =
                BackGestureHandler(
                    startPosition = startPosition,
                    size = size,
                    cancelXOffset = 16.dp.toPx(),
                    startYOffset = 16.dp.toPx(),
                    backDispatcher = backDispatcher,
                )

            with(handler) { handleGesture() }
        }
    }

private class BackGestureHandler(
    private val startPosition: Offset,
    private val size: IntSize,
    private val cancelXOffset: Float,
    private val startYOffset: Float,
    private val backDispatcher: BackDispatcher,
) {

    private var changesIterator: Iterator<PointerInputChange>? = null

    private suspend fun AwaitPointerEventScope.awaitChange(): PointerInputChange {
        var iterator = changesIterator

        if ((iterator == null) || !iterator.hasNext()) {
            iterator = awaitPointerEvent(pass = PointerEventPass.Initial).changes.iterator()
            changesIterator = iterator
        }

        return iterator.next()
    }

    suspend fun AwaitPointerEventScope.handleGesture() {
        val dispatcher: PredictiveBackDispatcher = awaitStart() ?: return
        processGesture(dispatcher)
    }

    private suspend fun AwaitPointerEventScope.awaitStartChange(): PointerInputChange? {
        while (true) {
            val change = awaitChange()
            val position = change.position

            if ((position.x < startPosition.x - cancelXOffset) || (position.x > startPosition.x + cancelXOffset)) {
                return null
            }
            if (position.y > startPosition.y + startYOffset) {
                return change
            }

        }
    }

    private suspend fun AwaitPointerEventScope.awaitStart(): PredictiveBackDispatcher? {
        val change = awaitStartChange() ?: return null
        val position = change.position

        val dispatcher =
            backDispatcher.startPredictiveBack(
                BackEvent(
                    progress = getProgress(position = position),
                    swipeEdge = SwipeEdge.UNKNOWN,
                    touchX = position.x,
                    touchY = position.y,
                )
            ) ?: return null

        change.consume()

        return dispatcher
    }

    private suspend fun AwaitPointerEventScope.processGesture(dispatcher: PredictiveBackDispatcher) {
        while (true) {
            val change = awaitChange()
            val position = change.position
            change.consume()

            val progress = getProgress(position = position)

            dispatcher.progress(
                BackEvent(
                    progress = progress,
                    swipeEdge = SwipeEdge.UNKNOWN,
                    touchX = position.x,
                    touchY = position.y,
                )
            )

            if (!change.pressed) {
                if (progress > 0.5F) {
                    dispatcher.finish()
                } else {
                    dispatcher.cancel()
                }

                return
            }
        }
    }

    private fun getProgress(position: Offset): Float {
        val startY = startPosition.y + startYOffset
        return ((position.y - startY) / (size.height)).coerceIn(0f, 1f)
    }
}