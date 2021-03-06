package com.lasha.hiltapp.ui.login

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.lasha.hiltapp.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async

@AndroidEntryPoint
class LoginFragment: Fragment(R.layout.fragment_login) {

    private lateinit var viewModel: LoginViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[LoginViewModel::class.java]
        initView()
        setupButtonListeners()
    }

    private fun setupButtonListeners(){
        goToFilesBtn.setOnClickListener{
            Navigation.findNavController(requireView()).navigate(R.id.action_loginFragment_to_filesFragment)
        }
        showUsersBtn.setOnClickListener{
            viewModel.getUserData()
        }
    }
    private fun initView(){
        viewModel.userData.observe(viewLifecycleOwner){
            tvLoginUser.text = it
        }
    }

}