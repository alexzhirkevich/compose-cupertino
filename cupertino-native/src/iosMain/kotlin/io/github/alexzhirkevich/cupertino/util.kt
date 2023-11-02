@file:OptIn(ExperimentalForeignApi::class)

package io.github.alexzhirkevich.cupertino

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.toComposeImageBitmap
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.addressOf
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.usePinned
import kotlinx.cinterop.value
import org.jetbrains.skia.Image
import platform.CoreGraphics.CGFloatVar
import platform.UIKit.UIColor
import platform.UIKit.UIImage
import platform.UIKit.UIImagePNGRepresentation
import platform.UIKit.UIUserInterfaceStyle
import platform.UIKit.UIView
import platform.UIKit.UIViewController
import platform.posix.memcpy

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

/**
 * Get iOS/iPadOS/macOS system image (SF Symbol) with given [systemName].
 * Should be remembered for inline Compose usage.
 *
 * @see rememberSystemImage
 * @see <a href="https://developer.apple.com/sf-symbols/">SF Symbols</a>
 * */
fun ImageBitmap.Companion.systemImage(systemName: String) : ImageBitmap {
    return requireNotNull(UIImage.systemImageNamed(systemName)) {
        "Image with name $systemName not found"
    }.toComposeImageBitmap()
}

@Composable
fun SFSymbol(systemName : String) : Painter {
    return remember(systemName) {
        BitmapPainter(ImageBitmap.systemImage(systemName))
    }
}

fun UIImage.toComposeImageBitmap() : ImageBitmap {

    val bytes = requireNotNull(UIImagePNGRepresentation(this)) {
        "Failed to get PNG representation of image"
    }

    val byteArray = ByteArray(bytes.length.toInt())

    byteArray.usePinned {
        memcpy(it.addressOf(0), bytes.bytes, bytes.length)
    }

    return Image.makeFromEncoded(byteArray)
        .toComposeImageBitmap()
}

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