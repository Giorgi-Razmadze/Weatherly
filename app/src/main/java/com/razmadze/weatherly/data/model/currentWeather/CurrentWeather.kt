package com.razm.weather.data.model.currentWeather

import com.google.gson.annotations.SerializedName
import com.razm.weather.data.model.currentWeather.componentModels.*

data class CurrentWeather(
    @SerializedName("coord")
    val coordinates: Coordinates,
    @SerializedName("weather")
    val weathers: List<Weather>,
    @SerializedName("base")
    val base: String,
    @SerializedName("main")
    val main: Main,
    @SerializedName("visibility")
    val visibility: Int,
    @SerializedName("wind")
    val wind: Wind,
    @SerializedName("rain")
    val rain: Rain?,
    @SerializedName("snow")
    val snow: Snow?,
    @SerializedName("clouds")
    val clouds: Cloud,
    @SerializedName("dt")
    val dt: Int,
    @SerializedName("sys")
    val sys: Sys,
    @SerializedName("timezone")
    val timezone: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("cod")
    val cod: Int,
)