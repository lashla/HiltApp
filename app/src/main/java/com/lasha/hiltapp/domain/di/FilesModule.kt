package com.lasha.hiltapp.domain.di

import com.lasha.hiltapp.data.api_Implementations.FilesServiceImpl
import com.lasha.hiltapp.data.repo_implementations.FilesRepositoryImpl
import com.lasha.hiltapp.domain.repositoryes.FilesRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class FilesModule  {

    @Provides
    @Singleton
    fun providesRepository() : FilesRepository {
        return FilesRepositoryImpl(FilesServiceImpl())
    }

}