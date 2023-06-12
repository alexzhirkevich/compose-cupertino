package com.github.alexzhirkevich.lookandfeel.util

import androidx.compose.runtime.Composable
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.readValue
import platform.Foundation.NSOperatingSystemVersion
import platform.Foundation.NSProcessInfo

@Composable
fun isIOSVersionAtLeast(
    major : Int,
    minor : Int = 0
) : Boolean = memScoped {
    val v = alloc<NSOperatingSystemVersion>().apply {
        majorVersion = major.toLong()
        minorVersion = minor.toLong()
    }
    return NSProcessInfo.processInfo.isOperatingSystemAtLeastVersion(v.readValue())
}