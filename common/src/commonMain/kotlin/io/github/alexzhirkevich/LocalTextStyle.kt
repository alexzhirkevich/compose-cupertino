package io.github.alexzhirkevich


import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle

val LocalTextStyle : ProvidableCompositionLocal<TextStyle>
    @Composable
    get() = LocalTextStyleProvider.current


val LocalTextStyleProvider = staticCompositionLocalOf {
    EmptyLocalTextStyle
}

private val EmptyLocalTextStyle = compositionLocalOf {
    TextStyle()
}