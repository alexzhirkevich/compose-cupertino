@file:OptIn(ExperimentalMaterialApi::class)

package moe.tlaster.precompose.navigation

import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.FractionalThreshold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import com.github.alexzhirkevich.lookandfeel.theme.LookAndFeel
import com.github.alexzhirkevich.lookandfeel.theme.currentLookAndFeel
import moe.tlaster.precompose.navigation.transition.NavTransition

object NavHostDefaults {

    fun materialNavTransition(): NavTransition = NavTransition()

    fun cupertinoNavTransition(): NavTransition = NavTransition(
        createTransition = slideInHorizontally { it },
        destroyTransition = slideOutHorizontally { it },
        pauseTransition = slideOutHorizontally { -it / 4 },
        resumeTransition = slideInHorizontally { -it / 4 },
    )

    fun materialSwipeProperties() : SwipeProperties? = null

    fun cupertinoSwipeProperties(): SwipeProperties = SwipeProperties(
        slideInHorizontally =  { -it / 4 },
        spaceToSwipe = 20.dp,
        swipeThreshold = FractionalThreshold(.5f),
    )
}

@Composable
fun NavHostDefaults.defaultNavTransition() : NavTransition{
    val lnf = currentLookAndFeel
    return remember(lnf) {
        when (lnf) {
            LookAndFeel.Cupertino -> cupertinoNavTransition()
            else -> materialNavTransition()
        }
    }
}

@Composable
fun NavHostDefaults.defaultSwipeProperties() : SwipeProperties? {
    val lnf = currentLookAndFeel
    return remember(lnf) {
        when (lnf) {
            LookAndFeel.Cupertino -> cupertinoSwipeProperties()
            else -> materialSwipeProperties()
        }
    }
}