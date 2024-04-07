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

package io.github.alexzhirkevich.cupertino.adaptive

import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect

@Composable
@ExperimentalAdaptiveApi
fun AdaptiveWidget(
    material : @Composable () -> Unit,
    cupertino : @Composable () -> Unit
) {
    when(LocalTheme.current){
        Theme.Cupertino -> cupertino()
        else -> material()
    }
}

@Composable
@ExperimentalAdaptiveApi
fun <C,M> AdaptiveWidget(
    adaptation : Adaptation<C, M>,
    material : @Composable (M) -> Unit,
    cupertino : @Composable (C) -> Unit,
    adaptationScope : AdaptationScope<C, M>.() -> Unit,
) {
    adaptation.adaptationScope()

    when (LocalTheme.current) {
        Theme.Cupertino ->
            cupertino(adaptation.rememberUpdatedCupertinoAdaptation())

        else -> material(adaptation.rememberUpdatedMaterialAdaptation())
    }
}