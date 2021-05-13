package com.pucminas.aadv

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.pucminas.aadv.databinding.FragmentMsgNaoLidasBinding

class MsgNaoLidasFragment : Fragment() {

    lateinit var binding: FragmentMsgNaoLidasBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMsgNaoLidasBinding.inflate(inflater, container, false)

        binding.voltar.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.pagInicial.setOnClickListener {
            findNavController().navigate(R.id.action_msgNaoLidasFragment_to_homeFragment)
        }

        return binding.root
    }

}