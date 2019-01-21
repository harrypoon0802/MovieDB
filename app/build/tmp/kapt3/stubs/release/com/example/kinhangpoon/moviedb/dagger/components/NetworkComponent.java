package com.example.kinhangpoon.moviedb.dagger.components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/kinhangpoon/moviedb/dagger/components/NetworkComponent;", "", "exposeContext", "Landroid/content/Context;", "exposeRetrofit", "Lretrofit2/Retrofit;", "app_release"})
@dagger.Component(modules = {com.example.kinhangpoon.moviedb.dagger.module.NetworkModule.class})
@javax.inject.Singleton()
public abstract interface NetworkComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Retrofit exposeRetrofit();
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context exposeContext();
}