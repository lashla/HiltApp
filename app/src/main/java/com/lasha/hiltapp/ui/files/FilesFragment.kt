package com.lasha.hiltapp.ui.files

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.lasha.hiltapp.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_files.*

@AndroidEntryPoint
class FilesFragment: Fragment(R.layout.fragment_files) {

    private lateinit var viewModel: FilesViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[FilesViewModel::class.java]
        setupButtonListener()
        initView()
    }

    private fun setupButtonListener(){
        showFileDataBtn.setOnClickListener {
            viewModel.getFileData()
        }
    }

    private fun initView(){
        viewModel.filesData.observe(viewLifecycleOwner){
            tvFiles.text = it
        }
    }
}