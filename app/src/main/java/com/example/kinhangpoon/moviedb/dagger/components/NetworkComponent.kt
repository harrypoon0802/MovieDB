package com.example.kinhangpoon.moviedb.dagger.components

import android.content.Context
import com.example.kinhangpoon.moviedb.dagger.module.NetworkModule
import dagger.Component
import retrofit2.Retrofit
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface NetworkComponent {

    fun exposeRetrofit(): Retrofit

    fun exposeContext(): Context
}