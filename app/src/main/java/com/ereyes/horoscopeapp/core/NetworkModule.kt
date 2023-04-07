package com.ereyes.horoscopeapp.core

import com.ereyes.horoscopeapp.data.network.HoroscopeApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/****
 * Project: HoroscopeApp
 * From: com.ereyes.horoscopeapp.core
 * Created by Edgar Reyes Gonzalez on 4/7/2023 at 10:19 AM
 * All rights reserved 2023.
 ****/

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit{
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    fun provideHoroscopeApi(retrofit: Retrofit): HoroscopeApi {
        return retrofit.create(HoroscopeApi::class.java)
    }
}