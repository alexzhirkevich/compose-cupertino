package io.github.alexzhirkevich.cupertino

import androidx.compose.foundation.systemGestureExclusion as androidSystemGestureExclusion
import androidx.compose.ui.Modifier

internal actual fun Modifier.systemGestureExclusion() = androidSystemGestureExclusion()