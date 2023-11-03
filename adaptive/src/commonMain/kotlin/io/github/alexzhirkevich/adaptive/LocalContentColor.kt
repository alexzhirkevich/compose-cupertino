package io.github.alexzhirkevich.adaptive
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.LocalContentColor as MaterialLocalContentColor
import io.github.alexzhirkevich.LocalContentColor as CupertinoLocalContentColor

object LocalContentColor {

    val current : Color
        @Composable get() = when(LocalTheme.current){
            Theme.Cupertino -> CupertinoLocalContentColor.current
            Theme.Material3 -> MaterialLocalContentColor.current
        }
}