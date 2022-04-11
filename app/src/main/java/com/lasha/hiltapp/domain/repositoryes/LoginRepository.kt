package com.lasha.hiltapp.domain.repositoryes

import com.lasha.hiltapp.data.LoginService
import com.lasha.hiltapp.data.LoginServiceImpl
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
interface LoginInterface{
    fun getLoginText(): String = "LoginFirstText"
}

@Singleton
class LoginRepository @Inject constructor(private val loginServiceImpl: LoginServiceImpl): LoginInterface {
    override fun getLoginText(): String {
        return loginServiceImpl.getLogin()
    }
}
