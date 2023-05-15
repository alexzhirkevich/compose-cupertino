package com.github.alexzhirkevich.lookandfeel.components

import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import com.github.alexzhirkevich.lookandfeel.components.cupertino.CupertinoActivityIndicator
import com.github.alexzhirkevich.lookandfeel.theme.LookAndFeel
import com.github.alexzhirkevich.lookandfeel.theme.currentLookAndFeel

/**
 * Indeterminate progress indicator.
 *
 * Progress indicators express an unspecified wait time or display the duration of a process.
 *
 * @param modifier the [Modifier] to be applied to this activity indicator
 * @param color color of this progress indicator
 * @param strokeWidth stroke width of this progress indicator
 *
 * The [strokeWidth] will be ignored for [LookAndFeel.Cupertino].
 */



@Composable
fun AdaptiveProgressIndicator(
    modifier: Modifier = Modifier,
    color: Color = ProgressIndicatorDefaults.circularColor,
    strokeWidth: Dp = ProgressIndicatorDefaults.CircularStrokeWidth,
) {
    when (currentLookAndFeel) {
        LookAndFeel.Cupertino -> CupertinoActivityIndicator(
            modifier = modifier,
            color = color,
        )

        else -> CircularProgressIndicator(
            modifier = modifier,
            color = color,
            strokeWidth = strokeWidth,
        )
    }
}
