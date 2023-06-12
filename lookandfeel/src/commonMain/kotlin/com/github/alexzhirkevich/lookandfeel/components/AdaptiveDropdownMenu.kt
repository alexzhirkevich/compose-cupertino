@file: Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
package com.github.alexzhirkevich.lookandfeel.components

import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.material3.DropdownMenuContent
import androidx.compose.material3.DropdownMenuPositionProvider
import androidx.compose.material3.calculateTransformOrigin
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.PopupPositionProvider

@Composable
internal expect fun FocusablePopup(
    popupPositionProvider: PopupPositionProvider,
    onDismissRequest: (() -> Unit)? = null,
    content: @Composable () -> Unit
)


@Composable
fun DropdownMenu(
    expanded: Boolean,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    offset: DpOffset = DpOffset(0.dp, 0.dp),
    content: @Composable ColumnScope.() -> Unit
) {

    val expandedStates = remember { MutableTransitionState(false) }
    expandedStates.targetState = expanded

    if (expandedStates.currentState || expandedStates.targetState) {
        val transformOriginState = remember { mutableStateOf(TransformOrigin.Center) }
        val density = LocalDensity.current
        val popupPositionProvider = DropdownMenuPositionProvider(
            offset,
            density
        ) { parentBounds, menuBounds ->
            transformOriginState.value = calculateTransformOrigin(parentBounds, menuBounds)
        }

        FocusablePopup(
            onDismissRequest = onDismissRequest,
            popupPositionProvider = popupPositionProvider,
        ) {
            DropdownMenuContent(
                expandedStates = expandedStates,
                transformOriginState = transformOriginState,
                modifier = modifier,
                content = content
            )
        }
    }
}