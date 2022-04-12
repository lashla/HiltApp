package com.lasha.hiltapp.domain.di

import com.lasha.hiltapp.data.api.FilesServiceImpl
import com.lasha.hiltapp.data.api.LoginServiceImpl
import com.lasha.hiltapp.data.api.UserServiceImpl
import com.lasha.hiltapp.data.repositories.FilesRepositoryImpl
import com.lasha.hiltapp.data.repositories.LoginRepositoryImpl
import com.lasha.hiltapp.data.repositories.UserRepositoryImpl
import com.lasha.hiltapp.domain.repositories.FilesRepository
import com.lasha.hiltapp.domain.repositories.LoginRepository
import com.lasha.hiltapp.domain.repositories.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoriesModule {

    @Provides
    @Singleton
    fun providesUserRepository() : UserRepository {
        return UserRepositoryImpl(UserServiceImpl())
    }

    @Provides
    @Singleton
    fun providesLoginRepository() : LoginRepository {
        return LoginRepositoryImpl(LoginServiceImpl())
    }

    @Provides
    @Singleton
    fun providesFilesRepository() : FilesRepository {
        return FilesRepositoryImpl(FilesServiceImpl())
    }

}