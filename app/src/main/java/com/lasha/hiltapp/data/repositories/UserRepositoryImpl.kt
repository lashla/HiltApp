package com.lasha.hiltapp.data.repositories

import com.lasha.hiltapp.data.api.UserServiceImpl
import com.lasha.hiltapp.domain.repositories.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(private val userServiceImpl: UserServiceImpl):
    UserRepository {
    override fun getUserText(): String {
        return userServiceImpl.getUser()
    }
}