package com.lasha.hiltapp.data

import androidx.activity.ComponentActivity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Singleton
interface FilesService {
    fun getFile(fileText: String): String{
        return fileText
    }

}

@Module
@InstallIn(SingletonComponent::class)
class FilesServiceImpl: FilesService {
    @Provides
    override fun getFile(fileText: String): String {
        return super.getFile(fileText)
    }
}