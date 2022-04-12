package com.lasha.hiltapp.data.api

import com.lasha.hiltapp.domain.api.FilesService

class FilesServiceImpl: FilesService {
    override fun getFile(): String {
        return "fileDoneText"
    }
}