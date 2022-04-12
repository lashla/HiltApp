package com.lasha.hiltapp.di

import com.lasha.hiltapp.data.repositories.FilesRepositoryImpl
import com.lasha.hiltapp.data.repositories.LoginRepositoryImpl
import com.lasha.hiltapp.data.repositories.UserRepositoryImpl
import com.lasha.hiltapp.domain.api.FilesService
import com.lasha.hiltapp.domain.api.LoginService
import com.lasha.hiltapp.domain.api.UserService
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
object RepositoriesModule{

    @Provides
    @Singleton
    fun providesUserRepository(provideUserService: UserService) : UserRepository {
        return UserRepositoryImpl(provideUserService)
    }

    @Provides
    @Singleton
    fun providesLoginRepository(provideLoginService: LoginService) : LoginRepository {
        return LoginRepositoryImpl(provideLoginService)
    }

    @Provides
    @Singleton
    fun providesFilesRepository(provideFilesService: FilesService) : FilesRepository {
        return FilesRepositoryImpl(provideFilesService)
    }

}