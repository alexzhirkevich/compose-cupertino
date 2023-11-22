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

package io.github.alexzhirkevich.cupertino

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.icons.CupertinoIcons
import io.github.alexzhirkevich.cupertino.icons.outlined.ChevronBackward
import io.github.alexzhirkevich.cupertino.icons.outlined.ChevronForward
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme

@Composable
fun CupertinoNavigateBackButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    size: CupertinoButtonSize = CupertinoButtonSize.Medium,
    shape: Shape = size.shape(CupertinoTheme.shapes),
    colors: CupertinoButtonColors = CupertinoButtonDefaults.plainButtonColors(),
    border : BorderStroke? = null,
    contentPadding: PaddingValues = CupertinoButtonDefaults.ButtonContentPaddingSmall,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    icon : ImageVector = if (LocalLayoutDirection.current == LayoutDirection.Ltr)
        CupertinoIcons.Default.ChevronBackward else CupertinoIcons.Default.ChevronForward,
    title: @Composable RowScope.() -> Unit
){
    CupertinoButton(
        modifier = modifier,
        onClick = onClick,
        enabled = enabled,
        shape = shape,
        border = border,
        contentPadding = contentPadding,
        interactionSource =  interactionSource,
        colors = colors
    ){
        CupertinoIcon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier
                .height(MediumCupertinoIconSize)
                .padding(end = 6.dp)
        )
        title()
    }
}

