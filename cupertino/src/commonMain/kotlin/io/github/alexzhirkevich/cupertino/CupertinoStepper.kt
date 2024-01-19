/*
 * Copyright (c) 2024. Compose Cupertino project and open source contributors.
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

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.icons.CupertinoIcons
import io.github.alexzhirkevich.cupertino.icons.outlined.Minus
import io.github.alexzhirkevich.cupertino.icons.outlined.Plus

@Composable
fun CupertinoStepper(
    onDecrement : () -> Unit,
    onIncrement : () -> Unit,
    incrementButton : @Composable CupertinoSegmentedButtonRowScope.(() -> Unit) -> Unit = {
        CupertinoStepperDefaults.run {
            IncrementButton(it)
        }
    },
    decrementButton : @Composable CupertinoSegmentedButtonRowScope.(() -> Unit) -> Unit = {
        CupertinoStepperDefaults.run {
            DecrementButton(it)
        }
    },
    modifier: Modifier = Modifier,
    contentColor : Color = CupertinoSegmentedButtonDefaults.contentColor,
    containerColor : Color = CupertinoSegmentedButtonDefaults.containerColor,
    dividerColor : Color = CupertinoSegmentedButtonDefaults.dividerColor,
    shape: Shape = CupertinoSegmentedButtonDefaults.shape,
) {
    CupertinoSegmentedButtonRow(
        modifier = modifier,
        containerColor = containerColor,
        contentColor = contentColor,
        dividerColor = dividerColor,
        shape = shape,
    ) {
        decrementButton(onDecrement)
        incrementButton(onIncrement)
    }
}

@Stable
object CupertinoStepperDefaults {

    @Composable
    fun CupertinoSegmentedButtonRowScope.IncrementButton(
        onClick: () -> Unit,
        contentDescription: String = "Increment"
    ) = StepperButton(
        onClick = onClick,
        icon = CupertinoIcons.Default.Plus,
        contentDescription = contentDescription
    )

    @Composable
    fun CupertinoSegmentedButtonRowScope.DecrementButton(
        onClick: () -> Unit,
        contentDescription: String = "Decrement"
    ) = StepperButton(
        onClick = onClick,
        icon = CupertinoIcons.Default.Minus,
        contentDescription = contentDescription
    )
}

@Composable
fun CupertinoSegmentedButtonRowScope.StepperButton(
    onClick : () -> Unit,
    icon : ImageVector,
    contentDescription : String
) {
    CupertinoSegmentedButton(
        onClick = onClick,
        onClickLabel = contentDescription
    ) {
        CupertinoIcon(
            imageVector = icon,
            modifier = Modifier
                .size(CupertinoIconDefaults.MediumSize)
                .padding(2.dp),
            contentDescription = contentDescription
        )
    }
}