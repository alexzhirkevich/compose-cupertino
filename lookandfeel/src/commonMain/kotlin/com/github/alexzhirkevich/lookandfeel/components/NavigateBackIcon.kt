package com.github.alexzhirkevich.lookandfeel.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.offset
import androidx.compose.material3.Icon
import androidx.compose.material.LocalContentColor
import androidx.compose.material.icons.Icons
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import com.github.alexzhirkevich.lookandfeel.icons.AdaptiveArrowBack
import com.github.alexzhirkevich.lookandfeel.theme.AdaptiveTheme
import com.github.alexzhirkevich.lookandfeel.theme.LookAndFeel
import com.github.alexzhirkevich.lookandfeel.theme.currentLookAndFeel
import com.github.alexzhirkevich.lookandfeel.util.LocalizedStrings
import com.github.alexzhirkevich.lookandfeel.util.localized
import moe.tlaster.precompose.ui.LocalBackDispatcherOwner



@Composable
fun NavigateBackIcon(
    enabled : Boolean = true,
    icon : ImageVector = Icons.Default.AdaptiveArrowBack,
    colors : IconButtonColors = IconButtonDefaults.iconButtonColors(),
    contentDescription : String? = LocalizedStrings.Back.localized()
) {

    val bp = LocalBackDispatcherOwner.current

    AdaptiveIconButton(
        modifier = Modifier.offset(
            //iOS back icon is aligned to start
            x = when{
                currentLookAndFeel != LookAndFeel.Cupertino -> 0.dp
                LocalLayoutDirection.current == LayoutDirection.Ltr -> (-10).dp
                else -> 10.dp
            }
        ),
        onClick = { bp?.backDispatcher?.onBackPress() },
        enabled = enabled,
        colors = colors
    ) {
        Icon(
            imageVector = icon,
            contentDescription = contentDescription
        )
    }
}