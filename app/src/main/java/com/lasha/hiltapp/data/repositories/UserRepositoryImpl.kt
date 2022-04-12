package com.lasha.hiltapp.data.repositories

import com.lasha.hiltapp.domain.api.UserService
import com.lasha.hiltapp.domain.repositories.UserRepository

class UserRepositoryImpl(private val userService: UserService) : UserRepository {
    override fun getUserText(): String {
        return userService.getUser()
    }
}