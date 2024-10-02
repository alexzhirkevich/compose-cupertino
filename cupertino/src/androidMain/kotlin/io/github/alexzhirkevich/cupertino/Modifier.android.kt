package io.github.alexzhirkevich.cupertino

import androidx.compose.ui.Modifier
import androidx.compose.foundation.systemGestureExclusion as androidSystemGestureExclusion

internal actual fun Modifier.systemGestureExclusion() = androidSystemGestureExclusion()