package com.diayan.kaal.data

import androidx.room.TypeConverter
import java.util.*

class Converters {
    @TypeConverter
    fun calendarToDatestamp(calendar: Calendar): Long = calendar.timeInMillis

    @TypeConverter
    fun datestampToCalendar(value: Long): Calendar =
        Calendar.getInstance().apply { timeInMillis = value }

    @TypeConverter
    fun toDate(value: Long?) = value?.let { Date(value) }

    @TypeConverter
    fun toLong(value: Date?) = value?.time
}