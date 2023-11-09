/*
 * Copyright (c) 2023 Compose Cupertino project and open source contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.github.alexzhirkevich

internal expect object PlatformDateFormat {


    val firstDayOfWeek : Int

    /**
     * Localized by platform weekdays
     * */
    fun weekdayNames(locale: CalendarLocale) : List<Pair<String, String>>

    fun monthsNames(locale: CalendarLocale) : List<String>

    fun formatWithPattern(
        utcTimeMillis: Long,
        pattern: String,
        locale: CalendarLocale
    ): String

    fun formatWithSkeleton(
        utcTimeMillis: Long,
        skeleton: String,
        locale: CalendarLocale
    ): String

    fun parse(date: String, pattern: String): CalendarDate?

    fun getDateInputFormat(locale: CalendarLocale): DateInputFormat

    fun is24HourFormat(locale: CalendarLocale) : Boolean

}