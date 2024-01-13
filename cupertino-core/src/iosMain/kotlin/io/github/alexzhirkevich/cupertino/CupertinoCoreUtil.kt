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

import androidx.compose.ui.graphics.Color
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.value
import platform.CoreGraphics.CGFloatVar
import platform.UIKit.UIColor

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
            alpha = alpha.value.toFloat().coerceIn(0f,1f),
            red = red.value.toFloat().coerceIn(0f,1f),
            green = green.value.toFloat().coerceIn(0f,1f),
            blue = blue.value.toFloat().coerceIn(0f,1f),
        )
    }
}

fun Color.toUIColor() : UIColor = UIColor(
    alpha = alpha.toDouble(),
    red = red.toDouble(),
    green = green.toDouble(),
    blue = blue.toDouble()
)