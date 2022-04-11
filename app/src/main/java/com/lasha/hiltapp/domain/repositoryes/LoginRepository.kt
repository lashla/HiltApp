package com.lasha.hiltapp.domain.repositoryes

import javax.inject.Singleton


@Singleton
interface LoginRepository{
    fun getLoginText(): String = "LoginFirstText"
}


