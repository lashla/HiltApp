package com.lasha.hiltapp.data.repositories

import com.lasha.hiltapp.data.api.LoginServiceImpl
import com.lasha.hiltapp.domain.api.LoginService
import com.lasha.hiltapp.domain.repositories.LoginRepository
import javax.inject.Inject

class LoginRepositoryImpl @Inject constructor(private val loginService: LoginService) : LoginRepository {
    override fun getLoginText(): String {
        return loginService.getLogin()
    }
}