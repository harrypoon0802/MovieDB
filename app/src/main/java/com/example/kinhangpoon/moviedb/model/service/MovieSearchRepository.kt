package com.example.kinhangpoon.moviedb.model.service

import com.example.kinhangpoon.moviedb.BuildConfig
import com.example.kinhangpoon.moviedb.model.response.MovieResponse
import com.example.kinhangpoon.moviedb.model.response.Response
import retrofit2.Call
import retrofit2.Callback


class MovieSearchRepository(val movieSearchApi: MovieSearchApi?) {

    fun searchByQuery(text: String, index: String, movieSearchCallback: MovieSearchRepository.movieSearchCallback) {
        movieSearchApi?.searchMovie(BuildConfig.ApiKey, text, index)
            ?.enqueue(object : Callback<Response> {
                override fun onResponse(call: Call<Response>, response: retrofit2.Response<Response>) {
                    if (response != null && response.isSuccessful()) {
                        val movies = response.body()?.results
                        if (movies != null) {
                            movieSearchCallback.onSuccess(movies)
                        }
                    } else {
                        movieSearchCallback.onFailure()
                    }
                }

                override fun onFailure(call: Call<Response>, t: Throwable) {
                    movieSearchCallback.onFailure()
                }
            })
    }

    interface movieSearchCallback {
        fun onSuccess(movies: MutableList<MovieResponse>)
        fun onFailure()
    }
}