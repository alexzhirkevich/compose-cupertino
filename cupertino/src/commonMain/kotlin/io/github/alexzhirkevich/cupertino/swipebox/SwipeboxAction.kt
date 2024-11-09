package io.github.alexzhirkevich.cupertino.swipebox

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

data class SwipeAction(
    val onClick: () -> Unit,
    val label: @Composable () -> Unit,
    val icon: @Composable () -> Unit,
    val backgroundColor: Color = Color.Gray
)