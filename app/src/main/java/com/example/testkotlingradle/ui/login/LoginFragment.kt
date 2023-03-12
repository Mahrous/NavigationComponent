package com.example.testkotlingradle.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.testkotlingradle.R
import com.example.testkotlingradle.databinding.FragmentHomeBinding
import com.example.testkotlingradle.databinding.FragmentLoginBinding

class LoginFragment : Fragment(R.layout.fragment_login) {
    private var _binding: FragmentLoginBinding? = null;
    private val binding get() = _binding!!;

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false);
        val view = binding.root;


        binding.login.setOnClickListener {
            val action = LoginFragmentDirections.actionLoginFragment2ToWelcomFragment(binding.userName.text.toString() , binding.Password.text.toString()  )
            findNavController().navigate(action)
        }


        return view
    }

}