package com.github.alexzhirkevich.lookandfeel.components

import androidx.compose.runtime.Composable
import com.github.alexzhirkevich.lookandfeel.theme.LookAndFeel
import com.github.alexzhirkevich.lookandfeel.theme.currentLookAndFeel

@Composable
inline fun AdaptiveView(
    content : @Composable (LookAndFeel) -> Unit
) = content(currentLookAndFeel)
