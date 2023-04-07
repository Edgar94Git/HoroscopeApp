package com.ereyes.horoscopeapp.data.network.model

import com.google.gson.annotations.SerializedName

/****
 * Project: HoroscopeApp
 * From: com.ereyes.horoscopeapp.data.network.model
 * Created by Edgar Reyes Gonzalez on 4/7/2023 at 10:52 AM
 * All rights reserved 2023.
 ****/
data class HoroscopeResponse(
    @SerializedName("current_date") val CurrentDate: String,
    @SerializedName("compatibility") val Compatibility: String,
    @SerializedName("lucky_time") val LuckyTime: String,
    @SerializedName("lucky_number") val LuckyNumber: String,
    @SerializedName("color") val Color: String,
    @SerializedName("date_range") val DateRange: String,
    @SerializedName("mood") val Mood: String,
    @SerializedName("description") val Description: String
)