package com.example.kinhangpoon.moviedb.dagger.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/example/kinhangpoon/moviedb/dagger/module/MovieDetailModule;", "", "view", "Lcom/example/kinhangpoon/moviedb/view/MovieDetailView;", "(Lcom/example/kinhangpoon/moviedb/view/MovieDetailView;)V", "getView", "()Lcom/example/kinhangpoon/moviedb/view/MovieDetailView;", "provideView", "app_debug"})
@dagger.Module()
public final class MovieDetailModule {
    @org.jetbrains.annotations.NotNull()
    private final com.example.kinhangpoon.moviedb.view.MovieDetailView view = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @com.example.kinhangpoon.moviedb.dagger.scope.MovieScope()
    public final com.example.kinhangpoon.moviedb.view.MovieDetailView provideView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kinhangpoon.moviedb.view.MovieDetailView getView() {
        return null;
    }
    
    public MovieDetailModule(@org.jetbrains.annotations.NotNull()
    com.example.kinhangpoon.moviedb.view.MovieDetailView view) {
        super();
    }
}