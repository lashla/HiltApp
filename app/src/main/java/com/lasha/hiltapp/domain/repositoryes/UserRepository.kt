package com.lasha.hiltapp.domain.repositoryes

import com.lasha.hiltapp.data.UserService
import com.lasha.hiltapp.data.UserServiceImpl
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
interface UserInterface {
    fun getUserText(): String = "FirstUserText"
}

@Singleton
class UserRepository @Inject constructor(private val userServiceImpl: UserServiceImpl): UserInterface {
    override fun getUserText(): String {
        return userServiceImpl.getUser()
    }
}