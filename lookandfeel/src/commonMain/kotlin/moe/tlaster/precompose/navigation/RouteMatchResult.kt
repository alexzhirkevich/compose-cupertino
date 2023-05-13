package moe.tlaster.precompose.navigation

import moe.tlaster.precompose.navigation.route.Route

internal data class RouteMatchResult(
    val route: Route,
    val pathMap: Map<String, String> = emptyMap(),
)
