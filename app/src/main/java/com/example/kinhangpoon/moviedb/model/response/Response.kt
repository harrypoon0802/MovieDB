package com.example.kinhangpoon.moviedb.model.response

import com.google.gson.annotations.SerializedName

data class Response(

    @field:SerializedName("page")
    val page: Int? = null,

    @field:SerializedName("total_pages")
    val totalPages: Int? = null,

    @field:SerializedName("results")
    var results: MutableList<MovieResponse>? = null,

    @field:SerializedName("total_results")
    val totalResults: Int? = null
)