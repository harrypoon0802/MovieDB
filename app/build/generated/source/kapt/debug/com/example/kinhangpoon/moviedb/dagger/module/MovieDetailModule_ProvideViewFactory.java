// Generated by Dagger (https://google.github.io/dagger).
package com.example.kinhangpoon.moviedb.dagger.module;

import com.example.kinhangpoon.moviedb.view.MovieDetailView;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class MovieDetailModule_ProvideViewFactory implements Factory<MovieDetailView> {
  private final MovieDetailModule module;

  public MovieDetailModule_ProvideViewFactory(MovieDetailModule module) {
    this.module = module;
  }

  @Override
  public MovieDetailView get() {
    return Preconditions.checkNotNull(
        module.provideView(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static MovieDetailModule_ProvideViewFactory create(MovieDetailModule module) {
    return new MovieDetailModule_ProvideViewFactory(module);
  }

  public static MovieDetailView proxyProvideView(MovieDetailModule instance) {
    return Preconditions.checkNotNull(
        instance.provideView(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
