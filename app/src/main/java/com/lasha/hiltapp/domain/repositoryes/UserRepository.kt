package com.lasha.hiltapp.domain.repositoryes

import javax.inject.Singleton


@Singleton
interface UserRepository {
    fun getUserText(): String = "FirstUserText"
}

