package io.github.alexzhirkevich.cupertino.section

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue

/**
 * Section state is used to manage collapsing behavior and state of sections with [SectionStyle.Sidebar]
 * */
@Composable
fun rememberSectionState(
    initiallyCollapsed: Boolean = false,
    canCollapse: Boolean = true
) : SectionState = rememberSaveable(
    saver = SectionState.Saver()
){
    SectionState(
        initiallyCollapsed = initiallyCollapsed,
        canCollapse = canCollapse
    )
}

/**
 * Section state is used to manage collapsing behavior and state of sections with [SectionStyle.Sidebar]
 * */
@Stable
class SectionState(
    initiallyCollapsed: Boolean,
    canCollapse : Boolean
) {
    var isCollapsed by mutableStateOf(initiallyCollapsed)
        private set

    var canCollapse by mutableStateOf(canCollapse)

    fun toggle() {
        if (isCollapsed)
            expand()
        else collapse()
    }

    fun collapse() {
        isCollapsed = true
    }

    fun expand() {
        isCollapsed = false
    }

    companion object {
        fun Saver(): Saver<SectionState, *> =
            Saver(
                save = {
                    listOf(it.isCollapsed, it.canCollapse)
                },
                restore = {
                    SectionState(
                        initiallyCollapsed = it[0],
                        canCollapse = it[1]
                    )
                }
            )
    }
}