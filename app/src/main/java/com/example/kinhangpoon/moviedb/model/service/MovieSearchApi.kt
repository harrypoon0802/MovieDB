package com.example.kinhangpoon.moviedb.model.service

import com.example.kinhangpoon.moviedb.model.response.Response
import retrofit2.Call


import retrofit2.http.GET
import retrofit2.http.Query

// val apiKey: String = BuildConfig.ApiKey
//https://api.themoviedb.org/3/search/movie?api_key=5f74a4cfed193e5f0530e6de687a8487&query=Jack+Reacher
interface MovieSearchApi {
    @GET("movie")
    fun searchMovie(
        @Query("api_key") apiKey: String,
        @Query("query") query: String,
        @Query("page") page: String
    ): Call<Response>
}