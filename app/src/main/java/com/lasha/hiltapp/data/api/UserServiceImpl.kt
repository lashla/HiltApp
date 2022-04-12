package com.lasha.hiltapp.data.api

import com.lasha.hiltapp.domain.api.UserService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

class UserServiceImpl: UserService {

    override fun getUser(): String {
        return "UserText"
    }
}