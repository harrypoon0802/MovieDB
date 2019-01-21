package com.example.kinhangpoon.moviedb.dagger.components

import com.example.kinhangpoon.moviedb.dagger.module.MovieDetailModule
import com.example.kinhangpoon.moviedb.dagger.scope.MovieScope
import com.example.kinhangpoon.moviedb.view.MovieDetailFragment
import dagger.Component

@MovieScope
@Component(modules = [MovieDetailModule::class])
interface MovieDetailComponent {
    fun inject(fragment: MovieDetailFragment)
}