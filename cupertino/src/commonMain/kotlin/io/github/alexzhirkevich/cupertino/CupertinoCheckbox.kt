package io.github.alexzhirkevich.cupertino

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.selection.triStateToggleable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathMeasure
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.lerp
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme


@Composable
fun CupertinoCheckBox(
    checked: Boolean,
    onCheckedChange: ((Boolean) -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: CupertinoCheckboxColors = CupertinoCheckboxDefaults.colors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    CupertinoTriStateCheckBox(
        state = ToggleableState(checked),
        onClick = if (onCheckedChange != null) {
            { onCheckedChange(!checked) }
        } else {
            null
        },
        modifier = modifier,
        enabled = enabled,
        colors = colors,
        interactionSource = interactionSource
    )
}

@Composable
fun CupertinoTriStateCheckBox(
    state: ToggleableState,
    onClick: (() -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: CupertinoCheckboxColors = CupertinoCheckboxDefaults.colors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    val toggleableModifier =
    if (onClick != null) {
        @Suppress("DEPRECATION_ERROR")
        Modifier.triStateToggleable(
            state = state,
            onClick = onClick,
            enabled = enabled,
            role = Role.Checkbox,
            interactionSource = interactionSource,
            indication = LocalIndication.current
        )
    } else {
        Modifier
    }
    CheckboxImpl(
        enabled = enabled,
        value = state,
        modifier = modifier
            .defaultMinSize(24.dp, 24.dp)
            .padding(4.dp)
            .clip(CircleShape)
            .then(toggleableModifier),
        colors = colors
    )
}

@Stable
object CupertinoCheckboxDefaults {

    @Composable
    fun colors(
        checkedCheckmarkColor: Color = CupertinoTheme.colorScheme.systemBackground,
        uncheckedCheckmarkColor: Color = Color.Transparent,
        checkedBoxColor: Color = CupertinoTheme.colorScheme.accent,
        uncheckedBoxColor: Color = Color.Transparent,
        disabledCheckedBoxColor: Color = CupertinoTheme.colorScheme.secondarySystemBackground,
        disabledUncheckedBoxColor: Color = uncheckedBoxColor,
        disabledIndeterminateBoxColor: Color = disabledCheckedBoxColor,
        checkedBorderColor: Color = Color.Transparent,
        uncheckedBorderColor: Color = CupertinoTheme.colorScheme.systemFill,
        disabledBorderColor: Color = checkedBorderColor,
        disabledUncheckedBorderColor: Color = CupertinoTheme.colorScheme.quaternarySystemFill,
        disabledIndeterminateBorderColor: Color = disabledBorderColor
    ) : CupertinoCheckboxColors = CupertinoCheckboxColors(
        checkedCheckmarkColor = checkedCheckmarkColor,
        uncheckedCheckmarkColor = uncheckedCheckmarkColor,
        checkedBoxColor = checkedBoxColor,
        uncheckedBoxColor = uncheckedBoxColor,
        disabledCheckedBoxColor = disabledCheckedBoxColor,
        disabledUncheckedBoxColor = disabledUncheckedBoxColor,
        disabledIndeterminateBoxColor = disabledIndeterminateBoxColor,
        checkedBorderColor = checkedBorderColor,
        uncheckedBorderColor = uncheckedBorderColor,
        disabledBorderColor = disabledBorderColor,
        disabledUncheckedBorderColor = disabledUncheckedBorderColor,
        disabledIndeterminateBorderColor = disabledIndeterminateBorderColor
    )
}


/**
 * Represents the colors used by the three different sections (checkmark, box, and border) of a
 * [Checkbox] or [TriStateCheckbox] in different states.
 *
 * @constructor create an instance with arbitrary colors, see [CupertinoCheckboxDefaults.colors] for the
 * default implementation that follows Material specifications.
 *
 * @param checkedCheckmarkColor color that will be used for the checkmark when checked
 * @param uncheckedCheckmarkColor color that will be used for the checkmark when unchecked
 * @param checkedBoxColor the color that will be used for the box when checked
 * @param uncheckedBoxColor color that will be used for the box when unchecked
 * @param disabledCheckedBoxColor color that will be used for the box when disabled and checked
 * @param disabledUncheckedBoxColor color that will be used for the box when disabled and unchecked
 * @param disabledIndeterminateBoxColor color that will be used for the box and border in a
 * [TriStateCheckbox] when disabled AND in an [ToggleableState.Indeterminate] state.
 * @param checkedBorderColor color that will be used for the border when checked
 * @param uncheckedBorderColor color that will be used for the border when unchecked
 * @param disabledBorderColor color that will be used for the border when disabled and checked
 * @param disabledUncheckedBorderColor color that will be used for the border when disabled and
 * unchecked
 * @param disabledIndeterminateBorderColor color that will be used for the border when disabled and
 * in an [ToggleableState.Indeterminate] state.
 */
@Immutable
class CupertinoCheckboxColors(
    val checkedCheckmarkColor: Color,
    val uncheckedCheckmarkColor: Color,
    val checkedBoxColor: Color,
    val uncheckedBoxColor: Color,
    val disabledCheckedBoxColor: Color,
    val disabledUncheckedBoxColor: Color,
    val disabledIndeterminateBoxColor: Color,
    val checkedBorderColor: Color,
    val uncheckedBorderColor: Color,
    val disabledBorderColor: Color,
    val disabledUncheckedBorderColor: Color,
    val disabledIndeterminateBorderColor: Color
) {
    /**
     * Returns a copy of this CheckboxColors, optionally overriding some of the values.
     * This uses the Color.Unspecified to mean “use the value from the source”
     */
    fun copy(
        checkedCheckmarkColor: Color = this.checkedCheckmarkColor,
        uncheckedCheckmarkColor: Color = this.uncheckedCheckmarkColor,
        checkedBoxColor: Color = this.checkedBoxColor,
        uncheckedBoxColor: Color = this.uncheckedBoxColor,
        disabledCheckedBoxColor: Color = this.disabledCheckedBoxColor,
        disabledUncheckedBoxColor: Color = this.disabledUncheckedBoxColor,
        disabledIndeterminateBoxColor: Color = this.disabledIndeterminateBoxColor,
        checkedBorderColor: Color = this.checkedBorderColor,
        uncheckedBorderColor: Color = this.uncheckedBorderColor,
        disabledBorderColor: Color = this.disabledBorderColor,
        disabledUncheckedBorderColor: Color = this.disabledUncheckedBorderColor,
        disabledIndeterminateBorderColor: Color = this.disabledIndeterminateBorderColor
    ) = CupertinoCheckboxColors(
        checkedCheckmarkColor.takeOrElse { this.checkedCheckmarkColor },
        uncheckedCheckmarkColor.takeOrElse { this.uncheckedCheckmarkColor },
        checkedBoxColor.takeOrElse { this.checkedBoxColor },
        uncheckedBoxColor.takeOrElse { this.uncheckedBoxColor },
        disabledCheckedBoxColor.takeOrElse { this.disabledCheckedBoxColor },
        disabledUncheckedBoxColor.takeOrElse { this.disabledUncheckedBoxColor },
        disabledIndeterminateBoxColor.takeOrElse { this.disabledIndeterminateBoxColor },
        checkedBorderColor.takeOrElse { this.checkedBorderColor },
        uncheckedBorderColor.takeOrElse { this.uncheckedBorderColor },
        disabledBorderColor.takeOrElse { this.disabledBorderColor },
        disabledUncheckedBorderColor.takeOrElse { this.disabledUncheckedBorderColor },
        disabledIndeterminateBorderColor.takeOrElse { this.disabledIndeterminateBorderColor },
    )

    /**
     * Represents the color used for the checkmark inside the checkbox, depending on [state].
     *
     * @param state the [ToggleableState] of the checkbox
     */
    @Composable
    internal fun checkmarkColor(state: ToggleableState): State<Color> {
        val target = if (state == ToggleableState.Off) {
            uncheckedCheckmarkColor
        } else {
            checkedCheckmarkColor
        }

        return rememberUpdatedState(target)
    }

    /**
     * Represents the color used for the box (background) of the checkbox, depending on [enabled]
     * and [state].
     *
     * @param enabled whether the checkbox is enabled or not
     * @param state the [ToggleableState] of the checkbox
     */
    @Composable
    internal fun boxColor(enabled: Boolean, state: ToggleableState): State<Color> {
        val target = if (enabled) {
            when (state) {
                ToggleableState.On, ToggleableState.Indeterminate -> checkedBoxColor
                ToggleableState.Off -> uncheckedBoxColor
            }
        } else {
            when (state) {
                ToggleableState.On -> disabledCheckedBoxColor
                ToggleableState.Indeterminate -> disabledIndeterminateBoxColor
                ToggleableState.Off -> disabledUncheckedBoxColor
            }
        }


        return rememberUpdatedState(target)
    }

    /**
     * Represents the color used for the border of the checkbox, depending on [enabled] and [state].
     *
     * @param enabled whether the checkbox is enabled or not
     * @param state the [ToggleableState] of the checkbox
     */
    @Composable
    internal fun borderColor(enabled: Boolean, state: ToggleableState): State<Color> {
        val target = if (enabled) {
            when (state) {
                ToggleableState.On, ToggleableState.Indeterminate -> checkedBorderColor
                ToggleableState.Off -> uncheckedBorderColor
            }
        } else {
            when (state) {
                ToggleableState.Indeterminate -> disabledIndeterminateBorderColor
                ToggleableState.On -> disabledBorderColor
                ToggleableState.Off -> disabledUncheckedBorderColor
            }
        }

        // If not enabled 'snap' to the disabled state, as there should be no animations between
        // enabled / disabled.
        return  rememberUpdatedState(target)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is CupertinoCheckboxColors) return false

        if (checkedCheckmarkColor != other.checkedCheckmarkColor) return false
        if (uncheckedCheckmarkColor != other.uncheckedCheckmarkColor) return false
        if (checkedBoxColor != other.checkedBoxColor) return false
        if (uncheckedBoxColor != other.uncheckedBoxColor) return false
        if (disabledCheckedBoxColor != other.disabledCheckedBoxColor) return false
        if (disabledUncheckedBoxColor != other.disabledUncheckedBoxColor) return false
        if (disabledIndeterminateBoxColor != other.disabledIndeterminateBoxColor) return false
        if (checkedBorderColor != other.checkedBorderColor) return false
        if (uncheckedBorderColor != other.uncheckedBorderColor) return false
        if (disabledBorderColor != other.disabledBorderColor) return false
        if (disabledUncheckedBorderColor != other.disabledUncheckedBorderColor) return false
        return disabledIndeterminateBorderColor == other.disabledIndeterminateBorderColor
    }

    override fun hashCode(): Int {
        var result = checkedCheckmarkColor.hashCode()
        result = 31 * result + uncheckedCheckmarkColor.hashCode()
        result = 31 * result + checkedBoxColor.hashCode()
        result = 31 * result + uncheckedBoxColor.hashCode()
        result = 31 * result + disabledCheckedBoxColor.hashCode()
        result = 31 * result + disabledUncheckedBoxColor.hashCode()
        result = 31 * result + disabledIndeterminateBoxColor.hashCode()
        result = 31 * result + checkedBorderColor.hashCode()
        result = 31 * result + uncheckedBorderColor.hashCode()
        result = 31 * result + disabledBorderColor.hashCode()
        result = 31 * result + disabledUncheckedBorderColor.hashCode()
        result = 31 * result + disabledIndeterminateBorderColor.hashCode()
        return result
    }
}

@Composable
private fun CheckboxImpl(
    enabled: Boolean,
    value: ToggleableState,
    modifier: Modifier,
    colors: CupertinoCheckboxColors
) {

    val checkColor = colors.checkmarkColor(value)
    val boxColor = colors.boxColor(enabled, value)
    val borderColor = colors.borderColor(enabled, value)

    val checkCache = remember { CheckDrawingCache() }

    val drawFraction = when (value) {
        ToggleableState.On -> 1f
        ToggleableState.Off -> 0f
        ToggleableState.Indeterminate -> 1f
    }

    val checkCenterGravitationShiftFraction = when (value) {
        ToggleableState.On -> 0f
        ToggleableState.Off -> 0f
        ToggleableState.Indeterminate -> 1f
    }
    Canvas(
        modifier
            .wrapContentSize(Alignment.Center)
            .requiredSize(24.dp)
    ) {
        drawCircle(
            color = boxColor.value
        )
        drawCircle(
            color = borderColor.value,
            style = Stroke(width = 3.dp.toPx())
        )

        drawCheck(
            checkColor = checkColor.value,
            checkFraction = drawFraction,
            crossCenterGravitation = checkCenterGravitationShiftFraction,
            strokeWidthPx = 1.5.dp.toPx(),
            drawingCache = checkCache
        )
    }
}

@Immutable
private class CheckDrawingCache(
    val checkPath: Path = Path(),
    val pathMeasure: PathMeasure = PathMeasure(),
    val pathToDraw: Path = Path()
)

private fun DrawScope.drawCheck(
    checkColor: Color,
    checkFraction: Float,
    crossCenterGravitation: Float,
    strokeWidthPx: Float,
    drawingCache: CheckDrawingCache
) {
    val stroke = Stroke(width = strokeWidthPx, cap = StrokeCap.Round)
    val width = size.width
    val checkCrossX = 0.45f
    val checkCrossY = 0.7f
    val leftX = 0.3f
    val leftY = 0.55f
    val rightX = 0.7f
    val rightY = 0.35f

    val gravitatedCrossX = lerp(checkCrossX, 0.5f, crossCenterGravitation)
    val gravitatedCrossY = lerp(checkCrossY, 0.5f, crossCenterGravitation)
    // gravitate only Y for end to achieve center line
    val gravitatedLeftY = lerp(leftY, 0.5f, crossCenterGravitation)
    val gravitatedRightY = lerp(rightY, 0.5f, crossCenterGravitation)

    with(drawingCache) {
        checkPath.reset()
        checkPath.moveTo(width * leftX, width * gravitatedLeftY)
        checkPath.lineTo(width * gravitatedCrossX, width * gravitatedCrossY)
        checkPath.lineTo(width * rightX, width * gravitatedRightY)
        // TODO: replace with proper declarative non-android alternative when ready (b/158188351)
        pathMeasure.setPath(checkPath, false)
        pathToDraw.reset()
        pathMeasure.getSegment(
            0f, pathMeasure.length * checkFraction, pathToDraw, true
        )
    }
    drawPath(drawingCache.pathToDraw, checkColor, style = stroke)
}
