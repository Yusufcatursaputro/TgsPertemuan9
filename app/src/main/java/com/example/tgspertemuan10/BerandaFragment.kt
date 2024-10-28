package com.example.tgspertemuan10

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.tgspertemuan10.databinding.FragmentBerandaBinding

class BerandaFragment : Fragment() {
    private var _binding: FragmentBerandaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBerandaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Ambil teks dari TextView
        val username = binding.txtNameInsideContainer.text.toString()

        // Kirim teks ke ProfileFragment melalui navigasi dengan Bundle
        val bundle = Bundle()
        bundle.putString("username", username)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
