package com.lasha.hiltapp.ui.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lasha.hiltapp.domain.repositoryes.LoginRepository
import com.lasha.hiltapp.domain.repositoryes.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel@Inject constructor(private val userRepository: UserRepository,
                                        private val loginRepository: LoginRepository): ViewModel() {

    init {
        getLoginData()
    }
    var userData = MutableLiveData<String>()
    fun getUserData(){
        userData.value = userRepository.getUserText()
    }
    fun getLoginData(){
        userData.value = loginRepository.getLoginText()
    }
}