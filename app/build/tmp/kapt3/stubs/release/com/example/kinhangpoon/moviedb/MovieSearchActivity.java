package com.example.kinhangpoon.moviedb;

import java.lang.System;

/**
 * * used MVP design pattern to develop this application
 * * used dagger2 for dependency injection
 * * used retrofit to make api call to fetch Movie data
 * * added progress dialog while making api call so that user can't do anything until call is finished
 * * used RecycleView to show the lists of movie results
 * * implemented lazy loading when scrolled to the bottom of the list and appended to the list
 * * use a split screen for tablets
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bJ\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0014J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0005H\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u001b"}, d2 = {"Lcom/example/kinhangpoon/moviedb/MovieSearchActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/example/kinhangpoon/moviedb/view/MovieSearchFragment$MovieHost;", "()V", "query", "", "getQuery", "()Ljava/lang/String;", "setQuery", "(Ljava/lang/String;)V", "isTablet", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "outState", "selectMovie", "movie", "Lcom/example/kinhangpoon/moviedb/model/response/MovieResponse;", "setQueryText", "text", "setupFragment", "showLoadingDialog", "isShow", "Companion", "app_release"})
public final class MovieSearchActivity extends android.support.v7.app.AppCompatActivity implements com.example.kinhangpoon.moviedb.view.MovieSearchFragment.MovieHost {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String query;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String MOVIE_EXTRAS = "movie extras";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String QUERY_EXTRAS = "query extras";
    public static final com.example.kinhangpoon.moviedb.MovieSearchActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQuery() {
        return null;
    }
    
    public final void setQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.Nullable()
    android.os.Bundle outState) {
    }
    
    private final void setupFragment(java.lang.String query) {
    }
    
    @java.lang.Override()
    public void showLoadingDialog(boolean isShow) {
    }
    
    @java.lang.Override()
    public void selectMovie(@org.jetbrains.annotations.NotNull()
    com.example.kinhangpoon.moviedb.model.response.MovieResponse movie) {
    }
    
    public final boolean isTablet() {
        return false;
    }
    
    @java.lang.Override()
    public void setQueryText(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public MovieSearchActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/example/kinhangpoon/moviedb/MovieSearchActivity$Companion;", "", "()V", "MOVIE_EXTRAS", "", "getMOVIE_EXTRAS", "()Ljava/lang/String;", "QUERY_EXTRAS", "getQUERY_EXTRAS", "app_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMOVIE_EXTRAS() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getQUERY_EXTRAS() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}