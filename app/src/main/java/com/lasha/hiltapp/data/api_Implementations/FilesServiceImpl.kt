package com.lasha.hiltapp.data.api_Implementations

import com.lasha.hiltapp.domain.api.FilesService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class FilesServiceImpl: FilesService {
    @Provides
    override fun getFile(fileText: String): String {
        return super.getFile(fileText)
    }
}