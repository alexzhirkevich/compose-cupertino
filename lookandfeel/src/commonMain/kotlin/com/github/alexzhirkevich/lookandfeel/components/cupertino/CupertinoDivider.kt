package com.github.alexzhirkevich.lookandfeel.components.cupertino

import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.github.alexzhirkevich.lookandfeel.theme.AdaptiveTheme

@Composable
fun CupertinoDivider(modifier: Modifier = Modifier) {
    Divider(
        modifier = modifier,
        thickness = .5.dp,
        color = AdaptiveTheme.colorScheme
            .outlineVariant.copy(alpha = .25f)
    )
}