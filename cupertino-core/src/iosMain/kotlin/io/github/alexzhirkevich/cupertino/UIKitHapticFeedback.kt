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
import androidx.compose.ui.hapticfeedback.HapticFeedback
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback
import platform.UIKit.UIImpactFeedbackGenerator
import platform.UIKit.UIImpactFeedbackStyle
import platform.UIKit.UINotificationFeedbackGenerator
import platform.UIKit.UINotificationFeedbackType
import platform.UIKit.UISelectionFeedbackGenerator

@Composable
actual fun rememberCupertinoHapticFeedback() : HapticFeedback {
    val current = LocalHapticFeedback.current

    return remember(current) {
        UIKitHapticFeedback(current)
    }
}


internal class UIKitHapticFeedback(
    private val delegate : HapticFeedback
) : HapticFeedback {

    private val notificationFeedbackGenerator by lazy {
        UINotificationFeedbackGenerator()
    }

    private val selectionFeedbackGenerator by lazy {
        UISelectionFeedbackGenerator()
    }

    @OptIn(InternalCupertinoApi::class)
    override fun performHapticFeedback(hapticFeedbackType: HapticFeedbackType) {
        when (hapticFeedbackType) {

            HapticFeedbackType.LongPress, HapticFeedbackType.TextHandleMove -> {
                delegate.performHapticFeedback(hapticFeedbackType)
            }

            CupertinoHapticFeedback.SelectionChanged -> {
                selectionFeedbackGenerator.selectionChanged()
            }

            CupertinoHapticFeedback.Warning,
            CupertinoHapticFeedback.Success,
            CupertinoHapticFeedback.Error -> {
                notificationFeedbackGenerator.notificationOccurred(
                    NotificationFeedbackMapping[hapticFeedbackType]!!
                )
            }

            CupertinoHapticFeedback.ImpactLight,
            CupertinoHapticFeedback.ImpactMedium,
            CupertinoHapticFeedback.ImpactHeavy,
            CupertinoHapticFeedback.ImpactRigid,
            CupertinoHapticFeedback.ImpactSoft -> {
                UIImpactFeedbackGenerator(
                    ImpactFeedbackMapping[hapticFeedbackType]!!
                ).impactOccurred()
            }
        }
    }
}

@OptIn(InternalCupertinoApi::class)
private val NotificationFeedbackMapping by lazy {
    mapOf(
        CupertinoHapticFeedback.Success to UINotificationFeedbackType.UINotificationFeedbackTypeSuccess,
        CupertinoHapticFeedback.Warning to UINotificationFeedbackType.UINotificationFeedbackTypeWarning,
        CupertinoHapticFeedback.Error to UINotificationFeedbackType.UINotificationFeedbackTypeError,
    )
}

@OptIn(InternalCupertinoApi::class)
private val ImpactFeedbackMapping by lazy {
    mapOf(
        CupertinoHapticFeedback.ImpactLight to UIImpactFeedbackStyle.UIImpactFeedbackStyleLight,
        CupertinoHapticFeedback.ImpactMedium to UIImpactFeedbackStyle.UIImpactFeedbackStyleMedium,
        CupertinoHapticFeedback.ImpactHeavy to UIImpactFeedbackStyle.UIImpactFeedbackStyleHeavy,
        CupertinoHapticFeedback.ImpactRigid to UIImpactFeedbackStyle.UIImpactFeedbackStyleRigid,
        CupertinoHapticFeedback.ImpactSoft to UIImpactFeedbackStyle.UIImpactFeedbackStyleSoft,
    )
}