package com.example.kinhangpoon.moviedb.view

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kinhangpoon.moviedb.MovieSearchActivity.Companion.MOVIE_EXTRAS
import com.example.kinhangpoon.moviedb.R
import com.example.kinhangpoon.moviedb.model.response.MovieResponse
import com.example.kinhangpoon.moviedb.presenter.MovieDetailContract
import com.example.kinhangpoon.moviedb.presenter.MovieDetailPresenterImpl
import kotlinx.android.synthetic.main.fragment_movie_detail.*

class MovieDetailFragment : Fragment(), MovieDetailContract.View {

    lateinit var movie: MovieResponse
    lateinit var movieDetailPresenter: MovieDetailContract.Presenter
    val TITLE = "Title: "
    val ORIGINAL_TITLE = "Original Title: "
    val OVERVIEW = "Overview: "
    val RELEASE_DATE = "Release Date: "
    val VOTE_COUNT = "Vote Count: "
    val VOTE_AVERAGE = "Vote Average: "
    val POPULARITY = "Popularity: "


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val bundle = arguments
        if (bundle != null) {
            movie = bundle.getParcelable(MOVIE_EXTRAS)
        }
        movieDetailPresenter = MovieDetailPresenterImpl(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_movie_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        movie_title.text = TITLE + movie.title
        movie_origin_title.text = ORIGINAL_TITLE + movie.originalTitle
        movie_overview.text = OVERVIEW + movie.overview
        movie_release_date.text = RELEASE_DATE + movie.releaseDate
        movie_popularity.text = POPULARITY+ movie.popularity
        movie_vote_count.text = VOTE_COUNT + movie.voteCount
        movie_vote_average.text = VOTE_AVERAGE + movie.voteAverage
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(MOVIE_EXTRAS, movie)
    }

    companion object {
        fun buildMovieDetailFragment(movie: MovieResponse): MovieDetailFragment {
            val movieDetailFragment = MovieDetailFragment()
            val bundle = Bundle()
            bundle.putParcelable(MOVIE_EXTRAS, movie)
            movieDetailFragment.arguments = bundle
            return movieDetailFragment
        }
    }

}