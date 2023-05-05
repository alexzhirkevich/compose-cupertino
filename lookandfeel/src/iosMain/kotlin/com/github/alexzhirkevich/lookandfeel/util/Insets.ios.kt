package com.github.alexzhirkevich.lookandfeel.util

import androidx.compose.animation.core.AnimationConstants
import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.Easing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import kotlinx.cinterop.ObjCAction
import kotlinx.cinterop.useContents
import platform.CoreGraphics.CGFloat
import platform.Foundation.NSNotification
import platform.Foundation.NSNotificationCenter
import platform.Foundation.NSNumber
import platform.Foundation.NSSelectorFromString
import platform.Foundation.NSValue
import platform.UIKit.CGRectValue
import platform.UIKit.UIApplication
import platform.UIKit.UICubicTimingParameters
import platform.UIKit.UIEdgeInsets
import platform.UIKit.UIViewAnimationCurve
import platform.darwin.NSInteger
import platform.darwin.NSObject
import kotlin.math.roundToInt

actual val WindowInsets.Companion.ime : WindowInsets
    @Composable get() {
        val kb = rememberKeyboardAnimation()

        val animatedHeight by animateFloatAsState(
            targetValue = kb.height,
            animationSpec = tween(
                durationMillis = kb.duration,
                easing = kb.easing
            )
        )
        return WindowInsets(bottom = animatedHeight.dp)
    }

actual val WindowInsets.Companion.statusBars : WindowInsets
    @Composable get() = IosInsets.only(WindowInsetsSides.Top)

actual val WindowInsets.Companion.navigationBars : WindowInsets
    @Composable get() = IosInsets.only(WindowInsetsSides.Bottom)

actual val WindowInsets.Companion.safeContent : WindowInsets
    @Composable get() = IosInsets

private data class KeyboardAnimationProperties(
    val height : Float,
    val duration : Int,
    val easing : Easing,
)

private val DefaultKeyboardEasing = CubicBezierEasing(.17f, .59f, .4f, .77f)

private object IosInsets : WindowInsets {

    val safeAreaInsets by lazy {
        UIApplication.sharedApplication.keyWindow?.safeAreaInsets
    }

    override fun getTop(density: Density): Int = get(density) { it.top }

    override fun getLeft(density: Density, layoutDirection: LayoutDirection): Int =
        get(density) { if (layoutDirection == LayoutDirection.Ltr) it.left else it.right }
    override fun getRight(density: Density, layoutDirection: LayoutDirection): Int =
        get(density) { if (layoutDirection == LayoutDirection.Ltr) it.right else it.left }
    override fun getBottom(density: Density): Int = get(density) { it.bottom }

    private fun get(density: Density, block: (UIEdgeInsets) -> CGFloat): Int {
        return if (safeAreaInsets != null) {
            val topInset = safeAreaInsets?.useContents { block(this) }?.toFloat() ?: 0f
            (topInset * density.density).toInt()
        } else 0
    }
}


@Composable
private fun rememberKeyboardAnimation() : KeyboardAnimationProperties {

    var keyboardAnimationProperties by remember {
        mutableStateOf(
            KeyboardAnimationProperties(
                height = 0f,
                duration = AnimationConstants.DefaultDurationMillis,
                easing = DefaultKeyboardEasing
            )
        )
    }

    val listener = remember {
        object : NSObject() {

            private fun NSNotification.toKeyboardAnimationProperties(): KeyboardAnimationProperties {
                val keyboardInfo = userInfo!!["UIKeyboardFrameEndUserInfoKey"] as NSValue
                val curveValue = userInfo!!["UIKeyboardAnimationCurveUserInfoKey"] as? NSInteger
                val duration = userInfo!!["UIKeyboardAnimationDurationUserInfoKey"] as? NSNumber

                val keyboardDuration = duration?.doubleValue?.times(1000)?.roundToInt()
                    ?: AnimationConstants.DefaultDurationMillis

                val animationCurve = UIViewAnimationCurve.values().find { it.value == curveValue }

                val easing = if (animationCurve != null) {
                    val cubic = UICubicTimingParameters(animationCurve)

                    val first = cubic.controlPoint1.useContents { this }
                    val second = cubic.controlPoint2.useContents { this }
                    CubicBezierEasing(
                        a = first.x.toFloat(),
                        b = first.y.toFloat(),
                        c = second.x.toFloat(),
                        d = second.y.toFloat()
                    )
                } else DefaultKeyboardEasing

                val keyboardHeight = keyboardInfo.CGRectValue().useContents { size.height }

                return KeyboardAnimationProperties(
                    height = keyboardHeight.toFloat(),
                    duration = keyboardDuration,
                    easing = easing
                )
            }

            @Suppress("unused")
            @ObjCAction
            fun keyboardWillShow(arg: NSNotification) {
                keyboardAnimationProperties = arg.toKeyboardAnimationProperties()
            }

            @Suppress("unused")
            @ObjCAction
            fun keyboardWillHide(arg: NSNotification) {
                keyboardAnimationProperties = arg.toKeyboardAnimationProperties().copy(
                    height = 0f
                )
            }
        }
    }

    DisposableEffect(0) {
        val listeners = listOf(
            platform.UIKit.UIKeyboardWillShowNotification to "keyboardWillShow:",
            platform.UIKit.UIKeyboardWillHideNotification to "keyboardWillHide:",
            platform.UIKit.UIKeyboardWillChangeFrameNotification to "keyboardWillShow:"
        )
        listeners.forEach {
            NSNotificationCenter.defaultCenter.addObserver(
                observer = listener,
                selector = NSSelectorFromString(it.second),
                name = it.first,
                `object` = null
            )
        }
        onDispose {
            listeners.forEach {
                NSNotificationCenter.defaultCenter.removeObserver(
                    observer = listener,
                    name = it.first,
                    `object` = null
                )
            }
        }
    }

    return keyboardAnimationProperties
}
