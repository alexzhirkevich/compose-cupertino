package com.github.alexzhirkevich.lookandfeel.util

import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector

/**
 * @param imageVector image on non-Apple targets
 * @param systemName name of the Apple sf symbol system image on iOS/iPadOS/MacOs
 * @param contentDescription text used by accessibility services to describe what this icon
 * represents. This should always be provided unless this icon is used for decorative purposes, and
 * does not represent a meaningful action that a user can take. This text should be localized, such
 * as by using [androidx.compose.ui.res.stringResource] or similar
 * @param modifier the [Modifier] to be applied to this icon
 * @param tint tint to be applied to [imageVector]. If [Color.Unspecified] is provided, then no tint
 * is applied.
*/
@Composable
expect fun AdaptiveIcon(
    imageVector : ImageVector,
    systemName : String?,
    contentDescription : String?,
    modifier: Modifier = Modifier,
    tint: Color = LocalContentColor.current
)

/**
 * @param bitmap image on non-Apple targets
 * @param systemName name of the Apple sf symbol system image on iOS/iPadOS/MacOs
 * @param contentDescription text used by accessibility services to describe what this icon
 * represents. This should always be provided unless this icon is used for decorative purposes, and
 * does not represent a meaningful action that a user can take. This text should be localized, such
 * as by using [androidx.compose.ui.res.stringResource] or similar
 * @param modifier the [Modifier] to be applied to this icon
 * @param tint tint to be applied to [imageVector]. If [Color.Unspecified] is provided, then no tint
 * is applied.
 */
@Composable
expect fun AdaptiveIcon(
    bitmap : ImageBitmap,
    systemName : String?,
    contentDescription : String?,
    modifier: Modifier = Modifier,
    tint: Color = LocalContentColor.current
)

/**
 * @param painter image on non-Apple targets
 * @param systemName name of the Apple sf symbol system image on iOS/iPadOS/MacOs
 * @param contentDescription text used by accessibility services to describe what this icon
 * represents. This should always be provided unless this icon is used for decorative purposes, and
 * does not represent a meaningful action that a user can take. This text should be localized, such
 * as by using [androidx.compose.ui.res.stringResource] or similar
 * @param modifier the [Modifier] to be applied to this icon
 * @param tint tint to be applied to [imageVector]. If [Color.Unspecified] is provided, then no tint
 * is applied.
 */
@Composable
expect fun AdaptiveIcon(
    painter : Painter,
    systemName : String?,
    contentDescription : String?,
    modifier: Modifier = Modifier,
    tint: Color = LocalContentColor.current
)

