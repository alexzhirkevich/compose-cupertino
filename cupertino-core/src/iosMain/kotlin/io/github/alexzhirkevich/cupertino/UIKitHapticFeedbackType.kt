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

@file:OptIn(InternalCupertinoApi::class)

package io.github.alexzhirkevich.cupertino

import androidx.compose.ui.hapticfeedback.HapticFeedbackType


val HapticFeedbackType.Companion.SelectionChanged : HapticFeedbackType
    get() = CupertinoHapticFeedback.SelectionChanged

val HapticFeedbackType.Companion.Success : HapticFeedbackType
    get() = CupertinoHapticFeedback.Success
val HapticFeedbackType.Companion.Warning : HapticFeedbackType
    get() = CupertinoHapticFeedback.Warning
val HapticFeedbackType.Companion.Error : HapticFeedbackType
    get() = CupertinoHapticFeedback.Error

val HapticFeedbackType.Companion.ImpactLight : HapticFeedbackType
    get() = CupertinoHapticFeedback.ImpactLight
val HapticFeedbackType.Companion.ImpactMedium : HapticFeedbackType
    get() = CupertinoHapticFeedback.ImpactMedium
val HapticFeedbackType.Companion.ImpactHeavy : HapticFeedbackType
    get() = CupertinoHapticFeedback.ImpactHeavy
val HapticFeedbackType.Companion.ImpactRigid : HapticFeedbackType
    get() = CupertinoHapticFeedback.ImpactRigid
val HapticFeedbackType.Companion.ImpactSoft : HapticFeedbackType
    get() = CupertinoHapticFeedback.ImpactSoft