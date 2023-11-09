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

package io.github.alexzhirkevich.cupertino.section

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import io.github.alexzhirkevich.cupertino.CupertinoSwitch
import io.github.alexzhirkevich.cupertino.CupertinoSwitchColors


interface SectionScope {

    /**
     * Plain section item withoud additional controls
     * */
    fun item(
        key: Any? = null,
        contentType: Any? = null,
        dividerPadding : Dp = SectionTokens.DividerPadding,
        content: @Composable (padding : PaddingValues) -> Unit
    )

    /**
     * Clickable label with trailing chevron, [title], optional [icon] and [caption].
     * @see CupertinoLabelIcon
     * */
    fun label(
        key: Any? = null,
        enabled: Boolean = true,
        onClick: () -> Unit,
        icon: (@Composable () -> Unit)? = null,
        dividerPadding: Dp = if (icon != null)
            SectionTokens.DividerPaddingWithIcon
        else SectionTokens.DividerPadding,
        caption : @Composable () -> Unit = {},
        title: @Composable () -> Unit,
    )

    /**
     * Section control with [CupertinoSwitch]
     * */
    fun toggle(
        key: Any? = null,
        checked: Boolean,
        onCheckedChange: (Boolean) -> Unit,
        enabled: Boolean = true,
        colors : CupertinoSwitchColors ?= null,
        icon: (@Composable () -> Unit)? = null,
        dividerPadding: Dp = if (icon != null)
            SectionTokens.DividerPaddingWithIcon
        else SectionTokens.DividerPadding,
        title: @Composable () -> Unit,
    )
}

fun SectionScope.items(
    count : Int,
    key: (Int) -> Any? = { null },
    contentType: Any? = null,
    dividerPadding : Dp = SectionTokens.DividerPadding,
    content: @Composable (idx : Int, padding : PaddingValues) -> Unit
) {
    repeat(count) {
        item(
            key = key(it),
            contentType = contentType,
            dividerPadding = dividerPadding,
        ) { pv ->
            content(it, pv)
        }
    }
}

fun <T> SectionScope.items(
    items : Collection<T>,
    key: (T) -> Any? = { null },
    contentType: Any? = null,
    dividerPadding : Dp = SectionTokens.DividerPadding,
    content: @Composable (item : T, padding : PaddingValues) -> Unit
) {
    items.forEach {
        item(
            key = key(it),
            contentType = contentType,
            dividerPadding = dividerPadding,
        ) { pv ->
            content(it, pv)
        }
    }
}