package com.lasha.hiltapp.domain.di

import com.lasha.hiltapp.data.api_Implementations.UserServiceImpl
import com.lasha.hiltapp.data.repo_implementations.UserRepositoryImpl
import com.lasha.hiltapp.domain.repositoryes.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UserModule  {

    @Provides
    @Singleton
    fun providesRepository() : UserRepository{
        return UserRepositoryImpl(UserServiceImpl())
    }

}