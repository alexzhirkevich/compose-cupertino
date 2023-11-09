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

package io.github.alexzhirkevich.cupertino.adaptive

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import io.github.alexzhirkevich.cupertino.CupertinoTopAppBar
import io.github.alexzhirkevich.cupertino.CupertinoTopAppBarColors
import io.github.alexzhirkevich.cupertino.CupertinoTopAppBarDefaults

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AdaptiveTopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable (RowScope.() -> Unit) = {},
    windowInsets: WindowInsets = CupertinoTopAppBarDefaults.windowInsets,
    adaptation: @Composable AdaptationScope<CupertinoTopAppBarAdaptation, MaterialTopAppBarAdaptation>.() -> Unit = {}
) {
    AdaptiveWidget(
        adaptationScope = remember {
            TopAppBarAdaptationScope()
        },
        adaptation = adaptation,
        cupertino = {
            CupertinoTopAppBar(
                title = title,
                modifier = modifier,
                navigationIcon = navigationIcon,
                actions = actions,
                windowInsets = windowInsets,
                colors = it?.colors ?: CupertinoTopAppBarDefaults.topAppBarColors(),
                isTransparent = it?.isTransparent == true
            )
        },
        material = {
            TopAppBar(
                title = title,
                modifier = modifier,
                navigationIcon = navigationIcon,
                actions = actions,
                windowInsets = windowInsets,
                colors = it?.colors ?: TopAppBarDefaults.topAppBarColors()
            )
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
class MaterialTopAppBarAdaptation(
    val colors : TopAppBarColors
)

class CupertinoTopAppBarAdaptation(
    val colors : CupertinoTopAppBarColors,
    val isTransparent: Boolean = false,
)

@Stable
private class TopAppBarAdaptationScope :
    AdaptationScope<CupertinoTopAppBarAdaptation, MaterialTopAppBarAdaptation>() {

    override var cupertino : CupertinoTopAppBarAdaptation? by mutableStateOf(null)
        private set
    override var material : MaterialTopAppBarAdaptation? by mutableStateOf(null)
        private set

    @Composable
    @Stable
    override fun cupertino(block: @Composable CupertinoTopAppBarAdaptation.() -> Unit) {
        cupertino = CupertinoTopAppBarAdaptation(
            colors = CupertinoTopAppBarDefaults.topAppBarColors()
        ).apply {
            block()
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    @Stable
    override fun material(block: @Composable MaterialTopAppBarAdaptation.() -> Unit) {
        material = MaterialTopAppBarAdaptation(
            colors = TopAppBarDefaults.topAppBarColors()
        ).apply {
            block()
        }
    }
}