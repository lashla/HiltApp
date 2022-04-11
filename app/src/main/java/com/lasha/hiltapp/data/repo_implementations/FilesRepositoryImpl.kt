package com.lasha.hiltapp.data.repo_implementations

import com.lasha.hiltapp.data.api_Implementations.FilesServiceImpl
import com.lasha.hiltapp.domain.repositoryes.FilesRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FilesRepositoryImpl @Inject constructor(private val filesService: FilesServiceImpl):
    FilesRepository {
    override fun getFileString(): String {
        return filesService.getFile("OtherFileStringDone")
    }
}