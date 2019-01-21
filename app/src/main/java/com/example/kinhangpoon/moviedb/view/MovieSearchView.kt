package com.example.kinhangpoon.moviedb.view

import com.example.kinhangpoon.moviedb.model.response.MovieResponse

interface MovieSearchView {
    fun showErrorMessage()
    fun updateView(movies: MutableList<MovieResponse>)
    fun showLoadingDialog()
    fun dismissLoadingDialog()
    fun showTitle()
}