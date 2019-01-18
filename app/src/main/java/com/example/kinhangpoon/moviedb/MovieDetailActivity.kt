package com.example.kinhangpoon.moviedb

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.kinhangpoon.moviedb.MovieSearchActivity.Companion.MOVIE_EXTRAS
import com.example.kinhangpoon.moviedb.model.response.MovieResponse
import com.example.kinhangpoon.moviedb.view.MovieDetailFragment

class MovieDetailActivity : AppCompatActivity() {
    lateinit var movie: MovieResponse
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)
        if (savedInstanceState != null) {
            movie = savedInstanceState.getParcelable(MOVIE_EXTRAS)
        } else {
            movie = intent.getParcelableExtra(MOVIE_EXTRAS)
        }
        setupFragment(movie);
    }

    private fun setupFragment(movie: MovieResponse) {

        supportFragmentManager.beginTransaction()
            .replace(
                R.id.content_container,
                MovieDetailFragment.buildMovieDetailFragment(movie),
                MovieDetailFragment::class.java.simpleName
            ).commit()
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(MOVIE_EXTRAS, movie)
    }
}
