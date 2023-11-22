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
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import io.github.alexzhirkevich.cupertino.CupertinoTopAppBar
import io.github.alexzhirkevich.cupertino.CupertinoTopAppBarColors
import io.github.alexzhirkevich.cupertino.CupertinoTopAppBarDefaults

@OptIn(ExperimentalMaterial3Api::class)
@ExperimentalAdaptiveApi
@Composable
fun AdaptiveTopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable (RowScope.() -> Unit) = {},
    windowInsets: WindowInsets = CupertinoTopAppBarDefaults.windowInsets,
    adaptation: AdaptationScope<CupertinoTopAppBarAdaptation, MaterialTopAppBarAdaptation>.() -> Unit = {}
) {
    AdaptiveWidget(
        adaptation = remember {
            TopAppBarAdaptation()
        },
        adaptationScope = adaptation,
        cupertino = {
            CupertinoTopAppBar(
                title = title,
                modifier = modifier,
                navigationIcon = navigationIcon,
                actions = actions,
                windowInsets = windowInsets,
                colors = it.colors,
                isTransparent = it.isTransparent
            )
        },
        material = {
            TopAppBar(
                title = title,
                modifier = modifier,
                navigationIcon = navigationIcon,
                actions = actions,
                windowInsets = windowInsets,
                colors = it.colors
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
private class TopAppBarAdaptation :
    Adaptation<CupertinoTopAppBarAdaptation, MaterialTopAppBarAdaptation>() {

    @Composable
    override fun rememberCupertinoAdaptation(): CupertinoTopAppBarAdaptation {
        val colors = CupertinoTopAppBarDefaults.topAppBarColors()

        return remember(colors) {
            CupertinoTopAppBarAdaptation(
                colors = colors
            )
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun rememberMaterialAdaptation(): MaterialTopAppBarAdaptation {
        val colors = TopAppBarDefaults.topAppBarColors()

        return remember(colors) {
            MaterialTopAppBarAdaptation(
                colors = colors
            )
        }
    }
}