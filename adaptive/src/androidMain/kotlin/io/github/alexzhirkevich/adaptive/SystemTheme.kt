package io.github.alexzhirkevich.adaptive

import android.os.Build
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

@Composable
internal actual fun systemMaterialColorScheme(dark : Boolean) : ColorScheme? {

    if (Build.VERSION.SDK_INT < Build.VERSION_CODES.S)
        return null

    return if (dark)
        dynamicDarkColorScheme(LocalContext.current)
    else
        dynamicLightColorScheme(LocalContext.current)
}
