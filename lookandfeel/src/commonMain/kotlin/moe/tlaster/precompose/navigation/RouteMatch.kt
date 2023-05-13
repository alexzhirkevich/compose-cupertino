package moe.tlaster.precompose.navigation

import moe.tlaster.precompose.navigation.route.ComposeRoute
import kotlin.math.min

internal class RouteMatch {
    var matches = false
    var route: ComposeRoute? = null
    var vars = arrayListOf<String>()
    var keys = arrayListOf<String>()
    var pathMap = linkedMapOf<String, String>()
    fun key() {
        val size = min(keys.size, vars.size)
        for (i in 0 until size) {
            pathMap[keys[i]] = vars[i]
        }
        for (i in 0 until size) {
            vars.removeFirst()
        }
    }

    fun truncate(size: Int) {
        var sizeInt = size
        while (sizeInt < vars.size) {
            vars.removeAt(sizeInt++)
        }
    }

    fun value(value: String) {
        vars.add(value)
    }

    fun pop() {
        if (vars.isNotEmpty()) {
            vars.removeLast()
        }
    }

    fun found(route: ComposeRoute): RouteMatch {
        this.route = route
        matches = true
        return this
    }
}
