package com.lasha.hiltapp.data.repo_implementations

import com.lasha.hiltapp.data.api_Implementations.LoginServiceImpl
import com.lasha.hiltapp.domain.repositoryes.LoginRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LoginRepositoryImpl @Inject constructor(private val loginServiceImpl: LoginServiceImpl): LoginRepository {
    override fun getLoginText(): String {
        return loginServiceImpl.getLogin()
    }
}