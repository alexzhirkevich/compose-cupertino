package io.github.alexzhirkevich.cupertino.adaptive

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerColors
import androidx.compose.material3.DatePickerDefaults
import androidx.compose.material3.DatePickerFormatter
import androidx.compose.material3.DatePickerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.key
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.github.alexzhirkevich.cupertino.CupertinoDatePicker
import io.github.alexzhirkevich.cupertino.CupertinoDatePickerState
import io.github.alexzhirkevich.cupertino.DatePickerStyle
import io.github.alexzhirkevich.cupertino.ExperimentalCupertinoApi
import io.github.alexzhirkevich.cupertino.LocalContainerColor
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.filterNotNull

@Suppress("INVISIBLE_MEMBER")
@OptIn(ExperimentalCupertinoApi::class, ExperimentalMaterial3Api::class)
@ExperimentalAdaptiveApi
@Composable
fun AdaptiveDatePicker(
    state : CupertinoDatePickerState,
    modifier: Modifier = Modifier,
    adaptation: AdaptationScope<CupertinoDatePickerAdaptation, MaterialDatePickerAdaptation>. () -> Unit = {}
) {
    val materialState = key(state) {
        rememberDatePickerState(state.selectedDateMillis)
    }

    LaunchedEffect(state, materialState) {
        snapshotFlow {
            state.selectedDateMillis
        }.collectLatest {
            if (materialState.selectedDateMillis != it) {
                materialState.setSelection(it)
            }
        }
    }

    LaunchedEffect(state ,materialState){
        snapshotFlow {
            materialState.selectedDateMillis
        }.filterNotNull().collectLatest {
            if (state.selectedDateMillis != it) {
                state.setSelection(it)
            }
        }
    }

    AdaptiveWidget(
        adaptation = remember(materialState) {
            DatePickerAdaptation(materialState)
        },
        adaptationScope = adaptation,
        cupertino = {
            CupertinoDatePicker(
                modifier = modifier,
                state = state,
                style = it.style,
                containerColor = it.containerColor
            )
        },
        material = {
            DisposableEffect(state) {
                val old = state.isManual
                onDispose {
                    state.isManual = old
                }
            }

            DatePicker(
                state = it.state,
                modifier = modifier,
                colors = it.colors,
                dateFormatter = it.dateFormatter,
                dateValidator = it.dateValidator,
                title = it.title,
                headline = it.headline,
                showModeToggle = it.showModeToggle
            )
        }
    )
}

class CupertinoDatePickerAdaptation(
    var style : DatePickerStyle,
    var containerColor: Color
)


@OptIn(ExperimentalMaterial3Api::class)
class MaterialDatePickerAdaptation(
    internal val state : DatePickerState,
    var colors : DatePickerColors,
    var dateFormatter: DatePickerFormatter = DatePickerFormatter(),
    var dateValidator: (Long) -> Boolean = { true },
    var title: (@Composable () -> Unit)? = {
        DatePickerDefaults.DatePickerTitle(
            state,
            modifier = Modifier.padding(DatePickerTitlePadding)
        )
    },
    var headline: (@Composable () -> Unit)? = {
        DatePickerDefaults.DatePickerHeadline(
            state,
            dateFormatter,
            modifier = Modifier.padding(DatePickerHeadlinePadding)
        )
    },
    var showModeToggle: Boolean = true,
)

private val DatePickerTitlePadding = PaddingValues(start = 24.dp, end = 12.dp, top = 16.dp)
private val DatePickerHeadlinePadding = PaddingValues(start = 24.dp, end = 12.dp, bottom = 12.dp)

@OptIn(ExperimentalMaterial3Api::class)
private class DatePickerAdaptation(
    private val state: DatePickerState
) : Adaptation<CupertinoDatePickerAdaptation, MaterialDatePickerAdaptation>() {

    @Composable
    override fun rememberCupertinoAdaptation(): CupertinoDatePickerAdaptation {
        val style = DatePickerStyle.Pager()
        val containerColor = LocalContainerColor.current

        return remember(style,containerColor) {
            CupertinoDatePickerAdaptation(style, containerColor)
        }
    }

    @Composable
    override fun rememberMaterialAdaptation(): MaterialDatePickerAdaptation {
        val colors = DatePickerDefaults.colors()
        return remember(state, colors) {
            MaterialDatePickerAdaptation(state, colors)
        }
    }
}