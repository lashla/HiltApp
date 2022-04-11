package com.lasha.hiltapp.data

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

@Module
@InstallIn(SingletonComponent::class)
class UserServiceImpl: UserService {
    @Provides
    override fun getUser(): String {
        return super.getUser()
    }
}