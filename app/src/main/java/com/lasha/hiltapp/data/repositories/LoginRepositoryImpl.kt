package com.lasha.hiltapp.data.repositories

import com.lasha.hiltapp.domain.api.LoginService
import com.lasha.hiltapp.domain.repositories.LoginRepository

class LoginRepositoryImpl(private val loginService: LoginService) : LoginRepository {
    override fun getLoginText(): String {
        return loginService.getLogin()
    }
}