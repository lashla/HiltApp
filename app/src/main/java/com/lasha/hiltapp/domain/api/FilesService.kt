package com.lasha.hiltapp.domain.api

import javax.inject.Singleton

@Singleton
interface FilesService {

    fun getFile(fileText: String): String
}

