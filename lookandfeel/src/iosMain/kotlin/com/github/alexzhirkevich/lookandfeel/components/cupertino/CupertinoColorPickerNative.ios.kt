package com.github.alexzhirkevich.lookandfeel.components.cupertino

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import com.github.alexzhirkevich.lookandfeel.util.isIOSVersionAtLeast
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
    if (isIOSVersionAtLeast(14)) {
        val delegate = remember {
            object : NSObject(), UIColorPickerViewControllerDelegateProtocol {
                override fun colorPickerViewControllerDidSelectColor(
                    viewController: UIColorPickerViewController
                ) {
                    onColorChanged(viewController.selectedColor.compose)
                }
            }
        }

        PresentableDialog(
            factory = {
                UIColorPickerViewController().apply {
                    setDelegate(delegate)
                }
            },
            update = {
                supportsAlpha = supportOpacity
                selectedColor = color.ui
            },
            onDismissRequest = onDismissRequest,
            supportOpacity, color.ui
        )
    } else {
        println("Color picker not supported for ios < 14")
    }
}

//@Composable
//fun CupertinoColorPickerNative(
//    color: Color,
//    onColorChanged: (Color) -> Unit,
//    supportOpacity: Boolean
//) {
//
//    todo check ios 14+

//    val dark = isDark
//    val controller = remember(supportOpacity) {
//        UIColorPickerViewController().apply {
//            supportsAlpha = supportOpacity
//            applyTheme(dark)
//            selectedColor = color.ui
//        }
//    }
//    UIKitView(
//        modifier = Modifier
//            .fillMaxWidth()
//            .height(230.dp),
//        background = AdaptiveTheme.colorScheme.surface,
//        factory = remember(controller) {
//            {
//                controller.view
//            }
//        },
//        update = {
//            controller.selectedColor = color.ui
//        },
//        onRelease = {
//
//        }
//    )
//}

val Color.ui : UIColor get() = UIColor(
    alpha = alpha.toDouble(),
    red = red.toDouble(),
    green = green.toDouble(),
    blue = blue.toDouble()
)

val UIColor.compose : Color get() = Color(
    alpha = CIColor.alpha.toFloat(),
    red = CIColor.red.toFloat(),
    green = CIColor.green.toFloat(),
    blue = CIColor.blue.toFloat()
)