package com.ugurcandede.multicampcommunitiesturkey.data

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import retrofit2.Retrofit
import retrofit2.create

object RetrofitProvider {

    private val contentType: MediaType = MediaType.get("application/json")
    private const val apiUrl = "https://5f6642a143662800168e7538.mockapi.io/multicamp/"
    private val retrofit: Retrofit =
        Retrofit.Builder()
            .baseUrl(apiUrl)
            .addConverterFactory(
                Json {
                    ignoreUnknownKeys = true
                    isLenient = true
                    allowSpecialFloatingPointValues = true
                    encodeDefaults = false
                }.asConverterFactory(contentType)
            )
            .build()

    val mccApi = retrofit.create<GetMccAPI>()
}