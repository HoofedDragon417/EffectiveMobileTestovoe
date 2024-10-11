package com.example.effectivemobiletestovoe.common.room.convertor

import androidx.room.TypeConverter

class TypeConvertor {
    @TypeConverter
    fun listToJsonString(listOfStrings: List<String>): String =
        listOfStrings.joinToString("||")

    @TypeConverter
    fun jsonStringToList(json: String): List<String> =
        json.split("||")
}