package com.lasha.hiltapp.ui.files

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lasha.hiltapp.data.FilesService
import com.lasha.hiltapp.data.LoginService
import com.lasha.hiltapp.data.UserService
import com.lasha.hiltapp.domain.repositoryes.FilesInterface
import com.lasha.hiltapp.domain.repositoryes.LoginInterface
import com.lasha.hiltapp.domain.repositoryes.UserInterface
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FilesViewModel @Inject constructor(private val filesInterface: FilesInterface): ViewModel() {

    val filesData = MutableLiveData<String>()
    fun getFileData(){
        filesData.value = filesInterface.getFileString()
    }
}