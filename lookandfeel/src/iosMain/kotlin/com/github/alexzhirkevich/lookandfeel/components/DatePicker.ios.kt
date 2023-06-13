package com.github.alexzhirkevich.lookandfeel.components

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.interop.UIKitView
import androidx.compose.ui.unit.dp
import com.github.alexzhirkevich.lookandfeel.theme.AdaptiveTheme
import com.github.alexzhirkevich.lookandfeel.util.isDark
import kotlinx.cinterop.ObjCAction
import platform.CoreGraphics.CGRectMake
import platform.Foundation.NSDate
import platform.Foundation.NSSelectorFromString
import platform.Foundation.dateWithTimeIntervalSince1970
import platform.Foundation.timeIntervalSince1970
import platform.UIKit.UIControlEventValueChanged
import platform.UIKit.UIDatePicker
import platform.UIKit.UIDatePickerMode
import platform.UIKit.UIDatePickerStyle
import platform.UIKit.UIUserInterfaceStyle
import kotlin.math.roundToLong

private class ListenableDatePicker(
    dark : Boolean,
    mode: DatePickerMode,
    private val onValueChanged: (Long) -> Unit
)  : UIDatePicker(CGRectMake(0.0,0.0,0.0,300.0)) {
    init {

        listOf(this, superview).forEach {
            it?.overrideUserInterfaceStyle = if (dark)
                UIUserInterfaceStyle.UIUserInterfaceStyleDark
            else UIUserInterfaceStyle.UIUserInterfaceStyleLight
        }
        datePickerMode = mode.ui
        preferredDatePickerStyle = UIDatePickerStyle.UIDatePickerStyleWheels

        addTarget(this, NSSelectorFromString("changed:"), UIControlEventValueChanged)
    }

    @ObjCAction
    fun changed(v : ListenableDatePicker){
        onValueChanged(v.date.timeIntervalSince1970.roundToLong())
    }

    fun destroy(){
        removeTarget(this,NSSelectorFromString("changed:"),UIControlEventValueChanged)
    }

    val DatePickerMode.ui get() = when(this){
        DatePickerMode.Time -> UIDatePickerMode.UIDatePickerModeTime
        DatePickerMode.Date -> UIDatePickerMode.UIDatePickerModeDate
        DatePickerMode.DateTime -> UIDatePickerMode.UIDatePickerModeDateAndTime
    }
}

@ExperimentalAnimationApi
@NonRestartableComposable
@Composable
actual fun DatePickerDialog(
    onDismissRequest: () -> Unit,
    value : Long,
    mode: DatePickerMode,
    onValueChanged : (Long) -> Unit
) {
    DialogSheet(onDismissRequest) {
        Card {
            DatePicker(
                value = value,
                onValueChanged = onValueChanged,
                modifier = Modifier,
                mode = mode,
                containerColor = AdaptiveTheme.colorScheme.surface
            )
        }
    }
}

@Composable
actual fun DatePicker(
    value : Long,
    onValueChanged : (Long) -> Unit,
    modifier: Modifier,
    mode: DatePickerMode,
    containerColor : Color
) {

    val dark = isDark

    UIKitView(
        modifier = modifier
            .fillMaxWidth()
            .height(230.dp),
        background = containerColor,
        factory = remember<() -> ListenableDatePicker>(mode, dark) {
            { ListenableDatePicker(dark, mode, onValueChanged) }
        },
        update = {
            it.date = NSDate.dateWithTimeIntervalSince1970(value.toDouble())
        },
        onRelease = {
            it.destroy()
        }
    )
}