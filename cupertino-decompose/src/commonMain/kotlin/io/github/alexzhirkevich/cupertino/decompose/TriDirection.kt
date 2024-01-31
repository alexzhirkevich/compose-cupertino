package io.github.alexzhirkevich.cupertino.decompose

/**
 * Represents a direction in which child widgets are animated.
 */
enum class TriDirection {


    /**
     * The child is entering from the front (push).
     */
    ENTER_FRONT,

    /**
     * The child is exiting to the front (pop).
     */
    EXIT_FRONT,

    /**
     * The child is entering from the back (move from the backstack).
     */
    ENTER_BACK,

    /**
     * The child is exiting to the back (move to the backstack).
     */
    EXIT_BACK,

    /**
     * The child is entering from the second back (move from the second backstack).
     */
    ENTER_BACK_SECOND,

    /**
     * The child is exiting to the second back (move to the second backstack).
     */
    EXIT_BACK_SECOND,
}

