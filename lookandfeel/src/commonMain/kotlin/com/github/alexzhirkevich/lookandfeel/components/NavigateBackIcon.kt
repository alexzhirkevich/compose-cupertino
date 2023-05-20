package com.github.alexzhirkevich.lookandfeel.components

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Icon
import androidx.compose.material.LocalContentColor
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
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
    contentColor : Color = LocalContentColor.current,
    contentDescription : String? = LocalizedStrings.Back.localized()
) {
    CompositionLocalProvider(LocalContentColor provides contentColor) {

        val bp = LocalBackDispatcherOwner.current

        AdaptiveIconButton(
            onClick = { bp?.backDispatcher?.onBackPress() },
            enabled = enabled
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = icon,
                    contentDescription = contentDescription
                )

                if (currentLookAndFeel == LookAndFeel.Cupertino) {
                    Text(
                        text = LocalizedStrings.Back.localized(),
                        style = AdaptiveTheme.typography.bodyLarge,
                        color = LocalContentColor.current
                    )
                }
            }
        }
    }
}