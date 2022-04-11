package com.lasha.hiltapp.domain.api

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Singleton
interface UserService {
    fun getUser(): String {
        return "USERDone"
    }
}

