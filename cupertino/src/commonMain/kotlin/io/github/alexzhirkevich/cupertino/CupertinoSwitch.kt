/*
 * Copyright (c) 2023-2024. Compose Cupertino project and open source contributors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */


package io.github.alexzhirkevich.cupertino

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.LocalContentColor
import io.github.alexzhirkevich.cupertino.theme.CupertinoColors
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.cupertino.theme.Gray
import io.github.alexzhirkevich.cupertino.theme.systemGreen
import kotlinx.coroutines.flow.drop
import kotlinx.coroutines.flow.filterNotNull

/**
 * Cupertino Design Switch.
 *
 * Switches toggle the state of a single item on or off.
 *
 * @param checked whether or not this switch is checked
 * @param onCheckedChange called when this switch is clicked. If `null`, then this switch will not
 * be interactable, unless something else handles its input events and updates its state.
 * @param modifier the [Modifier] to be applied to this switch
 * @param thumbContent content that will be drawn inside the thumb
 * @param enabled controls the enabled state of this switch. When `false`, this component will not
 * respond to user input, and it will appear visually disabled and disabled to accessibility
 * services.
 * @param colors [CupertinoSwitchColors] that will be used to resolve the colors used for this switch in
 * different states. See [CupertinoSwitchDefaults.colors].
 * @param interactionSource the [MutableInteractionSource] representing the stream of [Interaction]s
 * for this switch. You can create and pass in your own `remember`ed instance to observe
 * [Interaction]s and customize the appearance / behavior of this switch in different states.
 */
@OptIn(InternalCupertinoApi::class)
@Composable
fun CupertinoSwitch(
    checked : Boolean,
    onCheckedChange : (Boolean) -> Unit,
    modifier : Modifier = Modifier,
    thumbContent: @Composable (() -> Unit)? = null,
    colors : CupertinoSwitchColors = CupertinoSwitchDefaults.colors(),
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {

    val isPressed by interactionSource.collectIsPressedAsState()
    val isHovered by interactionSource.collectIsHoveredAsState()

    val animatedAspectRatio by animateFloatAsState(
        targetValue = if (isPressed || isHovered) 1.25f else 1f,
        animationSpec = AspectRationAnimationSpec
    )
    val animatedBackground by animateColorAsState(
        targetValue = colors.trackColor(enabled, checked).value,
        animationSpec = ColorAnimationSpec
    )
    val animatedAlignment by animateFloatAsState(
        targetValue = if (checked) 1f else -1f,
        animationSpec = AlignmentAnimationSpec
    )

    val haptic = LocalHapticFeedback.current

    val positionalThreshold = remember {
        (CupertinoSwitchDefaults.Width - ThumbPadding * 2) -
                CupertinoSwitchDefaults.Height
    }

    val density = LocalDensity.current

    val dragThreshold= density.run {
        positionalThreshold.toPx()
    }

    var dragDistance by remember {
        mutableFloatStateOf(0f)
    }

    val updatedChecked by rememberUpdatedState(checked)

    LaunchedEffect(0) {
        snapshotFlow {
            updatedChecked
        }.drop(1).collect {
            haptic.performHapticFeedback(CupertinoHapticFeedback.ImpactLight)
        }
    }

    LaunchedEffect(dragThreshold) {
        snapshotFlow {
            when  {
                dragDistance < 0f -> false
                dragDistance > dragThreshold -> true
                else -> null
            }
        }.filterNotNull().collect(onCheckedChange)
    }

    Column(
        modifier
            .toggleable(
                value = checked,
                onValueChange = onCheckedChange,
                enabled = enabled,
                role = Role.Switch,
                interactionSource = interactionSource,
                indication = null
            )
            .wrapContentSize(Alignment.Center)
            .requiredSize(CupertinoSwitchDefaults.Width, CupertinoSwitchDefaults.Height)
            .clip(CupertinoSwitchDefaults.Shape)
            .drawBehind {
                drawRect(animatedBackground)
            }
            .padding(ThumbPadding),
    ) {
        Box(
            Modifier
                .fillMaxHeight()
                .aspectRatio(animatedAspectRatio)
                .pointerInput(dragThreshold){
                    detectHorizontalDragGestures(
                        onDragStart = {
                            dragDistance = if (updatedChecked) dragThreshold else 0f
                        },
                        onHorizontalDrag = { c, v ->
                            dragDistance += v
                        }
                    )
                }
                .align(BiasAlignment.Horizontal(animatedAlignment))
                .let {
                    if (enabled) {
                        it.shadow(
                            elevation = CupertinoSwitchDefaults.EnabledThumbElevation,
                            shape = CupertinoSwitchDefaults.Shape
                        )
                    } else it.clip(CupertinoSwitchDefaults.Shape)
                }
                .background(colors.thumbColor(enabled).value)
        ){
            CompositionLocalProvider(
                LocalContentColor provides colors.iconColor(enabled, checked).value
            ) {
                thumbContent?.invoke()
            }
        }
    }
}

/**
 * Represents the colors used by a [Switch] in different states
 *
 * See [SwitchDefaults.colors] for the default implementation that follows Material
 * specifications.
 */
@Immutable
class CupertinoSwitchColors internal constructor(
    private val thumbColor: Color,
    private val disabledThumbColor: Color,
    private val checkedTrackColor: Color,
    private val checkedIconColor: Color,
    private val uncheckedTrackColor: Color,
    private val uncheckedIconColor: Color,
    private val disabledCheckedTrackColor: Color,
    private val disabledCheckedIconColor: Color,
    private val disabledUncheckedTrackColor: Color,
    private val disabledUncheckedIconColor: Color
) {
    /**
     * Represents the color used for the switch's thumb, depending on [enabled] and [checked].
     *
     * @param enabled whether the Switch is enabled or not
     */
    @Composable
    internal fun thumbColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(
            if (enabled) {
                thumbColor
            } else {
                disabledThumbColor
            }
        )
    }

    /**
     * Represents the color used for the switch's track, depending on [enabled] and [checked].
     *
     * @param enabled whether the Switch is enabled or not
     * @param checked whether the Switch is checked or not
     */
    @Composable
    internal fun trackColor(enabled: Boolean, checked: Boolean): State<Color> {
        return rememberUpdatedState(
            if (enabled) {
                if (checked) checkedTrackColor else uncheckedTrackColor
            } else {
                if (checked) disabledCheckedTrackColor else disabledUncheckedTrackColor
            }
        )
    }

    /**
     * Represents the content color passed to the icon if used
     *
     * @param enabled whether the Switch is enabled or not
     * @param checked whether the Switch is checked or not
     */
    @Composable
    internal fun iconColor(enabled: Boolean, checked: Boolean): State<Color> {
        return rememberUpdatedState(
            if (enabled) {
                if (checked) checkedIconColor else uncheckedIconColor
            } else {
                if (checked) disabledCheckedIconColor else disabledUncheckedIconColor
            }
        )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is CupertinoSwitchColors) return false

        if (thumbColor != other.thumbColor) return false
        if (checkedTrackColor != other.checkedTrackColor) return false
        if (checkedIconColor != other.checkedIconColor) return false
        if (uncheckedTrackColor != other.uncheckedTrackColor) return false
        if (uncheckedIconColor != other.uncheckedIconColor) return false
        if (disabledThumbColor != other.disabledThumbColor) return false
        if (disabledCheckedTrackColor != other.disabledCheckedTrackColor) return false
        if (disabledCheckedIconColor != other.disabledCheckedIconColor) return false
        if (disabledUncheckedTrackColor != other.disabledUncheckedTrackColor) return false
        if (disabledUncheckedIconColor != other.disabledUncheckedIconColor) return false

        return true
    }

    override fun hashCode(): Int {
        var result = thumbColor.hashCode()
        result = 31 * result + checkedTrackColor.hashCode()
        result = 31 * result + checkedIconColor.hashCode()
        result = 31 * result + uncheckedTrackColor.hashCode()
        result = 31 * result + uncheckedIconColor.hashCode()
        result = 31 * result + disabledThumbColor.hashCode()
        result = 31 * result + disabledCheckedTrackColor.hashCode()
        result = 31 * result + disabledCheckedIconColor.hashCode()
        result = 31 * result + disabledUncheckedTrackColor.hashCode()
        result = 31 * result + disabledUncheckedIconColor.hashCode()
        return result
    }
}

