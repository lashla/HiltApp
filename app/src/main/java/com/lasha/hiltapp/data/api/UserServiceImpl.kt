package com.lasha.hiltapp.data.api

import com.lasha.hiltapp.domain.api.UserService

class UserServiceImpl: UserService {
    override fun getUser(): String {
        return "UserDoneText"
    }
}