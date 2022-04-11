package com.lasha.hiltapp.data

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Singleton
interface LoginService {

    fun getLogin(): String{
        return "LOGINDone"
    }

}

@Module
@InstallIn(SingletonComponent::class)
class LoginServiceImpl: LoginService {
    @Provides
    override fun getLogin(): String {
        return super.getLogin()
    }
}