@Immutable
object CupertinoSwitchDefaults {

    internal val EnabledThumbElevation = 4.dp

    val Width : Dp = 51.dp

    val Height : Dp  = 31.dp

    internal val Shape : CornerBasedShape = CircleShape

    @Composable
    @ReadOnlyComposable
    fun colors(
        thumbColor: Color = Color.White,
        disabledThumbColor: Color = thumbColor,
        checkedTrackColor: Color = CupertinoColors.systemGreen,
        checkedIconColor: Color = CupertinoTheme.colorScheme.opaqueSeparator,
        uncheckedTrackColor: Color = CupertinoColors.Gray.copy(
            alpha = .33f
        ),
        uncheckedIconColor: Color = checkedIconColor,
        disabledCheckedTrackColor: Color = checkedTrackColor.copy(alpha = .33f),
        disabledCheckedIconColor: Color = checkedIconColor,
        disabledUncheckedTrackColor: Color = uncheckedTrackColor,
        disabledUncheckedIconColor: Color = checkedIconColor,
    ) : CupertinoSwitchColors = CupertinoSwitchColors(
        thumbColor = thumbColor,
        disabledThumbColor = disabledThumbColor,
        checkedTrackColor = checkedTrackColor,
        checkedIconColor = checkedIconColor,
        uncheckedTrackColor = uncheckedTrackColor,
        uncheckedIconColor = uncheckedIconColor,
        disabledCheckedTrackColor = disabledCheckedTrackColor,
        disabledCheckedIconColor = disabledCheckedIconColor,
        disabledUncheckedTrackColor = disabledUncheckedTrackColor,
        disabledUncheckedIconColor = disabledUncheckedIconColor
    )
}

private val ThumbPadding = 2.dp

private val AspectRationAnimationSpec = cupertinoTween<Float>(durationMillis = 300)
private val ColorAnimationSpec = cupertinoTween<Color>(durationMillis = 300)
private val AlignmentAnimationSpec = AspectRationAnimationSpec
