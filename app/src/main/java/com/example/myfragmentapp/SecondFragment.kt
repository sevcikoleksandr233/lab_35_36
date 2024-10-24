package com.example.myfragmentapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myfragmentapp.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.title.text = getString(R.string.second_fragment_title)
        binding.btnToThird.text = getString(R.string.go_to_third)
        binding.btnBackToFirst.text = getString(R.string.back_to_first)

        binding.btnToThird.setOnClickListener {
            findNavController().navigate(R.id.toThirdFragment)
        }

        binding.btnBackToFirst.setOnClickListener {
            findNavController().navigate(R.id.backToFirstFragment)
        }
    }
}
