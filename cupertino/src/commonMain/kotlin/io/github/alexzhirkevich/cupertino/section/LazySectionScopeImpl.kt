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

package io.github.alexzhirkevich.cupertino.section

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import io.github.alexzhirkevich.cupertino.ProvideTextStyle
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme

internal class SectionItem(
    val key: Any? = null,
    val contentType: Any? = null,
    val dividerPadding: Dp?,
    val content: @Composable (PaddingValues) -> Unit,
)

@Stable
internal class LazySectionScopeImpl : LazySectionScope {

    val items: List<SectionItem>
        get() = _items

    private val _items = mutableListOf<SectionItem>()

    internal fun item(
        key: Any? = null,
        contentType: Any? = null,
        dividerPadding: Dp? = null,
        minHeight: Dp,
        content: @Composable (PaddingValues) -> Unit,
    ) {
        _items += SectionItem(
            key = key,
            contentType = contentType,
            content = {
                ProvideTextStyle(CupertinoTheme.typography.body) {
                    Box(
                        modifier = Modifier
                            .heightIn(min = minHeight)
                            .fillMaxWidth(),
                        contentAlignment = Alignment.CenterStart
                    ) {
                        content(it)
                    }
                }
            },
            dividerPadding = dividerPadding
        )
    }

    override fun item(
        key: Any?,
        contentType: Any?,
        dividerPadding: Dp,
        content: @Composable (PaddingValues) -> Unit
    ) {
        item(
            key = key,
            contentType = contentType,
            dividerPadding = dividerPadding,
            minHeight = CupertinoSectionTokens.MinHeight,
            content = content
        )
    }

}

