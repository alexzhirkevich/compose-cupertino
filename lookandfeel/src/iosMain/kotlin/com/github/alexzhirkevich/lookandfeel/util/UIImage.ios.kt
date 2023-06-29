package com.github.alexzhirkevich.lookandfeel.util

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.toComposeImageBitmap
import kotlinx.cinterop.addressOf
import kotlinx.cinterop.usePinned
import org.jetbrains.skia.Image
import platform.Foundation.NSData
import platform.UIKit.UIImage
import platform.UIKit.UIImagePNGRepresentation
import platform.posix.memcpy

fun ImageBitmapWithSystemName(systemName : String) : ImageBitmap {
    return requireNotNull(UIImage.systemImageNamed(systemName)) {
        "Image with name $systemName not found"
    }.toComposeImageBitmap()
}

@Composable
fun rememberImageBitmapWithSystemName(systemName : String) : ImageBitmap {
    return remember(systemName) {
        ImageBitmapWithSystemName(systemName)
    }
}

fun UIImage.toComposeImageBitmap() : ImageBitmap{
    val bytes = requireNotNull(UIImagePNGRepresentation(this)) {
        "Failed to get PNG representation of image"
    }

    return Image.makeFromEncoded(bytes.toByteArray())
        .toComposeImageBitmap()
}

fun NSData.toByteArray(): ByteArray = ByteArray(this@toByteArray.length.toInt()).apply {
    usePinned {
        memcpy(it.addressOf(0), this@toByteArray.bytes, this@toByteArray.length)
    }
}