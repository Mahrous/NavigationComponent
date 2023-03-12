package com.example.testkotlingradle.ui.setting

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

import com.example.testkotlingradle.R
import com.example.testkotlingradle.databinding.FragmentSettingBinding
import com.example.testkotlingradle.databinding.FragmentWelcomBinding

class SettingFragment : Fragment(R.layout.fragment_setting) {

    private lateinit var binding: FragmentSettingBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        binding = FragmentSettingBinding.inflate(inflater, container, false);
        val view = binding.root;


        return view
    }


}