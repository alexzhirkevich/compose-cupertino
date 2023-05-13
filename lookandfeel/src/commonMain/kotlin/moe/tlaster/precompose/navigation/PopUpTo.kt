package moe.tlaster.precompose.navigation

sealed interface PopUpTo {

    /**
     * Whether the `popUpTo` destination should be popped from the back stack.
     */
    val inclusive: Boolean get() = false

    /**
     * do nothing
     */
    object None : PopUpTo

    /**
     * pop prev back stack
     */
    object Prev : PopUpTo {
        override val inclusive: Boolean get() = true
    }

    /**
     * The `popUpTo` destination, if it's an empty string will clear all backstack
     * @param route the route to pop up to
     * @param inclusive whether the `popUpTo` destination should be popped from the back stack.
     */
    data class Route(
        val route: String,
        override val inclusive: Boolean,
    ) : PopUpTo

    companion object {

        /**
         * popUpTo first back stack
         * @param inclusive whether the `popUpTo` destination should be popped from the back stack.
         */
        @Suppress("FunctionName")
        fun First(inclusive: Boolean = true): PopUpTo = Route("", inclusive)
    }
}

@Suppress("FunctionName")
fun PopUpTo(route: String, inclusive: Boolean = false) = PopUpTo.Route(
    route = route,
    inclusive = inclusive,
)
