@file:OptIn(ExperimentalMaterialApi::class)

package moe.tlaster.precompose.navigation

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.FixedThreshold
import androidx.compose.material.ThresholdConfig
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import moe.tlaster.precompose.navigation.transition.NavTransition

/**
 * ATTENTION!!! If your screens have any [rememberSaveable] states
 * (directly or via combined state like [rememberLazyListState], that goes as default
 * parameter in [LazyColumn]) and you want to have seamless back navigation, you must
 * use [rememberSaveable] with 'key' parameter!!!
 *
 * @param slideInHorizontally a lambda that takes the full width of the
 * content in pixels and returns the initial offset for the slide-in prev entry,
 * by default it returns -fullWidth/4.
 * For the best impression, lambda should return the save value as [NavTransition.pauseTransition]
 * @param spaceToSwipe width of the swipe space from the left side of screen.
 * Can be set to [Int.MAX_VALUE].dp to enable full-scene swipe
 * @param swipeThreshold amount of offset to perform back navigation
 * @param shadowColor color of the shadow. Alpha channel is additionally multiplied
 * by swipe progress. Use [Color.Transparent] to disable shadow
 * */
class SwipeProperties(
    val slideInHorizontally: (fullWidth: Int) -> Int = { -it / 4 },
    val spaceToSwipe: Dp = 15.dp,
    val swipeThreshold: ThresholdConfig = FixedThreshold(56.dp),
    val shadowColor: Color = Color.Black.copy(alpha = .25f)
)
