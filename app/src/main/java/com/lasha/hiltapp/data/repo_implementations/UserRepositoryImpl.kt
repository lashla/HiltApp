package com.lasha.hiltapp.data.repo_implementations

import com.lasha.hiltapp.data.api_Implementations.UserServiceImpl
import com.lasha.hiltapp.domain.repositoryes.UserRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepositoryImpl @Inject constructor(private val userServiceImpl: UserServiceImpl):
    UserRepository {
    override fun getUserText(): String {
        return userServiceImpl.getUser()
    }
}