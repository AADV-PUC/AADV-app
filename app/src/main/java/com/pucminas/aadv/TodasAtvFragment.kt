package com.pucminas.aadv

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.pucminas.aadv.databinding.FragmentTodasAtvBinding

class TodasAtvFragment : Fragment() {

    lateinit var binding: FragmentTodasAtvBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTodasAtvBinding.inflate(inflater, container, false)

        binding.voltar.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.pagInicial.setOnClickListener {
            findNavController().navigate(R.id.action_todasAtvFragment_to_homeFragment)
        }

        return binding.root
    }

}