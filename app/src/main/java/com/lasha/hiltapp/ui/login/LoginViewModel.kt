package com.lasha.hiltapp.ui.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lasha.hiltapp.data.LoginService
import com.lasha.hiltapp.data.UserService
import com.lasha.hiltapp.domain.repositoryes.LoginInterface
import com.lasha.hiltapp.domain.repositoryes.UserInterface
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel@Inject constructor(private val userInterface: UserInterface,
                                        private val loginInterface: LoginInterface): ViewModel() {

    var userData = MutableLiveData<String>()
    fun getUserData(){
        userData.value = userInterface.getUserText()
    }
    fun getLoginData(){
        userData.value = loginInterface.getLoginText()
    }
}