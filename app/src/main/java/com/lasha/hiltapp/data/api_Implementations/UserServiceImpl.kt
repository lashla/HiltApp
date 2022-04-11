package com.lasha.hiltapp.data.api_Implementations

import com.lasha.hiltapp.domain.api.UserService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class UserServiceImpl: UserService {
    @Provides
    override fun getUser(): String {
        return super.getUser()
    }
}