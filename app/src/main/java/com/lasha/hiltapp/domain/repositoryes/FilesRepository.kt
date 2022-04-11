package com.lasha.hiltapp.domain.repositoryes

import javax.inject.Singleton


@Singleton
interface FilesRepository {
    fun getFileString():String {
        return "FileString"
    }
}