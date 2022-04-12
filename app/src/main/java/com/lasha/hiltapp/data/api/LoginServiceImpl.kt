package com.lasha.hiltapp.data.api

import com.lasha.hiltapp.domain.api.LoginService

class LoginServiceImpl: LoginService {

    override fun getLogin(): String {
        return "LoginDoneText"
    }
}