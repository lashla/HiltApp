package com.lasha.hiltapp.domain.repositories

import javax.inject.Singleton


@Singleton
interface FilesRepository {
    fun getFileString():String {
        return "FileString"
    }
}