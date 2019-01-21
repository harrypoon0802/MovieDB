package com.example.kinhangpoon.moviedb.presenter

import com.example.kinhangpoon.moviedb.model.response.MovieResponse
import com.example.kinhangpoon.moviedb.model.service.MovieSearchRepository
import com.example.kinhangpoon.moviedb.view.MovieSearchView
import javax.inject.Inject

class MovieSearchPresenterImpl @Inject constructor(
    val view: MovieSearchView,
    val movieSearchRepository: MovieSearchRepository
) {

    private val movieSearchCallback = object : MovieSearchRepository.movieSearchCallback {
        override fun onSuccess(movies: MutableList<MovieResponse>) {
            view.dismissLoadingDialog()
            view.showTitle()
            view.updateView(movies)
        }

        override fun onFailure() {
            view.dismissLoadingDialog()
            view.showErrorMessage()
        }

    }

    fun searchByQuery(text: String, index: String) {
        view.showLoadingDialog()
        movieSearchRepository.searchByQuery(text, index, movieSearchCallback)
    }

}