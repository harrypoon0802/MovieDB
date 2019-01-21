// Generated by Dagger (https://google.github.io/dagger).
package com.example.kinhangpoon.moviedb.presenter;

import com.example.kinhangpoon.moviedb.model.service.MovieSearchRepository;
import com.example.kinhangpoon.moviedb.view.MovieSearchView;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class MovieSearchPresenterImpl_Factory implements Factory<MovieSearchPresenterImpl> {
  private final Provider<MovieSearchView> viewProvider;

  private final Provider<MovieSearchRepository> movieSearchRepositoryProvider;

  public MovieSearchPresenterImpl_Factory(
      Provider<MovieSearchView> viewProvider,
      Provider<MovieSearchRepository> movieSearchRepositoryProvider) {
    this.viewProvider = viewProvider;
    this.movieSearchRepositoryProvider = movieSearchRepositoryProvider;
  }

  @Override
  public MovieSearchPresenterImpl get() {
    return new MovieSearchPresenterImpl(viewProvider.get(), movieSearchRepositoryProvider.get());
  }

  public static MovieSearchPresenterImpl_Factory create(
      Provider<MovieSearchView> viewProvider,
      Provider<MovieSearchRepository> movieSearchRepositoryProvider) {
    return new MovieSearchPresenterImpl_Factory(viewProvider, movieSearchRepositoryProvider);
  }
}