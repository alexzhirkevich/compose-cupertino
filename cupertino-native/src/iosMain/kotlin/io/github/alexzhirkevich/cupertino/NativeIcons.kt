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

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.toComposeImageBitmap
import io.github.alexzhirkevich.cupertino.icons.CupertinoIcons
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.addressOf
import kotlinx.cinterop.usePinned
import org.jetbrains.skia.Image
import platform.UIKit.UIImage
import platform.UIKit.UIImagePNGRepresentation
import platform.posix.memcpy

/**
 * Returns iOS system SF Symbol with given [systemName].
 *
 * Use [ImageBitmap.Companion.systemImage] to create this image without composable context.
 *
 * @see <a href="https://developer.apple.com/sf-symbols/">SF Symbols</a>
 * */
@Composable
fun CupertinoIcons.named(systemName : String) : Painter {
    return remember(systemName) {
        BitmapPainter(ImageBitmap.systemImage(systemName))
    }
}

/**
 * Get iOS/iPadOS/macOS system image (SF Symbol) with given [systemName].
 * Must be remembered for inline Compose usage.
 *
 * @see <a href="https://developer.apple.com/sf-symbols/">SF Symbols</a>
 * @see CupertinoIcons.named
 * */
fun ImageBitmap.Companion.systemImage(systemName: String) : ImageBitmap {
    return requireNotNull(UIImage.systemImageNamed(systemName)) {
        "Image with name $systemName not found"
    }.toComposeImageBitmap()
}


@OptIn(ExperimentalForeignApi::class)
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
