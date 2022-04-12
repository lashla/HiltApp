package com.lasha.hiltapp.data.api

import com.lasha.hiltapp.domain.api.LoginService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

class LoginServiceImpl: LoginService {

    override fun getLogin(): String {
        return "LoginText"
    }
}