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

package cupertino

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.ui.graphics.Color
import com.arkivanov.decompose.ComponentContext

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

interface CupertinoWidgetsComponent {

    val isDark : State<Boolean>

    val isInvertLayoutDirection : State<Boolean>

    fun onAccentColorChanged(light: Color, dark : Color)

    fun onThemeClicked()

    fun onInvertLayoutDirection(invert : Boolean)

    fun onNavigateToAdaptive()

    fun onNavigateToIcons()
}

class DefaultCupertinoWidgetsComponent(
    context: ComponentContext,
    private val onAccentColorChanged: (light: Color, dark: Color) -> Unit,
    private val onNavigateToAdaptive: () -> Unit,
    private val onNavigateToIcons: () -> Unit,
    private val invertLayoutDirection: MutableState<Boolean>,
    private val dark: MutableState<Boolean>
) : CupertinoWidgetsComponent, ComponentContext by context {

    override val isDark: State<Boolean> get() = dark

    override val isInvertLayoutDirection: State<Boolean>
        get() = invertLayoutDirection

    override fun onInvertLayoutDirection(invert : Boolean) {
        invertLayoutDirection.value = invert
    }
    override fun onThemeClicked() {
        dark.value = !dark.value
    }

    override fun onNavigateToAdaptive() {
        onNavigateToAdaptive.invoke()
    }

    override fun onNavigateToIcons() {
        onNavigateToIcons.invoke()
    }

    override fun onAccentColorChanged(light: Color, dark: Color) {
        onAccentColorChanged.invoke(light, dark)
    }
}