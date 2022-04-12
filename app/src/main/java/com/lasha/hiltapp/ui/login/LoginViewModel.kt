package com.lasha.hiltapp.ui.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lasha.hiltapp.domain.repositories.LoginRepository
import com.lasha.hiltapp.domain.repositories.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel@Inject constructor(private val userRepository: UserRepository,
                                        private val loginRepository: LoginRepository): ViewModel() {
    var userData = MutableLiveData<String>()
    init {
        userData = MutableLiveData<String>()
        getLoginData()
    }

    fun getUserData(){
        userData.value = userRepository.getUserText()
    }

    private fun getLoginData(){
        userData.value = loginRepository.getLoginText()
    }
}