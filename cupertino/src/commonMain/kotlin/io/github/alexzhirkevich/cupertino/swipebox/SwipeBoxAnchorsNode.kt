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

package io.github.alexzhirkevich.cupertino.swipebox

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.node.LayoutModifierNode
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import io.github.alexzhirkevich.cupertino.ExperimentalCupertinoApi
import kotlin.math.roundToInt

@ExperimentalCupertinoApi
class SwipeBoxAnchorsNode(
    var state: CupertinoSwipeBoxState,
    var startToEnd: SwipeBoxBehavior,
    var endToStart: SwipeBoxBehavior,
    var itemWidth: Dp,
    count: State<Int>,
) : Modifier.Node(), LayoutModifierNode {

    private var didLookahead: Boolean = false

    var count by mutableStateOf(count)

    override fun onDetach() {
        didLookahead = false
    }

    @OptIn(ExperimentalFoundationApi::class)
    override fun MeasureScope.measure(
        measurable: Measurable,
        constraints: Constraints
    ): MeasureResult {
        val placeable = measurable.measure(constraints)
        // If we are in a lookahead pass, we only want to update the anchors here and not in
        // post-lookahead. If there is no lookahead happening (!isLookingAhead && !didLookahead),
        // update the anchors in the main pass.
        if (isLookingAhead || !didLookahead) {
            val width = placeable.width.toFloat()
            val itemsWidth = count.value * itemWidth.toPx()
            val newAnchors = buildMap {
                this[CupertinoSwipeBoxValue.Collapsed] = 0f
                if (startToEnd != SwipeBoxBehavior.Disabled) {
                    this[CupertinoSwipeBoxValue.ExpandedToEnd] = itemsWidth
                    this[CupertinoSwipeBoxValue.DismissedToEnd] = width
                }

                if (endToStart != SwipeBoxBehavior.Disabled) {
                    this[CupertinoSwipeBoxValue.ExpandedToStart] = -itemsWidth
                    this[CupertinoSwipeBoxValue.DismissedToStart] = -width
                }
            }
            val map = MapDraggableAnchorsStep(
                anchors = newAnchors,
                state = state
            )
            state.anchoredDraggableState.updateAnchors(map)
        }

        didLookahead = isLookingAhead || didLookahead

        return layout(placeable.width, placeable.height) {
            // In a lookahead pass, we use the position of the current target as this is where any
            // ongoing animations would move. If SwipeToDismissBox is in a settled state, lookahead
            // and post-lookahead will converge.
            val xOffset = if (isLookingAhead) {
                state.anchoredDraggableState.anchors.positionOf(state.targetValue)
            } else state.requireOffset()

            val o = when {
                startToEnd == SwipeBoxBehavior.Disabled -> xOffset.coerceAtMost(0f)
                endToStart == SwipeBoxBehavior.Disabled -> xOffset.coerceAtLeast(0f)
                else -> xOffset
            }

            placeable.placeRelative(o.roundToInt(), 0)
        }
    }
}