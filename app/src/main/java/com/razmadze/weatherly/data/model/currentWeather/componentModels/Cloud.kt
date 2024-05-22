package com.razm.weather.data.model.currentWeather.componentModels

import com.google.gson.annotations.SerializedName

data class Cloud(
    @SerializedName("all")
    val all: Int
)