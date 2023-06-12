@file:OptIn(ExperimentalMaterial3Api::class)

package com.github.alexzhirkevich.lookandfeel.components.cupertino

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.geometry.toRect
import androidx.compose.ui.graphics.BlurEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathOperation
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import com.github.alexzhirkevich.lookandfeel.theme.LookAndFeel
import com.github.alexzhirkevich.lookandfeel.theme.currentLookAndFeel
import com.github.alexzhirkevich.lookandfeel.util.safeContent


object CupertinoMaterial {

    val ultraThin: Color
        @Composable get() = MaterialTheme.colorScheme.surface.copy(
            alpha = .75f
        )

    val thin: Color
        @Composable get() = MaterialTheme.colorScheme.surface.copy(
            alpha = .85f
        )
}

/**
 * Adds blur effect for navigation bar and top bar aka iOS system material.
 * Should be called inside [Scaffold] content.
 * Container color of nav bar and top bar should be half transparent.
 * You can use [CupertinoMaterial]s for thar purpose.
 *
 * Default parameters work perfect with cupertino top bars and navigation bars.
 * Otherwise [topBarSize] and [bottomBarSize] should be defined explicitly.
 *
 * Warning: [content] will be composed 2 times. All states (especially scroll state)
 * should be managed outside of [content].
 * There are no guarantees of states sharing between blurred and normal compositions
 *
 * @param topBarSize size of the top app bar. Can be retrieved from top padding values received
 * from [Scaffold] content block (this approach doesn't work collapsing top bars)
 * @param bottomBarSize size of the bottom app bar. Can be retrieved from bottom padding values received
 * from [Scaffold] content block
 * @param enabledTop enable top blur. Should be disabled if your top bar is currently transparent.
 * Can be the opposite lambda of [CupertinoTopAppBar] 'isTransparent'.
 * @param enabledBottom enable bottom blur. Should be disabled if your bottom bar is currently transparent.
 * Can be the opposite lambda of [CupertinoNavigationBar] 'isTransparent'.
 * @param content scaffold content
 * */
@Composable
fun CupertinoScaffoldMaterial(
    enabled : Boolean = currentLookAndFeel == LookAndFeel.Cupertino,
    insets : WindowInsets = WindowInsets.safeContent,
    topBarSize : Dp = CupertinoTopAppBarDefaults.height,
    bottomBarSize : Dp = CupertinoNavigationBarDefaults.height,
    enabledTop : () -> Boolean = { true },
    enabledBottom : () -> Boolean = { true },
    content :  @Composable  () -> Unit
) {
    if (!enabled)
        return content()

    val density = LocalDensity.current
    val shapes = remember {
        ScaffoldSystemMaterialShapes(
            paddingValues = PaddingValues(
                top = topBarSize + density.run {insets.getTop(density).toDp() },
                bottom = bottomBarSize + density.run { insets.getBottom(density).toDp() },
            ),
            enableTop = enabledTop,
            enableBottom = enabledBottom
        )
    }

    Box {
        repeat(2) {
            Box(Modifier.graphicsLayer {
                    if (it == 0){
                        renderEffect = BlurEffect(
                            radiusX = 50.dp.toPx(),
                            radiusY = 50.dp.toPx(),
                            edgeTreatment = TileMode.Decal
                        )
                        shape = shapes.blurredShape ?: shape
                    } else {
                        shape = shapes.shape ?: shape
                    }
                    clip = true
                }
            ) {
                content()
            }
        }
    }
}


private class ScaffoldSystemMaterialShapes(
    paddingValues: PaddingValues,
    private val enableTop: () -> Boolean,
    private val enableBottom: () -> Boolean
) {
    val shape: Shape?
        get() {
            val top = enableTop()
            val bottom = enableBottom()
            return when {
                top && bottom -> paddingShape
                top -> paddingShapeNoBottom
                bottom -> paddingShapeNoTop
                else -> null
            }
        }

    val blurredShape: Shape?
        get() {
            val top = enableTop()
            val bottom = enableBottom()
            return when {
                top && bottom -> defaultShape
                top -> defaultShapeNoBottom
                bottom -> defaultShapeNoTop
                else -> null
            }
        }

    private val paddingShape = PaddingShape(
        paddingValues = paddingValues,
        enableBottom = true,
        enableTop = true
    )

    private val paddingShapeNoBottom = PaddingShape(
        paddingValues = paddingValues,
        enableBottom = false,
        enableTop = true
    )

    private val paddingShapeNoTop = PaddingShape(
        paddingValues = paddingValues,
        enableBottom = true,
        enableTop = false
    )

    private val defaultShape = PaddingShapeReversed(
        paddingValues = paddingValues,
        enableBottom = true,
        enableTop = true
    )

    private val defaultShapeNoBottom = PaddingShapeReversed(
        paddingValues = paddingValues,
        enableBottom = false,
        enableTop = true
    )

    private val defaultShapeNoTop = PaddingShapeReversed(
        paddingValues = paddingValues,
        enableBottom = true,
        enableTop = false
    )
}


private fun PaddingValues.shape(
    size: Size,
    density: Density,
    layoutDirection: LayoutDirection,
    withTop : Boolean,
    withBottom: Boolean
) : Rect {
    return density.run {

        Rect(
            left = calculateLeftPadding(layoutDirection).toPx(),
            top = if (withTop) calculateTopPadding().toPx() else 0f,
            bottom = size.height - if (withBottom) calculateBottomPadding().toPx() else 0f,
            right = size.width - calculateRightPadding(layoutDirection).toPx()
        )
    }
}

private class PaddingShape(
    private val paddingValues: PaddingValues,
    private val enableBottom : Boolean,
    private val enableTop : Boolean,
) : Shape {

    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline = Outline.Rectangle(
        paddingValues.shape(
            size = size,
            density = density,
            layoutDirection = layoutDirection,
            withTop = enableTop,
            withBottom = enableBottom
        )
    )
}

private class PaddingShapeReversed(
    private val paddingValues: PaddingValues,
    private val enableBottom : Boolean,
    private val enableTop : Boolean,
) : Shape {

    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val path = Path.combine(
            PathOperation.Difference,
            Path().apply { addRect(size.toRect()) },
            Path().apply {
                addRect(
                    paddingValues.shape(
                        size = size,
                        density = density,
                        layoutDirection = layoutDirection,
                        withTop = enableTop,
                        withBottom = enableBottom
                    )
                )
            }
        )
        return Outline.Generic(path)
    }
}
