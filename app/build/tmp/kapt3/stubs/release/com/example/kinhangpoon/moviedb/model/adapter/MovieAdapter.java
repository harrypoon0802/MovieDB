package com.example.kinhangpoon.moviedb.model.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0019"}, d2 = {"Lcom/example/kinhangpoon/moviedb/model/adapter/MovieAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/example/kinhangpoon/moviedb/model/adapter/MovieAdapter$MoiveViewHolder;", "movies", "", "Lcom/example/kinhangpoon/moviedb/model/response/MovieResponse;", "delegate", "Lcom/example/kinhangpoon/moviedb/model/adapter/MovieAdapter$SelectedMovieDelegate;", "(Ljava/util/List;Lcom/example/kinhangpoon/moviedb/model/adapter/MovieAdapter$SelectedMovieDelegate;)V", "getDelegate", "()Lcom/example/kinhangpoon/moviedb/model/adapter/MovieAdapter$SelectedMovieDelegate;", "getMovies", "()Ljava/util/List;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MoiveViewHolder", "SelectedMovieDelegate", "app_release"})
public final class MovieAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.example.kinhangpoon.moviedb.model.adapter.MovieAdapter.MoiveViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.kinhangpoon.moviedb.model.response.MovieResponse> movies = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.kinhangpoon.moviedb.model.adapter.MovieAdapter.SelectedMovieDelegate delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.kinhangpoon.moviedb.model.adapter.MovieAdapter.MoiveViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.kinhangpoon.moviedb.model.adapter.MovieAdapter.MoiveViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinhangpoon.moviedb.model.response.MovieResponse> getMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kinhangpoon.moviedb.model.adapter.MovieAdapter.SelectedMovieDelegate getDelegate() {
        return null;
    }
    
    public MovieAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinhangpoon.moviedb.model.response.MovieResponse> movies, @org.jetbrains.annotations.NotNull()
    com.example.kinhangpoon.moviedb.model.adapter.MovieAdapter.SelectedMovieDelegate delegate) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/kinhangpoon/moviedb/model/adapter/MovieAdapter$MoiveViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "app_release"})
    public static final class MoiveViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        
        public MoiveViewHolder(@org.jetbrains.annotations.Nullable()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/kinhangpoon/moviedb/model/adapter/MovieAdapter$SelectedMovieDelegate;", "", "onMovieSelected", "", "movie", "Lcom/example/kinhangpoon/moviedb/model/response/MovieResponse;", "app_release"})
    public static abstract interface SelectedMovieDelegate {
        
        public abstract void onMovieSelected(@org.jetbrains.annotations.NotNull()
        com.example.kinhangpoon.moviedb.model.response.MovieResponse movie);
    }
}