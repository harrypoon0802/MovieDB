package com.example.kinhangpoon.moviedb.view

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.support.v4.app.Fragment
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import android.widget.Toast
import com.example.kinhangpoon.moviedb.MovieSearchActivity.Companion.QUERY_EXTRAS
import com.example.kinhangpoon.moviedb.R
import com.example.kinhangpoon.moviedb.model.adapter.MovieAdapter
import com.example.kinhangpoon.moviedb.model.response.MovieResponse
import com.example.kinhangpoon.moviedb.model.service.MovieSearchApi
import com.example.kinhangpoon.moviedb.model.service.MovieSearchRepository
import com.example.kinhangpoon.moviedb.model.service.RetrofitInstance
import com.example.kinhangpoon.moviedb.presenter.MovieSearchContract
import com.example.kinhangpoon.moviedb.presenter.MovieSearchPresenterImpl
import kotlinx.android.synthetic.main.fragment_movie_search.*

class MovieSearchFragment : Fragment(), MovieSearchContract.View {

    interface MovieHost {
        fun showLoadingDialog(isShow: Boolean)
        fun selectMovie(movie: MovieResponse)
        fun setQueryText(text: String)
    }

    lateinit var movieSearchPresenter: MovieSearchContract.Presenter
    lateinit var movieAdapter: MovieAdapter
    lateinit var movieList: MutableList<MovieResponse>
    lateinit var linearLayoutManager: LinearLayoutManager
    lateinit var host: MovieHost
    lateinit var query: String
    var index = 1
    var isScrolling = false
    var currentItem = 0
    var totalItem = 0
    var scrollOutItem = 0

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        host = context as MovieHost
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bundle = arguments
        if (bundle != null) {
            query = bundle.getString(QUERY_EXTRAS)
        }
        val movieSearchApi = RetrofitInstance.getRetrofitInstance()?.create(MovieSearchApi::class.java)
        val movieSearchRepository = MovieSearchRepository(movieSearchApi)
        movieSearchPresenter = MovieSearchPresenterImpl(this, movieSearchRepository)
        movieList = mutableListOf()
        movieAdapter = MovieAdapter(movieList, object : MovieAdapter.SelectedMovieDelegate {
            override fun onMovieSelected(
                movie: MovieResponse
            ) {
                host.selectMovie(movie)
            }
        })
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_movie_search, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        /**
         * check query text so that it can automatically set query when screen orientation changes
         */
        if (!query.isEmpty()) {
            search_text.setText(query)
        }
        search_text.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                movieList.clear()
            }

        })
        submit_button.setOnClickListener {
            val text = search_text.text.toString()
            /**
             * save query text so that it can save query text when screen orientation changes
             */
            host.setQueryText(text)
            if (!text.isEmpty()) {
                fetchData(text, index)
            }
        }

        linearLayoutManager = LinearLayoutManager(context)
        recycleView.layoutManager = linearLayoutManager
        recycleView.addItemDecoration(DividerItemDecoration(context, LinearLayoutManager.VERTICAL))
        recycleView.adapter = movieAdapter
        /**
         * lazy loading
         */
        recycleView.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView?, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                if (newState == AbsListView.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL) {
                    isScrolling = true
                }
            }

            override fun onScrolled(recyclerView: RecyclerView?, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                currentItem = linearLayoutManager.childCount
                totalItem = linearLayoutManager.itemCount
                scrollOutItem = linearLayoutManager.findFirstVisibleItemPosition()

                if (isScrolling && totalItem == currentItem + scrollOutItem) {
                    isScrolling = false
                    index++;
                    fetchData(search_text.text.toString(), index)
                }
            }
        })
    }

    private fun fetchData(text: String, index: Int) {
        if (index > 100) {
            Toast.makeText(context, R.string.no_more_results, Toast.LENGTH_SHORT).show()
            return;
        }
        Handler().postDelayed({ movieSearchPresenter.searchByQuery(text, "$index") }, 300)
    }

    override fun showErrorMessage() {
        Toast.makeText(context, R.string.network_error, Toast.LENGTH_SHORT).show()
    }

    override fun updateView(movies: MutableList<MovieResponse>) {
        movieList.addAll(movies)
        movieAdapter.notifyDataSetChanged()
    }

    override fun showLoadingDialog() {
        host.showLoadingDialog(true)
    }

    override fun dismissLoadingDialog() {
        host.showLoadingDialog(false)
    }

    override fun showTitle() {
        title.visibility = View.VISIBLE
    }

    companion object {
        fun buildMovieSearchFragment(query: String): MovieSearchFragment {
            val movieSearchFragment = MovieSearchFragment()
            val bundle = Bundle()
            bundle.putString(QUERY_EXTRAS, query)
            movieSearchFragment.arguments = bundle
            return movieSearchFragment
        }
    }
}