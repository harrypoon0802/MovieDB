package com.example.kinhangpoon.moviedb

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.kinhangpoon.moviedb.common.ProgressDialogFragment
import com.example.kinhangpoon.moviedb.common.ProgressDialogFragment.Companion.DIALOG_TAG
import com.example.kinhangpoon.moviedb.model.response.MovieResponse
import com.example.kinhangpoon.moviedb.view.MovieSearchFragment

/**
 * used MVP design pattern to develop this application
 * used dagger2 for dependency injection
 * used retrofit to make api call to fetch Movie data
 * added progress dialog while making api call so that user can't do anything until call is finished
 * used RecycleView to show the lists of movie results
 * implemented lazy loading when scrolled to the bottom of the list and appended to the list
 * use a split screen for tablets
 */
class MovieSearchActivity : AppCompatActivity(), MovieSearchFragment.MovieHost {

    companion object {
        val MOVIE_EXTRAS = "movie extras"
        val QUERY_EXTRAS = "query extras"
    }

    var query = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_search)
        if (savedInstanceState != null) {
            query = savedInstanceState.getString(QUERY_EXTRAS)
        }
        setupFragment(query);
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putString(QUERY_EXTRAS, query)
    }

    private fun setupFragment(query: String) {
        supportFragmentManager.beginTransaction()
            .replace(
                R.id.content_container,
                MovieSearchFragment.buildMovieSearchFragment(query),
                MovieSearchFragment::class.java.simpleName
            ).commit()
    }

    override fun showLoadingDialog(isShow: Boolean) {
        if (isShow) {
            val progressDialogFragment =
                ProgressDialogFragment.buildProgressDialogFragment(R.string.loading_data, false)
            progressDialogFragment.show(this.supportFragmentManager, DIALOG_TAG)
        } else {
            val progressDialogFragment: ProgressDialogFragment =
                supportFragmentManager.findFragmentByTag(DIALOG_TAG) as ProgressDialogFragment
            if (progressDialogFragment != null) {
                progressDialogFragment.dismiss()
            }
        }
    }

    override fun selectMovie(movie: MovieResponse) {
        val intent = Intent(this, MovieDetailActivity::class.java)
        intent.putExtra(MOVIE_EXTRAS, movie)
        /**
         * split screen for tablet
         */
        if (isTablet()) {
            intent.addFlags(
                Intent.FLAG_ACTIVITY_LAUNCH_ADJACENT
                        or Intent.FLAG_ACTIVITY_MULTIPLE_TASK
                        or Intent.FLAG_ACTIVITY_NEW_TASK
            )
        }

        startActivity(intent)
    }

    fun isTablet(): Boolean {
        val xlarge =
            getResources().getConfiguration().screenLayout and
                    Configuration.SCREENLAYOUT_SIZE_MASK == 4
        val large =
            getResources().getConfiguration().screenLayout and
                    Configuration.SCREENLAYOUT_SIZE_MASK == Configuration.SCREENLAYOUT_SIZE_LARGE
        return xlarge || large
    }

    override fun setQueryText(text: String) {
        query = text
    }
}
