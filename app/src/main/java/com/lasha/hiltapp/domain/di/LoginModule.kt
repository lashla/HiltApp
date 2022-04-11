package com.lasha.hiltapp.domain.di

import com.lasha.hiltapp.data.api_Implementations.LoginServiceImpl
import com.lasha.hiltapp.data.repo_implementations.LoginRepositoryImpl
import com.lasha.hiltapp.domain.repositoryes.LoginRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LoginModule  {

    @Provides
    @Singleton
    fun providesRepository() : LoginRepository{
        return LoginRepositoryImpl(LoginServiceImpl())
    }

}