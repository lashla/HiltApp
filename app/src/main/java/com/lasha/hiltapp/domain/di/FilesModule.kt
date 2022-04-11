package com.lasha.hiltapp.domain.di

import com.lasha.hiltapp.data.FilesServiceImpl
import com.lasha.hiltapp.domain.repositoryes.FilesInterface
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
    fun providesRepository() : FilesInterface {
        return FilesRepository(FilesServiceImpl())
    }

}