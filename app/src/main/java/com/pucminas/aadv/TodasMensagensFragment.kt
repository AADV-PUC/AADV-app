package com.pucminas.aadv

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.pucminas.aadv.databinding.FragmentTodasMensagensBinding

class TodasMensagensFragment : Fragment() {

    lateinit var binding: FragmentTodasMensagensBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTodasMensagensBinding.inflate(inflater, container, false)

        binding.voltar.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.pagInicial.setOnClickListener {
            findNavController().navigate(R.id.action_todasMensagensFragment_to_homeFragment)
        }

        return binding.root
    }

}