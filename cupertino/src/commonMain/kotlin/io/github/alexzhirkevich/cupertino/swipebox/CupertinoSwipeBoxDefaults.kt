package io.github.alexzhirkevich.cupertino.swipebox

import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
object CupertinoSwipeBoxDefaults {
    val ItemWidth: Dp = 72.dp
    const val DismissThreshold: Float = .7f
    val AnimationSpec = spring<Float>(stiffness = Spring.StiffnessMediumLow)
}