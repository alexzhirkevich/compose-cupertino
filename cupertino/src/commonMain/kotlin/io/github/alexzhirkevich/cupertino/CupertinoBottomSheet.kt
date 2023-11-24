package io.github.alexzhirkevich.cupertino

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.union
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.LocalContentColor
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme

/**
 * Content of the Cupertino modal bottom sheet.
 * */
@Composable
fun CupertinoBottomSheetContent(
    modifier: Modifier = Modifier,
    containerColor: Color = LocalContainerColor.current.takeOrElse {
        CupertinoBottomSheetDefaults.ContainerColor
    },
    contentColor: Color = LocalContentColor.current.takeOrElse {
        CupertinoBottomSheetDefaults.ContentColor
    },
    appBarsAlpha : Float = LocalAppBarsBlurAlpha.current,
    appBarsBlurRadius : Dp = LocalAppBarsBlurRadius.current,
    topBar : @Composable () -> Unit = {},
    bottomBar : @Composable () -> Unit = {},
    content : @Composable (PaddingValues) -> Unit
) {
    CupertinoScaffold(
        modifier = modifier,
        containerColor = containerColor,
        contentColor = contentColor,
        appBarsBlurAlpha = appBarsAlpha,
        appBarsBlurRadius = appBarsBlurRadius,
        topBar = topBar,
        bottomBar =  bottomBar,
        contentWindowInsets = CupertinoScaffoldDefaults.ContentWindowInsets.union(
            WindowInsets(bottom = CupertinoBottomSheetTokens.MaxOverflow)
        ),
        content = content
    )
}

object CupertinoBottomSheetDefaults {
    val ContentColor : Color
        @Composable
        @ReadOnlyComposable
        get() = CupertinoTheme.colorScheme.label

    val ContainerColor : Color
        @Composable
        @ReadOnlyComposable
        get() = CupertinoTheme.colorScheme.secondarySystemGroupedBackground
}

internal object CupertinoBottomSheetTokens {
    internal val MaxOverflow = 5.dp
}