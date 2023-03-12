package com.example.testkotlingradle.ui.welcom

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil.setContentView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.testkotlingradle.R
import com.example.testkotlingradle.databinding.FragmentWelcomBinding
import com.example.testkotlingradle.ui.home.HomeFragmentDirections

class WelcomFragment : Fragment(R.layout.fragment_welcom) {
    private val args: WelcomFragmentArgs by navArgs()
    private lateinit var binding: FragmentWelcomBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        binding = FragmentWelcomBinding.inflate(inflater, container, false);
        val view = binding.root;

        binding.password.setText(args.password)
        binding.userName.setText(args.username)
        binding.ok.setOnClickListener {
            //Back To Home Fragment
            val action = WelcomFragmentDirections.actionWelcomFragmentToHomeFragment2()
            findNavController().navigate(action)
        }
        return view
    }


}