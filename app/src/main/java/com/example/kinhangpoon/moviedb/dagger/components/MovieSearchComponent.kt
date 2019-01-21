package com.example.kinhangpoon.moviedb.dagger.components

import com.example.kinhangpoon.moviedb.dagger.module.MovieSearchModule
import com.example.kinhangpoon.moviedb.dagger.scope.MovieScope
import com.example.kinhangpoon.moviedb.view.MovieSearchFragment
import dagger.Component

@MovieScope
@Component(modules = [MovieSearchModule::class], dependencies = [NetworkComponent::class])
interface MovieSearchComponent {
    fun inject(fragment: MovieSearchFragment)
}