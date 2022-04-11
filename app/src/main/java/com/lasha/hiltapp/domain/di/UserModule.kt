package com.lasha.hiltapp.domain.di

import com.lasha.hiltapp.data.UserServiceImpl
import com.lasha.hiltapp.domain.repositoryes.FilesInterface
import com.lasha.hiltapp.domain.repositoryes.FilesRepository
import com.lasha.hiltapp.domain.repositoryes.UserInterface
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
    fun providesRepository() : UserInterface {
        return UserRepository(UserServiceImpl())
    }

}