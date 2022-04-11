package com.lasha.hiltapp.data.api_Implementations

import com.lasha.hiltapp.domain.api.LoginService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class LoginServiceImpl: LoginService {
    @Provides
    override fun getLogin(): String {
        return super.getLogin()
    }
}