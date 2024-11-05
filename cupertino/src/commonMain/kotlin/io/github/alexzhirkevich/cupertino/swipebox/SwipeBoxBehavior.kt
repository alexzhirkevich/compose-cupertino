package io.github.alexzhirkevich.cupertino.swipebox

/**
 * Enum class to define swipe box behavior.
 */
enum class SwipeBoxBehavior {
    // Not an ideal location for this

    /**
     * Swipe in this direction is completely disabled
     * */
    Disabled,

    /**
     * Background items can be expanded and settled but can't be dismissed
     * */
    Expandable,

    /**
     * Background items can be expanded and the first item can be swiped out to the end hiding other items
     * */
    Dismissible
}