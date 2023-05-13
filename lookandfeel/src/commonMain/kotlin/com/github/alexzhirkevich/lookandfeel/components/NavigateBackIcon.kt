package com.github.alexzhirkevich.lookandfeel.components

import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.github.alexzhirkevich.lookandfeel.icons.AdaptiveArrowBack
import moe.tlaster.precompose.ui.LocalBackDispatcherOwner

@Composable
fun NavigateBackIcon(
    enabled : Boolean = true,
    icon : ImageVector = Icons.Default.AdaptiveArrowBack,
    contentDescription : String? = "Back"
) {
    val bp = LocalBackDispatcherOwner.current

    AdaptiveIconButton(
        onClick = {
            bp?.backDispatcher?.onBackPress()
        },
        enabled = enabled
    ){
        Icon(
            imageVector = icon,
            contentDescription = contentDescription
        )
    }
}