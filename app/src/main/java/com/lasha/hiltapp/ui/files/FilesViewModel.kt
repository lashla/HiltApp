package com.lasha.hiltapp.ui.files

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lasha.hiltapp.domain.repositoryes.FilesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FilesViewModel @Inject constructor(private val filesRepository: FilesRepository): ViewModel() {

    val filesData = MutableLiveData<String>()
    fun getFileData(){
        filesData.value = filesRepository.getFileString()
    }
}