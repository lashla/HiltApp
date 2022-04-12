package com.lasha.hiltapp.domain.repositories

import javax.inject.Singleton


@Singleton
interface LoginRepository{
    fun getLoginText(): String = "LoginFirstText"
}


