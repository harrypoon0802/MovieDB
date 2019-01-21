package com.example.kinhangpoon.moviedb.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&\u00a8\u0006\u000b"}, d2 = {"Lcom/example/kinhangpoon/moviedb/view/MovieSearchView;", "", "dismissLoadingDialog", "", "showErrorMessage", "showLoadingDialog", "showTitle", "updateView", "movies", "", "Lcom/example/kinhangpoon/moviedb/model/response/MovieResponse;", "app_debug"})
public abstract interface MovieSearchView {
    
    public abstract void showErrorMessage();
    
    public abstract void updateView(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinhangpoon.moviedb.model.response.MovieResponse> movies);
    
    public abstract void showLoadingDialog();
    
    public abstract void dismissLoadingDialog();
    
    public abstract void showTitle();
}