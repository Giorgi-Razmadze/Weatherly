package com.razm.weather.data.model.currentWeather.componentModels

import com.google.gson.annotations.SerializedName

data class Rain(
    @SerializedName("1h")
    val oneHour: Int,
    @SerializedName("3h")
    val threeHour: Int,
)