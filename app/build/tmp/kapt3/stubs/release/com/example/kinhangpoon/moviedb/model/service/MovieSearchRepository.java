package com.example.kinhangpoon.moviedb.model.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0011\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/example/kinhangpoon/moviedb/model/service/MovieSearchRepository;", "", "movieSearchApi", "Lcom/example/kinhangpoon/moviedb/model/service/MovieSearchApi;", "(Lcom/example/kinhangpoon/moviedb/model/service/MovieSearchApi;)V", "getMovieSearchApi", "()Lcom/example/kinhangpoon/moviedb/model/service/MovieSearchApi;", "searchByQuery", "", "text", "", "index", "movieSearchCallback", "Lcom/example/kinhangpoon/moviedb/model/service/MovieSearchRepository$movieSearchCallback;", "app_release"})
public final class MovieSearchRepository {
    @org.jetbrains.annotations.Nullable()
    private final com.example.kinhangpoon.moviedb.model.service.MovieSearchApi movieSearchApi = null;
    
    public final void searchByQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    java.lang.String index, @org.jetbrains.annotations.NotNull()
    com.example.kinhangpoon.moviedb.model.service.MovieSearchRepository.movieSearchCallback movieSearchCallback) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.kinhangpoon.moviedb.model.service.MovieSearchApi getMovieSearchApi() {
        return null;
    }
    
    @javax.inject.Inject()
    public MovieSearchRepository(@org.jetbrains.annotations.Nullable()
    com.example.kinhangpoon.moviedb.model.service.MovieSearchApi movieSearchApi) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/example/kinhangpoon/moviedb/model/service/MovieSearchRepository$movieSearchCallback;", "", "onFailure", "", "onSuccess", "movies", "", "Lcom/example/kinhangpoon/moviedb/model/response/MovieResponse;", "app_release"})
    public static abstract interface movieSearchCallback {
        
        public abstract void onSuccess(@org.jetbrains.annotations.NotNull()
        java.util.List<com.example.kinhangpoon.moviedb.model.response.MovieResponse> movies);
        
        public abstract void onFailure();
    }
}