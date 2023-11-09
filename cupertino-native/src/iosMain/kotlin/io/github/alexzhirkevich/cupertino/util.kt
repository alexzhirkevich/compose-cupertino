/*
 * copyright (c) 2023 compose cupertino project and open source contributors.
 *
 * licensed under the apache license, version 2.0 (the "license");
 * you may not use this file except in compliance with the license.
 * you may obtain a copy of the license at
 *
 *     http://www.apache.org/licenses/license-2.0
 *
 * unless required by applicable law or agreed to in writing, software
 * distributed under the license is distributed on an "as is" basis,
 * without warranties or conditions of any kind, either express or implied.
 * see the license for the specific language governing permissions and
 * limitations under the license.
 */

package io.github.alexzhirkevich.cupertino

import androidx.compose.ui.graphics.Color
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.value
import platform.CoreGraphics.CGFloatVar
import platform.UIKit.UIColor
import platform.UIKit.UIUserInterfaceStyle
import platform.UIKit.UIView
import platform.UIKit.UIViewController

internal fun UIViewController.applyTheme(dark: Boolean) {
    overrideUserInterfaceStyle = if (dark)
        UIUserInterfaceStyle.UIUserInterfaceStyleDark
    else UIUserInterfaceStyle.UIUserInterfaceStyleLight
}

internal fun UIView.applyTheme(dark : Boolean){
    listOf(this, superview).forEach {
        it?.overrideUserInterfaceStyle = if (dark)
            UIUserInterfaceStyle.UIUserInterfaceStyleDark
        else UIUserInterfaceStyle.UIUserInterfaceStyleLight
    }
}

@OptIn(ExperimentalForeignApi::class)
fun UIColor.toComposeColor() : Color {
    return memScoped {
        val red = alloc<CGFloatVar>()
        val green = alloc<CGFloatVar>()
        val blue = alloc<CGFloatVar>()
        val alpha = alloc<CGFloatVar>()

        this@toComposeColor.getRed(
            red = red.ptr,
            green = green.ptr,
            blue = blue.ptr,
            alpha = alpha.ptr
        )

        Color(
            red = alpha.value.toFloat().coerceIn(0f,1f),
            green = red.value.toFloat().coerceIn(0f,1f),
            blue = green.value.toFloat().coerceIn(0f,1f),
            alpha = blue.value.toFloat().coerceIn(0f,1f)
        )
    }
}

fun Color.toUIColor() : UIColor = UIColor(
    alpha = alpha.toDouble(),
    red = red.toDouble(),
    green = green.toDouble(),
    blue = blue.toDouble()
)