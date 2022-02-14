package com.example.hilt1

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object appModule {

    @Singleton
    @Provides
     @Named("sr1")
    fun provideString()="hello to hilt"

    @Singleton
    @Provides
    @Named("str2")
    fun provideString1()="this is first hilt ex"
}