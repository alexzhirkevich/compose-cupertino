package io.github.alexzhirkevich.adaptive
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.LocalContentColor as MaterialLocalContentColor
import io.github.alexzhirkevich.LocalContentColor as CupertinoLocalContentColor

object LocalContentColor {

    val current : Color
        @Composable get() = when(LocalThemeTarget.current){
            ThemeTarget.Cupertino -> CupertinoLocalContentColor.current
            ThemeTarget.Material3 -> MaterialLocalContentColor.current
        }
}