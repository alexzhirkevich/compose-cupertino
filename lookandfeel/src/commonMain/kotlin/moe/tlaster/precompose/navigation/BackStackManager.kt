package moe.tlaster.precompose.navigation

import androidx.compose.runtime.Stable
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.map
import moe.tlaster.precompose.lifecycle.Lifecycle
import moe.tlaster.precompose.lifecycle.LifecycleObserver
import moe.tlaster.precompose.lifecycle.LifecycleOwner
import moe.tlaster.precompose.navigation.route.FloatingRoute
import moe.tlaster.precompose.navigation.route.SceneRoute
import moe.tlaster.precompose.stateholder.StateHolder
import kotlin.coroutines.Continuation
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

@Stable
internal class BackStackManager : LifecycleObserver {
    private lateinit var _stateHolder: StateHolder
    // internal for testing
    internal val backStacks = MutableStateFlow(listOf<BackStackEntry>())
    private val _routeParser = RouteParser()
    private val _suspendResult = linkedMapOf<BackStackEntry, Continuation<Any?>>()
    val currentBackStackEntry: Flow<BackStackEntry?>
        get() = backStacks.asSharedFlow().map { it.lastOrNull() }

    val canGoBack: Flow<Boolean>
        get() = backStacks.asSharedFlow().map { it.size > 1 }

    val currentSceneBackStackEntry: Flow<BackStackEntry?>
        get() = backStacks.asSharedFlow().map { it.lastOrNull { it.route is SceneRoute } }

    val prevSceneBackStackEntry: Flow<BackStackEntry?>
        get() = backStacks.asSharedFlow().map {
            it.dropLastWhile { it.route !is SceneRoute }
                .dropLast(1)
                .lastOrNull { it.route is SceneRoute }
        }

    val currentFloatingBackStackEntry: Flow<BackStackEntry?>
        get() = backStacks.asSharedFlow().map { it.lastOrNull { it.route is FloatingRoute } }

    // internal for testing
    internal var canNavigate = true

    fun init(
        routeGraph: RouteGraph,
        stateHolder: StateHolder,
        lifecycleOwner: LifecycleOwner,
    ) {
        _stateHolder = stateHolder
        lifecycleOwner.lifecycle.addObserver(this)
        routeGraph.routes
            .map { route ->
                RouteParser.expandOptionalVariables(route.route).let {
                    if (route is SceneRoute) {
                        it + route.deepLinks.flatMap {
                            RouteParser.expandOptionalVariables(it)
                        }
                    } else {
                        it
                    }
                } to route
            }
            .flatMap { it.first.map { route -> route to it.second } }
            .forEach {
                _routeParser.insert(it.first, it.second)
            }
        push(routeGraph.initialRoute)
    }

    fun push(path: String, options: NavOptions? = null) {
        if (!canNavigate) {
            return
        }
        val currentBackStacks = backStacks.value
        val query = path.substringAfter('?', "")
        val routePath = path.substringBefore('?')
        val matchResult = _routeParser.find(path = routePath)
        checkNotNull(matchResult) { "RouteStackManager: navigate target $path not found" }
        // require(matchResult.route is ComposeRoute) { "RouteStackManager: navigate target $path is not ComposeRoute" }
        if ( // for launchSingleTop
            options != null &&
            options.launchSingleTop &&
            currentBackStacks.any { it.hasRoute(matchResult.route.route, path, options.includePath) }
        ) {
            currentBackStacks.firstOrNull { it.hasRoute(matchResult.route.route, path, options.includePath) }?.let { entry ->
                backStacks.value = backStacks.value.filter { it.id != entry.id } + entry
            }
        } else {
            backStacks.value = backStacks.value + BackStackEntry(
                id = backStacks.value.size.toLong(),
                route = matchResult.route,
                pathMap = matchResult.pathMap,
                queryString = query.takeIf { it.isNotEmpty() }?.let {
                    QueryString(it)
                },
                path = path,
                parentStateHolder = _stateHolder,
                requestNavigationLock = {
                    canNavigate = !it
                }
            )
        }

        if (options != null && options.popUpTo != PopUpTo.None) {
            val popUpTo = options.popUpTo
            val index = when (popUpTo) {
                PopUpTo.None -> -1
                PopUpTo.Prev -> currentBackStacks.lastIndex - 1
                is PopUpTo.Route -> if (popUpTo.route.isNotEmpty()) {
                    currentBackStacks.indexOfLast { it.hasRoute(popUpTo.route, path, options.includePath) }
                } else 0
            }
            if (index != -1 && index != currentBackStacks.lastIndex) {
                val stacks = currentBackStacks.subList(
                    if (popUpTo.inclusive) index else index + 1,
                    currentBackStacks.size
                )
                backStacks.value -= stacks
                stacks.forEach {
                    it.destroy()
                }
            }
        }
    }

    fun pop(result: Any? = null) {
        if (!canNavigate) {
            return
        }
        val currentBackStacks = backStacks.value
        if (currentBackStacks.size > 1) {
            val last = currentBackStacks.last()
            backStacks.value = currentBackStacks.dropLast(1)
            last.destroy()
            _suspendResult.remove(last)?.resume(result)
        }
    }

    suspend fun pushForResult(path: String, options: NavOptions? = null): Any? {
        return suspendCoroutine { continuation ->
            push(path, options)
            _suspendResult[backStacks.value.last()] = continuation
        }
    }

    override fun onStateChanged(state: Lifecycle.State) {
        when (state) {
            Lifecycle.State.Initialized -> Unit
            Lifecycle.State.Active -> {
                val currentEntry = backStacks.value.lastOrNull()
                currentEntry?.active()
            }
            Lifecycle.State.InActive -> {
                val currentEntry = backStacks.value.lastOrNull()
                currentEntry?.inActive()
            }
            Lifecycle.State.Destroyed -> {
                backStacks.value.forEach {
                    it.destroy()
                }
                backStacks.value = emptyList()
            }
        }
    }

    fun contains(entry: BackStackEntry): Boolean {
        return backStacks.value.contains(entry)
    }
}
