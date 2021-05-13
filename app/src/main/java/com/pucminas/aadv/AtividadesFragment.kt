package com.pucminas.aadv

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.pucminas.aadv.databinding.FragmentAtividadesBinding


class AtividadesFragment : Fragment() {

    lateinit var binding: FragmentAtividadesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAtividadesBinding.inflate(inflater, container, false)

        binding.todasAtvAadv.setOnClickListener {
            findNavController().navigate(R.id.action_atividadesFragment_to_todasAtvFragment)
        }

        binding.voltar.setOnClickListener {
            findNavController().popBackStack()
        }

        return binding.root
    }

}