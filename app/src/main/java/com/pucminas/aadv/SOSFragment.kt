package com.pucminas.aadv

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.pucminas.aadv.databinding.FragmentMensagensBinding
import com.pucminas.aadv.databinding.FragmentSOSBinding


class SOSFragment : Fragment() {

    lateinit var binding: FragmentSOSBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSOSBinding.inflate(inflater, container, false)

        binding.voltar.setOnClickListener {
            findNavController().popBackStack()
        }

        return binding.root
    }

}