// Generated by Dagger (https://google.github.io/dagger).
package com.example.kinhangpoon.moviedb.dagger.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import retrofit2.Retrofit;

public final class NetworkModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final NetworkModule module;

  public NetworkModule_ProvideRetrofitFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public Retrofit get() {
    return Preconditions.checkNotNull(
        module.provideRetrofit(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static NetworkModule_ProvideRetrofitFactory create(NetworkModule module) {
    return new NetworkModule_ProvideRetrofitFactory(module);
  }

  public static Retrofit proxyProvideRetrofit(NetworkModule instance) {
    return Preconditions.checkNotNull(
        instance.provideRetrofit(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
