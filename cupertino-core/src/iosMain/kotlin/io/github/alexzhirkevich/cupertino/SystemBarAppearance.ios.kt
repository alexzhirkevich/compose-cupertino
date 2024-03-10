/*
 * Copyright (c) 2024. Compose Cupertino project and open source contributors.
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
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.interop.LocalUIViewController
import org.jetbrains.skiko.OS
import org.jetbrains.skiko.OSVersion
import org.jetbrains.skiko.available
import platform.UIKit.UIApplication
import platform.UIKit.UIStatusBarStyleDarkContent
import platform.UIKit.UIStatusBarStyleLightContent
import platform.UIKit.UIUserInterfaceStyle
import platform.UIKit.UIViewController
import platform.UIKit.setStatusBarStyle

@Composable
@InternalCupertinoApi
actual fun SystemBarAppearance(dark: Boolean) {
    SystemBarAppearance(
        dark = dark,
        viewController = LocalUIViewController.current
    )
}

private val isIosAtLeast17 = available(OS.Ios to OSVersion(major = 17))
private val isIosAtLeast13 = available(OS.Ios to OSVersion(major = 13))

@Composable
@InternalCupertinoApi
fun SystemBarAppearance(dark: Boolean, viewController: UIViewController) {

    if (!isIosAtLeast13)
        return
    DisposableEffect(dark) {

        val prefInterfaceStyle = viewController.overrideUserInterfaceStyle

        val prevStatusBarStyle = UIApplication.sharedApplication.statusBarStyle

        viewController.overrideUserInterfaceStyle = if (dark)
            UIUserInterfaceStyle.UIUserInterfaceStyleDark
        else UIUserInterfaceStyle.UIUserInterfaceStyleLight

        if (!isIosAtLeast17) {
            UIApplication.sharedApplication.setStatusBarStyle(
                if (dark) UIStatusBarStyleLightContent else UIStatusBarStyleDarkContent
            )
            viewController.setNeedsStatusBarAppearanceUpdate()
        }
        onDispose {
            viewController.overrideUserInterfaceStyle = prefInterfaceStyle


            if (!isIosAtLeast17) {
                UIApplication.sharedApplication.setStatusBarStyle(prevStatusBarStyle)
                viewController.setNeedsStatusBarAppearanceUpdate()
            }
        }
    }
}
