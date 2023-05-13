package moe.tlaster.precompose.navigation

/**
 * [NavOptions] stores special options for navigate actions
 */
data class NavOptions(
    /**
     * Whether this navigation action should launch as single-top (i.e., there will be at most
     * one copy of a given destination on the top of the back stack regardless of path parameters).
     * To include path parameters see [includePath].
     */
    val launchSingleTop: Boolean = false,

    /**
     *  [includePath] overrides the default [launchSingleTop] behavior allowing
     *  single-top launch of destinations with variable path parameters.
     *
     *  This override has no effect when [launchSingleTop] is false, and it is disabled by default.
     */
    val includePath: Boolean = false,
    /**
     * The destination to pop up to before navigating. When set, all non-matching destinations
     * should be popped from the back stack.
     * @see [PopUpTo]
     */
    val popUpTo: PopUpTo = PopUpTo.None,
)
