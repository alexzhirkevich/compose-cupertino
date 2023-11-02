
package io.github.alexzhirkevich

internal expect object PlatformDateFormat {


    val firstDayOfWeek : Int

    /**
     * Localized by platform weekdays
     * */
    fun weekdayNames(locale: CalendarLocale) : List<Pair<String, String>>

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