package com.example.kinhangpoon.moviedb.model.service

import com.example.kinhangpoon.moviedb.model.response.Response
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieSearchApi {
    @GET("movie")
    fun searchMovie(
        @Query("api_key") apiKey: String,
        @Query("query") query: String,
        @Query("page") page: String
    ): Call<Response>
}