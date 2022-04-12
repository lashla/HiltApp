package com.lasha.hiltapp.domain.api

import javax.inject.Singleton

@Singleton
interface UserService {

    fun getUser(): String
}

