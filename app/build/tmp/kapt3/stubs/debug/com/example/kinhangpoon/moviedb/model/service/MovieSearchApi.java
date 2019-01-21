package com.example.kinhangpoon.moviedb.model.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H\'\u00a8\u0006\t"}, d2 = {"Lcom/example/kinhangpoon/moviedb/model/service/MovieSearchApi;", "", "searchMovie", "Lretrofit2/Call;", "Lcom/example/kinhangpoon/moviedb/model/response/Response;", "apiKey", "", "query", "page", "app_debug"})
public abstract interface MovieSearchApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "movie")
    public abstract retrofit2.Call<com.example.kinhangpoon.moviedb.model.response.Response> searchMovie(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "query")
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "page")
    java.lang.String page);
}