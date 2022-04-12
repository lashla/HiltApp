package com.lasha.hiltapp.data.repositories

import com.lasha.hiltapp.data.api.FilesServiceImpl
import com.lasha.hiltapp.domain.repositories.FilesRepository
import javax.inject.Inject

class FilesRepositoryImpl @Inject constructor(private val filesService: FilesServiceImpl):
    FilesRepository {
    override fun getFileString(): String {
        return filesService.getFile("OtherFileStringDone")
    }
}