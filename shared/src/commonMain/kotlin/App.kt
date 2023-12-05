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


import adaptive.AdaptiveWidgetsScreen
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.pullrefresh.pullRefreshIndicatorTransform
import androidx.compose.material.pullrefresh.rememberPullRefreshState
import androidx.compose.material3.DatePicker
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.Children
import cupertino.CupertinoWidgetsScreen
import icons.IconsScreen
import io.github.alexzhirkevich.cupertino.adaptive.AdaptiveTheme
import io.github.alexzhirkevich.cupertino.adaptive.ExperimentalAdaptiveApi
import io.github.alexzhirkevich.cupertino.adaptive.Theme
import io.github.alexzhirkevich.cupertino.decompose.NativeChildren
import io.github.alexzhirkevich.cupertino.decompose.cupertinoPredictiveBackAnimation
import sections.SectionsScreen


expect val IsIos : Boolean

@OptIn(ExperimentalDecomposeApi::class, ExperimentalAdaptiveApi::class)
@Composable
fun App(rootComponent: RootComponent) {

    val target by derivedStateOf {
        if (rootComponent.isMaterial.value)
            Theme.Material3 else Theme.Cupertino
    }

    val (lightAccent, darkAccent) = rootComponent.accentColor.value

//    CupertinoTheme(
//        colorScheme = if (isSystemInDarkTheme())
//            darkColorScheme(accentColor.value.second) else lightColorScheme(accentColor.value.first)
//    )

    val dark by rootComponent.isDark

    val direction = LocalLayoutDirection.current

    val directionState by remember {
        derivedStateOf {
            if (rootComponent.isInvertLayoutDirection.value) {
                if (direction == LayoutDirection.Rtl)
                    LayoutDirection.Ltr else
                    LayoutDirection.Rtl
            } else {
                direction
            }
        }
    }

    ActualPredictiveBackGestureOverlay(
        modifier = Modifier.fillMaxSize(),
        backDispatcher = rootComponent.backDispatcher
    ) {
         NativeChildren(
            stack = rootComponent.stack,
            modifier = Modifier.fillMaxSize(),
            backDispatcher = rootComponent.backDispatcher,
            animation = cupertinoPredictiveBackAnimation(
                backHandler = rootComponent.backHandler,
                onBack = rootComponent::onBack,
            ),
        ) { child ->
            CompositionLocalProvider(
                LocalLayoutDirection provides directionState
            ) {
                AnimatedContent(
                    targetState = target to dark,
                    transitionSpec = {
                        fadeIn() togetherWith fadeOut()
                    }
                ) {
                    AdaptiveTheme(
                        target = it.first,
                        primaryColor = if (it.second)
                            lightAccent else darkAccent,
                        useSystemColorTheme = false,
                        useDarkTheme = it.second
                    ) {

                        when (val c = child.instance) {
                            is RootComponent.Child.Cupertino -> CupertinoWidgetsScreen(c.component)
                            is RootComponent.Child.Adaptive -> AdaptiveWidgetsScreen(c.component)
                            is RootComponent.Child.Icons -> IconsScreen(c.component)
                            is RootComponent.Child.Sections -> SectionsScreen(c.component)
                        }
                    }
                }
            }
        }
    }
}