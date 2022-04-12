package com.lasha.hiltapp.di

import com.lasha.hiltapp.data.api.FilesServiceImpl
import com.lasha.hiltapp.data.api.LoginServiceImpl
import com.lasha.hiltapp.data.api.UserServiceImpl
import com.lasha.hiltapp.domain.api.FilesService
import com.lasha.hiltapp.domain.api.LoginService
import com.lasha.hiltapp.domain.api.UserService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiServicesModule {

    @Provides
    @Singleton
    fun provideFileService(): FilesService{
        return FilesServiceImpl()
    }

    @Provides
    @Singleton
    fun provideUserService(): UserService {
        return UserServiceImpl()
    }

    @Provides
    @Singleton
    fun provideLoginService(): LoginService{
        return LoginServiceImpl()
    }
}