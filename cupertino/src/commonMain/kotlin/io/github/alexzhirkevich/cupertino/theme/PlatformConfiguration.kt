/*
 * Copyright (c) 2023 Compose Cupertino project and open source contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.alexzhirkevich.cupertino.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf

enum class LookAndFeel {
    Material3, Cupertino
}
val currentLookAndFeel : LookAndFeel
    @Composable get() = LocalPlatformConfiguration.current?.lookAndFeel ?: LookAndFeel.Material3



internal val LocalPlatformConfiguration = staticCompositionLocalOf<PlatformConfiguration?>{
    null
}

class PlatformConfiguration(
    val platformHaptics : Boolean,
    val darkMode : Boolean,
    val lookAndFeel : LookAndFeel,
    internal val materialTheme : CupertinoTheme,
    internal val cupertinoTheme : CupertinoTheme,
){
    fun copy(
        platformHaptics: Boolean = this.platformHaptics,
        darkMode: Boolean = this.darkMode,
        lookAndFeel: LookAndFeel = this.lookAndFeel
    ) = PlatformConfiguration(
        platformHaptics = platformHaptics,
        darkMode = darkMode,
        lookAndFeel = lookAndFeel,
        materialTheme = materialTheme,
        cupertinoTheme = cupertinoTheme
    )
}