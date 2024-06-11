package com.dovantuan.asm_ph31763_kot104.service

object RetrofitInstance {
    private const val BASE_URL = "http://192.168.1.6:3000/api/"

    val apiService: ApiService by lazy {
        retrofit2.Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(retrofit2.converter.gson.GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}