package com.lasha.hiltapp.domain.repositoryes

import com.lasha.hiltapp.data.FilesService
import com.lasha.hiltapp.data.FilesServiceImpl
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
interface FilesInterface {
    fun getFileString():String {
        return "FileString"
    }
}

@Singleton
class FilesRepository @Inject constructor(private val filesService: FilesServiceImpl): FilesInterface {
    override fun getFileString(): String {
        return filesService.getFile("OtherFileStringDone")
    }
}