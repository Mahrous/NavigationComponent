package com.example.testkotlingradle.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.testkotlingradle.R
import com.example.testkotlingradle.databinding.FragmentHomeBinding
import com.example.testkotlingradle.ui.home.HomeFragmentDirections


class HomeFragment : Fragment(R.layout.fragment_home) {
    private var _binding: FragmentHomeBinding? = null;
    private val binding get() = _binding!!;

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        _binding = FragmentHomeBinding.inflate(inflater, container, false);
        val view = binding.root;
        binding.login.setOnClickListener(View.OnClickListener {
            val action = HomeFragmentDirections.actionHomeFragment2ToLoginFragment2()
            findNavController().navigate(action)

        })
        return view;
    }




}