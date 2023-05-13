package com.github.alexzhirkevich.lookandfeel.util

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveable

@ExperimentalMaterial3Api
@Composable
fun rememberTopAppBarState(
    key : String?=null,
    initialHeightOffsetLimit: Float = -Float.MAX_VALUE,
    initialHeightOffset: Float = 0f,
    initialContentOffset: Float = 0f
): TopAppBarState {
    return rememberSaveable(
        key = key,
        saver = TopAppBarState.Saver
    ) {
        TopAppBarState(
            initialHeightOffsetLimit,
            initialHeightOffset,
            initialContentOffset
        )
    }
}