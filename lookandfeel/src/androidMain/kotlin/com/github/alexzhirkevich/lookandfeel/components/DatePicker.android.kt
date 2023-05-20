package com.github.alexzhirkevich.lookandfeel.components

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@ExperimentalMaterial3Api
@ExperimentalAnimationApi
@Composable
@NonRestartableComposable
actual fun DatePickerDialog(
    onDismissRequest: () -> Unit,
    value : Long,
    onValueChanged : (Long) -> Unit
) {
    Dialog(
        onDismissRequest= onDismissRequest,
    ){
        DatePicker(value, onValueChanged)
    }
}


@ExperimentalMaterial3Api
@Composable
actual fun DatePicker(
    value : Long,
    onValueChanged : (Long) -> Unit,
    modifier: Modifier,
    mode: DatePickerMode,
    containerColor : Color
) {
    TODO("Not implemented")
//    TODO implement datetime dialog after 1.1 m3 (incompatible internals with 1.0)
//    val state = rememberDatePickerState(
//        initialSelectedDateMillis = value
//    )
//
//    LaunchedEffect(state.selectedDateMillis){
//        state.selectedDateMillis
//            ?.div(1000)
//            ?.let(onValueChanged)
//    }
//    DatePicker(state)
}