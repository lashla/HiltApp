package com.lasha.hiltapp.domain.repositories

import javax.inject.Inject
import javax.inject.Singleton


@Singleton
interface UserRepository {
    fun getUserText(): String = "UserFirstText"
}

