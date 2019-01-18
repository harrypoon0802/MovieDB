package com.example.kinhangpoon.moviedb.presenter

import com.example.kinhangpoon.moviedb.model.response.MovieResponse
import com.example.kinhangpoon.moviedb.model.service.MovieSearchRepository

class MovieSearchPresenterImpl(val view: MovieSearchContract.View, val movieSearchRepository: MovieSearchRepository) :
    MovieSearchContract.Presenter {

    private val movieSearchCallback = object : MovieSearchRepository.movieSearchCallback{
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
    override fun searchByQuery(text: String, index: String) {
        view.showLoadingDialog()
        movieSearchRepository.searchByQuery(text, index, movieSearchCallback)
    }

}