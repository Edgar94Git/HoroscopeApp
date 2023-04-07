package com.ereyes.horoscopeapp.data.network

import com.ereyes.horoscopeapp.data.network.model.HoroscopeResponse
import retrofit2.Response
import retrofit2.http.POST
import retrofit2.http.Query

/****
 * Project: HoroscopeApp
 * From: com.ereyes.horoscopeapp.data.network
 * Created by Edgar Reyes Gonzalez on 4/7/2023 at 10:35 AM
 * All rights reserved 2023.
 ****/
interface HoroscopeApi {

    @POST(".")
    suspend fun getHoroscope(
        @Query("sign") sign: String,
        @Query("day") day: String
    ): Response<HoroscopeResponse>
}