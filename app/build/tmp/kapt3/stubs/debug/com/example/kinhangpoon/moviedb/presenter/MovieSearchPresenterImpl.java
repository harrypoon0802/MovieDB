package com.example.kinhangpoon.moviedb.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0012"}, d2 = {"Lcom/example/kinhangpoon/moviedb/presenter/MovieSearchPresenterImpl;", "", "view", "Lcom/example/kinhangpoon/moviedb/view/MovieSearchView;", "movieSearchRepository", "Lcom/example/kinhangpoon/moviedb/model/service/MovieSearchRepository;", "(Lcom/example/kinhangpoon/moviedb/view/MovieSearchView;Lcom/example/kinhangpoon/moviedb/model/service/MovieSearchRepository;)V", "movieSearchCallback", "Lcom/example/kinhangpoon/moviedb/model/service/MovieSearchRepository$movieSearchCallback;", "getMovieSearchRepository", "()Lcom/example/kinhangpoon/moviedb/model/service/MovieSearchRepository;", "getView", "()Lcom/example/kinhangpoon/moviedb/view/MovieSearchView;", "searchByQuery", "", "text", "", "index", "app_debug"})
public final class MovieSearchPresenterImpl {
    private final com.example.kinhangpoon.moviedb.model.service.MovieSearchRepository.movieSearchCallback movieSearchCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.kinhangpoon.moviedb.view.MovieSearchView view = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.kinhangpoon.moviedb.model.service.MovieSearchRepository movieSearchRepository = null;
    
    public final void searchByQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    java.lang.String index) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kinhangpoon.moviedb.view.MovieSearchView getView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kinhangpoon.moviedb.model.service.MovieSearchRepository getMovieSearchRepository() {
        return null;
    }
    
    @javax.inject.Inject()
    public MovieSearchPresenterImpl(@org.jetbrains.annotations.NotNull()
    com.example.kinhangpoon.moviedb.view.MovieSearchView view, @org.jetbrains.annotations.NotNull()
    com.example.kinhangpoon.moviedb.model.service.MovieSearchRepository movieSearchRepository) {
        super();
    }
}