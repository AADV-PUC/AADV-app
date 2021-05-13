package com.pucminas.aadv

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.pucminas.aadv.databinding.FragmentNoticiasBinding

class NoticiasFragment : Fragment() {

    lateinit var binding: FragmentNoticiasBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNoticiasBinding.inflate(inflater, container, false)

        binding.voltar.setOnClickListener {
            findNavController().popBackStack()
        }

        return binding.root
    }

}