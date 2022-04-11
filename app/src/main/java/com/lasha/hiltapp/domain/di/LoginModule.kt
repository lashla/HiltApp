package com.lasha.hiltapp.domain.di

import com.lasha.hiltapp.data.LoginServiceImpl
import com.lasha.hiltapp.domain.repositoryes.FilesInterface
import com.lasha.hiltapp.domain.repositoryes.FilesRepository
import com.lasha.hiltapp.domain.repositoryes.LoginInterface
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
    fun providesRepository() : LoginInterface {
        return LoginRepository(LoginServiceImpl())
    }

}