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

import io.github.alexzhirkevich.cupertino.CupertinoDatePickerDefaults
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.DayOfWeek
import java.time.Instant
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.time.format.TextStyle
import java.util.Calendar

internal object LegacyDateFormat {

    private val delegate = LegacyCalendarModelImpl()


    val firstDayOfWeek: Int
        get() = delegate.firstDayOfWeek

    fun formatWithPattern(
        utcTimeMillis: Long,
        pattern: String,
        locale: CalendarLocale
    ): String {
        return delegate.formatWithPattern(utcTimeMillis, pattern, locale)
    }

    fun formatWithSkeleton(
        utcTimeMillis: Long,
        skeleton: String,
        locale: CalendarLocale
    ): String {
        // Note: there is no equivalent in Java for Android's DateFormat.getBestDateTimePattern.
        // The JDK SimpleDateFormat expects a pattern, so the results will be "2023Jan7",
        // "2023January", etc. in case a skeleton holds an actual ICU skeleton and not a pattern.

        // TODO: support ICU skeleton on JVM
        // Maybe it will be supported in kotlinx.datetime in the future.
        // See https://github.com/Kotlin/kotlinx-datetime/pull/251

        // stub: not localized but at least readable variant
        val pattern = when(skeleton){
            CupertinoDatePickerDefaults.YearAbbrMonthDaySkeleton -> {
                return DateTimeFormatter
                    .ofLocalizedDate(FormatStyle.MEDIUM)
                    .localizedBy(locale)
                    .format(Instant.ofEpochMilli(utcTimeMillis).atOffset(ZoneOffset.UTC))
            }
            CupertinoDatePickerDefaults.YearMonthWeekdayDaySkeleton -> {
                return DateTimeFormatter
                    .ofLocalizedDate(FormatStyle.FULL)
                    .localizedBy(locale)
                    .format(Instant.ofEpochMilli(utcTimeMillis).atOffset(ZoneOffset.UTC))
            }
            CupertinoDatePickerDefaults.YearMonthSkeleton -> "LLLL yyyy"
            else -> skeleton
        }
        return formatWithPattern(utcTimeMillis, pattern, locale)
    }

    fun parse(
        date: String,
        pattern: String
    ): CalendarDate? {
        return delegate.parse(date, pattern)
    }

    fun getDateInputFormat(locale: CalendarLocale): DateInputFormat {
        return delegate.getDateInputFormat(locale)
    }

    // From CalendarModelImpl.android.kt weekdayNames.
    //
    // Legacy model returns short ('Mon') format while newer version returns narrow ('M') format
    fun weekdayNames(locale: CalendarLocale): List<Pair<String, String>> {
        return DayOfWeek.entries.map {
            it.getDisplayName(
                TextStyle.FULL,
                locale
            ) to it.getDisplayName(
                TextStyle.NARROW,
                locale
            )
        }
    }

    fun monthsNames(locale: CalendarLocale): List<String> {
        return (0 until 12).map {
            Calendar.getInstance().apply {
                set(Calendar.MONTH, it)
            }.getDisplayName(Calendar.MONTH, Calendar.LONG_STANDALONE, locale)
        }
    }

    // https://android.googlesource.com/platform/frameworks/base/+/jb-release/core/java/android/text/format/DateFormat.java
    //
    // public static boolean is24HourFormat(Context context) -- used by Android date format
    fun is24HourFormat(locale : CalendarLocale) : Boolean {
        val dateFormat = DateFormat.getTimeInstance(DateFormat.LONG, locale)

        if (dateFormat !is SimpleDateFormat)
            return false

        return 'H' in dateFormat.toPattern()
    }
}