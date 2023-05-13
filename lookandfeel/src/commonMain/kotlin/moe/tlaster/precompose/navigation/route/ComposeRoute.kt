package moe.tlaster.precompose.navigation.route

import androidx.compose.runtime.Composable
import moe.tlaster.precompose.navigation.BackStackEntry

abstract class ComposeRoute(
    override val route: String,
    val content: @Composable (BackStackEntry) -> Unit
) : Route
