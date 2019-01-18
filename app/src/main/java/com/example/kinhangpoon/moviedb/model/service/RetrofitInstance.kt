package com.example.kinhangpoon.moviedb.model.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance {
    companion object {
        var retrofit: Retrofit? = null
        val BASE_URL = "https://api.themoviedb.org/3/search/"
        fun getRetrofitInstance(): Retrofit? {
            retrofit = retrofit2.Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit
        }
    }
}