package com.example.kinhangpoon.moviedb.dagger.module

import com.example.kinhangpoon.moviedb.dagger.scope.MovieScope
import com.example.kinhangpoon.moviedb.model.service.MovieSearchApi
import com.example.kinhangpoon.moviedb.view.MovieSearchView
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class MovieSearchModule(val view: MovieSearchView) {
    @MovieScope
    @Provides
    fun provideMovieSearchApi(retrofit: Retrofit): MovieSearchApi {
        return retrofit.create(MovieSearchApi::class.java)
    }

    @MovieScope
    @Provides
    fun provideView(): MovieSearchView {
        return view
    }
}