package com.example.testkotlingradle.ui.terms

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

import com.example.testkotlingradle.R
import com.example.testkotlingradle.databinding.FragmentSettingBinding
import com.example.testkotlingradle.databinding.FragmentTermsBinding
import com.example.testkotlingradle.databinding.FragmentWelcomBinding

class Terms : Fragment(R.layout.fragment_terms) {

    private lateinit var binding: FragmentTermsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        binding = FragmentTermsBinding.inflate(inflater, container, false);
        val view = binding.root;


        return view
    }


}