package moe.tlaster.precompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.geometry.Offset
import moe.tlaster.precompose.lifecycle.LifecycleOwner
import moe.tlaster.precompose.stateholder.LocalStateHolder
import moe.tlaster.precompose.stateholder.StateHolder

/**
 * Creates a [Navigator] that controls the [NavHost].
 *
 * @see NavHost
 */
@Composable
fun rememberNavigator(): Navigator {
    val stateHolder = LocalStateHolder.current
    return stateHolder.getOrPut("Navigator") {
        Navigator()
    }
}

class Navigator {
    // FIXME: 2021/4/1 Temp workaround for deeplink
    private var _pendingNavigation: String? = null
    private var _initialized = false
    internal val stackManager = BackStackManager()

    internal var internalSwipeOffset by mutableStateOf(0f)
    val swipeOffset get() = internalSwipeOffset
    internal var internalSwipeProgress by mutableStateOf(0f)
    val swipeProgress get() = internalSwipeProgress

    internal fun init(
        routeGraph: RouteGraph,
        stateHolder: StateHolder,
        lifecycleOwner: LifecycleOwner,
    ) {
        if (_initialized) {
            return
        }
        _initialized = true
        stackManager.init(
            routeGraph = routeGraph,
            stateHolder = stateHolder,
            lifecycleOwner = lifecycleOwner,
        )
        _pendingNavigation?.let {
            stackManager.push(it)
            _pendingNavigation = null
        }
    }

    /**
     * Navigate to a route in the current RouteGraph.
     *
     * @param route route for the destination
     * @param options navigation options for the destination
     */
    fun navigate(route: String, options: NavOptions? = null) {
        if (!_initialized) {
            _pendingNavigation = route
            return
        }

        stackManager.push(route, options)
    }

    /**
     * Navigate to a route in the current RouteGraph and wait for result.
     * @param route route for the destination
     * @param options navigation options for the destination
     * @return result from the destination
     */
    suspend fun navigateForResult(route: String, options: NavOptions? = null): Any? {
        if (!_initialized) {
            _pendingNavigation = route
            return null
        }
        return stackManager.pushForResult(route, options)
    }

    /**
     * Attempts to navigate up in the navigation hierarchy. Suitable for when the
     * user presses the "Up" button marked with a left (or start)-facing arrow in the upper left
     * (or starting) corner of the app UI.
     */
    fun goBack() {
        if (!_initialized) {
            return
        }
        stackManager.pop()
    }

    fun goBackWith(result: Any? = null) {
        if (!_initialized) {
            return
        }
        stackManager.pop(result)
    }

    /**
     * Compatibility layer for Jetpack Navigation
     */
    fun popBackStack() {
        if (!_initialized) {
            return
        }
        goBack()
    }

    /**
     * Check if navigator can navigate up
     */
    val canGoBack = stackManager.canGoBack

    val currentEntry = stackManager.currentBackStackEntry
}
