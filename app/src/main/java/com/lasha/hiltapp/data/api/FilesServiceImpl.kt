package com.lasha.hiltapp.data.api

import com.lasha.hiltapp.domain.api.FilesService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

class FilesServiceImpl: FilesService {

    override fun getFile(fileText: String): String {
        return fileText
    }
}