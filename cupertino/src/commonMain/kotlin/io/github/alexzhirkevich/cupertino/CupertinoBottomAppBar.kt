package io.github.alexzhirkevich.cupertino

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import io.github.alexzhirkevich.cupertino.section.CupertinoSectionDefaults
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme

@ExperimentalCupertinoApi
@Composable
fun CupertinoBottomAppBar(
    modifier: Modifier = Modifier,
    isTranslucent : Boolean = true,
    isTransparent : Boolean = false,
    containerColor: Color = CupertinoNavigationBarDefaults.containerColor(),
    contentColor: Color = CupertinoTheme.colorScheme.accent,
    contentPadding: PaddingValues = CupertinoSectionDefaults.PaddingValues,
    windowInsets: WindowInsets = WindowInsets.navigationBars,
    content: @Composable RowScope.() -> Unit,
) {

    val actualContainerColor  = cupertinoTranslucentBottomBarColor(
        color = containerColor,
        isTranslucent = isTranslucent,
        isTransparent = isTransparent
    )

    Column {
        if (!isTransparent) {
            CupertinoDivider()
        }
        Surface(
            color = actualContainerColor,
            contentColor = contentColor,
            modifier = modifier
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .windowInsetsPadding(windowInsets)
                    .height(CupertinoNavigationBarTokens.Height)
                    .padding(contentPadding),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                content = content
            )
        }
    }
}