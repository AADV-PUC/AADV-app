package com.pucminas.aadv

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.pucminas.aadv.databinding.FragmentMensagensBinding


class MensagensFragment : Fragment() {

    lateinit var binding: FragmentMensagensBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMensagensBinding.inflate(inflater, container,false)

        binding.naoLidas.setOnClickListener {
            findNavController().navigate(R.id.action_mensagensFragment_to_msgNaoLidasFragment)
        }

        binding.todasMsg.setOnClickListener {
            findNavController().navigate(R.id.action_mensagensFragment_to_todasMensagensFragment)
        }

        binding.voltar.setOnClickListener {
            findNavController().popBackStack()
        }

        return binding.root
    }

}