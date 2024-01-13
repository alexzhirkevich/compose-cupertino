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
import androidx.compose.ui.hapticfeedback.HapticFeedback
import androidx.compose.ui.hapticfeedback.HapticFeedbackType

@Composable
expect fun rememberCupertinoHapticFeedback(): HapticFeedback

/**
 * This haptic feedback types work only on iOS. They are available for public usage in iosMain as
 * extension properties of [HapticFeedbackType.Companion]
 * */
@InternalCupertinoApi
object CupertinoHapticFeedback {

    val SelectionChanged : HapticFeedbackType = HapticFeedbackType(1001)

    val Success : HapticFeedbackType = HapticFeedbackType(2001)
    val Warning : HapticFeedbackType = HapticFeedbackType(2002)
    val Error : HapticFeedbackType = HapticFeedbackType(2003)

    val ImpactLight : HapticFeedbackType = HapticFeedbackType(3001)
    val ImpactMedium : HapticFeedbackType = HapticFeedbackType(3002)
    val ImpactHeavy : HapticFeedbackType = HapticFeedbackType(3003)
    val ImpactRigid : HapticFeedbackType = HapticFeedbackType(3004)
    val ImpactSoft : HapticFeedbackType = HapticFeedbackType(3005)
}