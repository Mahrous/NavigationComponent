package com.example.testkotlingradle.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

import com.example.testkotlingradle.R
import com.example.testkotlingradle.databinding.FragmentSearchBinding
import com.example.testkotlingradle.databinding.FragmentSettingBinding

class SearchFragment : Fragment(R.layout.fragment_search) {

    private lateinit var binding: FragmentSearchBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        binding = FragmentSearchBinding.inflate(inflater, container, false);
        val view = binding.root;


        return view
    }


}