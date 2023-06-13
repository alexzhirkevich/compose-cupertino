package com.github.alexzhirkevich.lookandfeel.components.cupertino

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import com.github.alexzhirkevich.lookandfeel.util.isIOSVersionAtLeast
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.value
import platform.CoreGraphics.CGFloat
import platform.CoreGraphics.CGFloatVar
import platform.CoreImage.CIColor
import platform.UIKit.UIApplication
import platform.UIKit.UIColor
import platform.UIKit.UIColorPickerViewController
import platform.UIKit.UIColorPickerViewControllerDelegateProtocol
import platform.darwin.NSObject

/**
 * Native iOS color picker sheet. Available for iOS 14+
 *
 * On other platforms and iOS < 14 [CupertinoColorPickerDialog] will be used
 * */
@Composable
actual fun CupertinoColorPickerDialogNative(
    color: Color,
    onColorChanged: (Color) -> Unit,
    onDismissRequest: () -> Unit,
    supportOpacity: Boolean
) {

    val updatedColorChanged by rememberUpdatedState(onColorChanged)
    if (isIOSVersionAtLeast(14)) {
        PresentableDialog(
            factory = {
                UIColorPickerViewController().apply {
                    setDelegate(object : NSObject(), UIColorPickerViewControllerDelegateProtocol {
                        override fun colorPickerViewControllerDidSelectColor(
                            viewController: UIColorPickerViewController
                        ) {
                            updatedColorChanged(viewController.selectedColor.compose)
                        }
                    })
                }
            },
            update = {
                supportsAlpha = supportOpacity
                selectedColor = color.ui
            },
            onDismissRequest = onDismissRequest,
            supportOpacity, color
        )
    } else {
        CupertinoColorPicker(
            color = color,
            onColorChanged = onColorChanged,
            onCloseClicked = onDismissRequest,
            supportOpacity = supportOpacity
        )
    }
}

val Color.ui : UIColor get() = UIColor(
    alpha = alpha.toDouble(),
    red = red.toDouble(),
    green = green.toDouble(),
    blue = blue.toDouble()
)

val UIColor.compose : Color get() {
    memScoped {

        val (a, r, g, b) = List(4) {
            alloc<CGFloatVar>()
        }

        getRed(
            red = r.ptr,
            green = g.ptr,
            blue = b.ptr,
            alpha = a.ptr
        )

        //TODO: support colorSpace
        return Color(
            alpha = a.value.toFloat().coerceIn(0f, 1f),
            red = r.value.toFloat().coerceIn(0f, 1f),
            green = g.value.toFloat().coerceIn(0f, 1f),
            blue = b.value.toFloat().coerceIn(0f, 1f),
        )
    }
}