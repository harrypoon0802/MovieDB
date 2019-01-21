package com.example.kinhangpoon.moviedb.dagger.module

import com.example.kinhangpoon.moviedb.dagger.scope.MovieScope
import com.example.kinhangpoon.moviedb.view.MovieDetailView
import dagger.Module
import dagger.Provides

@Module
class MovieDetailModule(val view: MovieDetailView) {
    @MovieScope
    @Provides
    fun provideView(): MovieDetailView {
        return view
    }
}