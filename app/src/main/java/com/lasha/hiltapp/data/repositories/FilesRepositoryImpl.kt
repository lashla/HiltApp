package com.lasha.hiltapp.data.repositories

import com.lasha.hiltapp.domain.api.FilesService
import com.lasha.hiltapp.domain.repositories.FilesRepository

class FilesRepositoryImpl(private val filesService: FilesService) : FilesRepository {
    override fun getFileString(): String {
        return filesService.getFile()
    }
}