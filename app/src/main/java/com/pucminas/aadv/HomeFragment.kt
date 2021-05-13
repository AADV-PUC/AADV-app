package com.pucminas.aadv

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.pucminas.aadv.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.toolbar.user.setOnClickListener {
            Toast.makeText(context, "Clicando no user", Toast.LENGTH_LONG).show()
        }

        binding.noticias.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_noticiasFragment)
        }

        binding.atividades.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_atividadesFragment)
        }

        binding.mensagens.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_mensagensFragment)
        }

        binding.SOS.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_SOSFragment)
        }

        return binding.root
    }
}