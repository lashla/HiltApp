package com.lasha.hiltapp.data.repositories

import com.lasha.hiltapp.domain.api.FilesService
import com.lasha.hiltapp.domain.repositories.FilesRepository
import javax.inject.Inject

class FilesRepositoryImpl @Inject constructor(private val filesService: FilesService) : FilesRepository {
    override fun getFileString(): String {
        return filesService.getFile()
    }
}