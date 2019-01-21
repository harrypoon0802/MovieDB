package com.example.kinhangpoon.moviedb.model.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJD\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR&\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0011\u0010\u000bR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0012\u0010\u000b\u00a8\u0006\u001f"}, d2 = {"Lcom/example/kinhangpoon/moviedb/model/response/Response;", "", "page", "", "totalPages", "results", "", "Lcom/example/kinhangpoon/moviedb/model/response/MovieResponse;", "totalResults", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;)V", "getPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getResults", "()Ljava/util/List;", "setResults", "(Ljava/util/List;)V", "getTotalPages", "getTotalResults", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;)Lcom/example/kinhangpoon/moviedb/model/response/Response;", "equals", "", "other", "hashCode", "toString", "", "app_release"})
public final class Response {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "page")
    private final java.lang.Integer page = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "total_pages")
    private final java.lang.Integer totalPages = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "results")
    private java.util.List<com.example.kinhangpoon.moviedb.model.response.MovieResponse> results;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "total_results")
    private final java.lang.Integer totalResults = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotalPages() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.kinhangpoon.moviedb.model.response.MovieResponse> getResults() {
        return null;
    }
    
    public final void setResults(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.kinhangpoon.moviedb.model.response.MovieResponse> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotalResults() {
        return null;
    }
    
    public Response(@org.jetbrains.annotations.Nullable()
    java.lang.Integer page, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalPages, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.kinhangpoon.moviedb.model.response.MovieResponse> results, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalResults) {
        super();
    }
    
    public Response() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.kinhangpoon.moviedb.model.response.MovieResponse> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kinhangpoon.moviedb.model.response.Response copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer page, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalPages, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.kinhangpoon.moviedb.model.response.MovieResponse> results, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalResults) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}