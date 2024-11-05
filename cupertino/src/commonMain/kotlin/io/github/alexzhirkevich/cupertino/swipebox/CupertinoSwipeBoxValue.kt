package io.github.alexzhirkevich.cupertino.swipebox

import io.github.alexzhirkevich.cupertino.ExperimentalCupertinoApi

@ExperimentalCupertinoApi
enum class CupertinoSwipeBoxValue {

    /** Box is is initial collapsed state */
    Collapsed,

    /** Box is dismissed to end. The first background item should be activated */
    DismissedToEnd,

    /** Box is dismissed to start. The first background item should be activated */
    DismissedToStart,

    /** Start items are expanded */
    ExpandedToEnd,

    /** End items are expanded */
    ExpandedToStart
}