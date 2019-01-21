package com.example.kinhangpoon.moviedb.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J&\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020#H\u0016J\u001a\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020%2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010.\u001a\u00020!H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u00060"}, d2 = {"Lcom/example/kinhangpoon/moviedb/view/MovieDetailFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/example/kinhangpoon/moviedb/view/MovieDetailView;", "()V", "ORIGINAL_TITLE", "", "getORIGINAL_TITLE", "()Ljava/lang/String;", "OVERVIEW", "getOVERVIEW", "POPULARITY", "getPOPULARITY", "RELEASE_DATE", "getRELEASE_DATE", "TITLE", "getTITLE", "VOTE_AVERAGE", "getVOTE_AVERAGE", "VOTE_COUNT", "getVOTE_COUNT", "movie", "Lcom/example/kinhangpoon/moviedb/model/response/MovieResponse;", "getMovie", "()Lcom/example/kinhangpoon/moviedb/model/response/MovieResponse;", "setMovie", "(Lcom/example/kinhangpoon/moviedb/model/response/MovieResponse;)V", "movieDetailPresenter", "Lcom/example/kinhangpoon/moviedb/presenter/MovieDetailPresenterImpl;", "getMovieDetailPresenter", "()Lcom/example/kinhangpoon/moviedb/presenter/MovieDetailPresenterImpl;", "setMovieDetailPresenter", "(Lcom/example/kinhangpoon/moviedb/presenter/MovieDetailPresenterImpl;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onSaveInstanceState", "outState", "onViewCreated", "view", "resolveDaggerDependency", "Companion", "app_debug"})
public final class MovieDetailFragment extends android.support.v4.app.Fragment implements com.example.kinhangpoon.moviedb.view.MovieDetailView {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.example.kinhangpoon.moviedb.presenter.MovieDetailPresenterImpl movieDetailPresenter;
    @org.jetbrains.annotations.NotNull()
    public com.example.kinhangpoon.moviedb.model.response.MovieResponse movie;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TITLE = "Title: ";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ORIGINAL_TITLE = "Original Title: ";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String OVERVIEW = "Overview: ";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String RELEASE_DATE = "Release Date: ";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String VOTE_COUNT = "Vote Count: ";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String VOTE_AVERAGE = "Vote Average: ";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String POPULARITY = "Popularity: ";
    public static final com.example.kinhangpoon.moviedb.view.MovieDetailFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kinhangpoon.moviedb.presenter.MovieDetailPresenterImpl getMovieDetailPresenter() {
        return null;
    }
    
    public final void setMovieDetailPresenter(@org.jetbrains.annotations.NotNull()
    com.example.kinhangpoon.moviedb.presenter.MovieDetailPresenterImpl p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kinhangpoon.moviedb.model.response.MovieResponse getMovie() {
        return null;
    }
    
    public final void setMovie(@org.jetbrains.annotations.NotNull()
    com.example.kinhangpoon.moviedb.model.response.MovieResponse p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTITLE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getORIGINAL_TITLE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOVERVIEW() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRELEASE_DATE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVOTE_COUNT() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVOTE_AVERAGE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPOPULARITY() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void resolveDaggerDependency() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    public MovieDetailFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/kinhangpoon/moviedb/view/MovieDetailFragment$Companion;", "", "()V", "buildMovieDetailFragment", "Lcom/example/kinhangpoon/moviedb/view/MovieDetailFragment;", "movie", "Lcom/example/kinhangpoon/moviedb/model/response/MovieResponse;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.kinhangpoon.moviedb.view.MovieDetailFragment buildMovieDetailFragment(@org.jetbrains.annotations.NotNull()
        com.example.kinhangpoon.moviedb.model.response.MovieResponse movie) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}