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

package io.github.alexzhirkevich

import android.os.Build
import androidx.annotation.ChecksSdkIntAtLeast


internal actual object PlatformDateFormat {

    private val delegate by lazy {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            AndroidCalendarModelImpl()
        } else error("should not be used for api < 26")
    }
    actual val firstDayOfWeek: Int
        get() = apiCheck(
            old = { LegacyDateFormat.firstDayOfWeek },
            new = { delegate.firstDayOfWeek }
        )

    actual fun formatWithPattern(
        utcTimeMillis: Long,
        pattern: String,
        locale: CalendarLocale
    ): String = apiCheck(
        old = {
            LegacyDateFormat.formatWithPattern(utcTimeMillis, pattern, locale)
        },
        new = {
            delegate.formatWithPattern(utcTimeMillis, pattern, locale)
        }
    )

    actual fun formatWithSkeleton(
        utcTimeMillis: Long,
        skeleton: String,
        locale: CalendarLocale
    ): String = apiCheck(
        old = {
            LegacyDateFormat.formatWithSkeleton(utcTimeMillis, skeleton, locale)
        },
        new = {
            val pattern = android.text.format.DateFormat.getBestDateTimePattern(locale, skeleton)
            AndroidCalendarModelImpl.formatWithPattern(utcTimeMillis, pattern, locale)
        }
    )

    actual fun parse(
        date: String,
        pattern: String
    ): CalendarDate? = apiCheck(
        old = {
            LegacyDateFormat.parse(date, pattern)
        },
        new = {
            delegate.parse(date, pattern)
        }
    )

    actual fun getDateInputFormat(locale: CalendarLocale): DateInputFormat {
        return apiCheck(
            old = { LegacyDateFormat.getDateInputFormat(locale) },
            new = { delegate.getDateInputFormat(locale) }
        )
    }

    // From CalendarModelImpl.android.kt weekdayNames.
    //
    // Legacy model returns short ('Mon') format while newer version returns narrow ('M') format
    actual fun weekdayNames(locale: CalendarLocale): List<Pair<String, String>> {
        return apiCheck(
            old = { LegacyDateFormat.weekdayNames(locale) },
            new = { delegate.weekdayNames(locale) }
        )
    }
    actual fun monthsNames(locale: CalendarLocale): List<String> {
        return LegacyDateFormat.monthsNames(locale)
    }

    // https://android.googlesource.com/platform/frameworks/base/+/jb-release/core/java/android/text/format/DateFormat.java
    //
    // public static boolean is24HourFormat(Context context) -- used by Android date format
    actual fun is24HourFormat(locale: CalendarLocale): Boolean {
        return LegacyDateFormat.is24HourFormat(locale)
    }
}

@ChecksSdkIntAtLeast(api = Build.VERSION_CODES.O, lambda = 2)
private fun <T> apiCheck(old : () -> T, new : () -> T) : T {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
        new() else old()
}
