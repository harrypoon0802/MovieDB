package com.example.kinhangpoon.moviedb.presenter

import com.example.kinhangpoon.moviedb.model.response.MovieResponse

interface MovieSearchContract {
    interface View {
        fun showErrorMessage()
        fun updateView(movies: MutableList<MovieResponse>)
        fun showLoadingDialog()
        fun dismissLoadingDialog()
        fun showTitle()

    }

    interface Presenter {
        fun searchByQuery(text: String, index: String)

    }
}