package com.lasha.hiltapp.domain.api

import javax.inject.Singleton

@Singleton
interface LoginService {

    fun getLogin(): String

}

