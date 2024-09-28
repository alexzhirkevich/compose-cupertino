/*
 * Copyright (c) 2023-2024. Compose Cupertino project and open source contributors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package io.github.alexzhirkevich.cupertino

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.UIKitInteropProperties
import androidx.compose.ui.viewinterop.UIKitView
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import kotlinx.cinterop.BetaInteropApi
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.ObjCAction
import kotlinx.cinterop.cValue
import kotlinx.cinterop.useContents
import platform.CoreGraphics.CGRectMake
import platform.CoreGraphics.CGSizeZero
import platform.Foundation.NSDate
import platform.Foundation.NSLocale
import platform.Foundation.NSSelectorFromString
import platform.Foundation.NSTimeZone
import platform.Foundation.currentLocale
import platform.Foundation.dateWithTimeIntervalSince1970
import platform.Foundation.timeIntervalSince1970
import platform.Foundation.timeZoneWithName
import platform.UIKit.UIControlEventValueChanged
import platform.UIKit.UIDatePicker
import platform.UIKit.UIDatePickerMode
import platform.UIKit.UIDatePickerStyle
import platform.UIKit.UIView

@OptIn(InternalCupertinoApi::class)
@Composable
@ExperimentalCupertinoApi
actual fun CupertinoDatePickerNative(
    state: CupertinoDatePickerState,
    modifier: Modifier,
    style: DatePickerStyle,
    containerColor : Color,
) {
    LaunchedEffect(0) {
        state.isManual = true
    }

    CupertinoDatePickerNativeImpl(
        millis = state.selectedDateMillis,
        onChange = {
            state.setSelection(it)
        },
        modifier = modifier,
        mode = UIDatePickerMode.UIDatePickerModeDate,
        style = style,
        containerColor = containerColor
    )
}


@OptIn(ExperimentalForeignApi::class)
@Composable
internal fun CupertinoDatePickerNativeImpl(
    millis: Long,
    mode: UIDatePickerMode,
    onChange : (Long) -> Unit,
    modifier: Modifier,
    style: DatePickerStyle,
    containerColor : Color,
) {

    val updatedOnChange by rememberUpdatedState(onChange)

    val datePicker = remember {
        DatePicker(
            millis = millis,
            mode = mode,
            style = style,
        ) {
            updatedOnChange(it)
        }
    }

    val size = remember(datePicker) {
        datePicker.sizeThatFits(cValue { CGSizeZero })
            .useContents { DpSize(width.dp, height.dp) }
    }

    val dark = CupertinoTheme.colorScheme.isDark

    UIKitView<UIDatePicker>(
        factory = {
            datePicker.apply {
                applyTheme(dark)
            }
        },
        modifier = modifier
            .size(size),
        update = {
            it.preferredDatePickerStyle = when (style) {
                is DatePickerStyle.Wheel -> UIDatePickerStyle.UIDatePickerStyleWheels
                is DatePickerStyle.Pager -> UIDatePickerStyle.UIDatePickerStyleInline
            }
            it.setDate(NSDate.dateWithTimeIntervalSince1970(millis / 1000.0), animated = false)
//            it.date = NSDate.dateWithTimeIntervalSince1970(millis / 1000.0)
            (it.subviews.firstOrNull() as UIView?)?.backgroundColor = containerColor.toUIColor()
            it.applyTheme(dark)
        },
        properties = UIKitInteropProperties(
            isInteractive = true,
            isNativeAccessibilityEnabled = true
        )
    )
}

@OptIn(ExperimentalForeignApi::class)
private class DatePicker(
    millis: Long,
    mode: UIDatePickerMode,
    style: DatePickerStyle,
    private val onChange: (Long) -> Unit
) : UIDatePicker(CGRectMake(0.0,0.0,0.0,0.0)){
    init {
        timeZone = NSTimeZone.timeZoneWithName("UTC")
        locale = NSLocale.currentLocale
        setDate(
            date = NSDate.dateWithTimeIntervalSince1970(
                millis / 1000.0
            ),
            animated = false
        )
        datePickerMode = mode
        preferredDatePickerStyle = when (style) {
            is DatePickerStyle.Wheel -> UIDatePickerStyle.UIDatePickerStyleWheels
            is DatePickerStyle.Pager -> UIDatePickerStyle.UIDatePickerStyleInline
        }
//                setFrame(sizeThatFits(cValue { CGSizeZero }))
        addTarget(
            target = this,
            action = NSSelectorFromString("changed:"),
            forControlEvents = UIControlEventValueChanged
        )
    }


    @OptIn(BetaInteropApi::class)
    @ObjCAction
    @Suppress("UNUSED")
    fun changed(v : DatePicker){
        onChange((v.date.timeIntervalSince1970 * 1000).toLong())
    }
}