package com.example.proyects.ui.catalogo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.proyects.databinding.FragmentCatalogoBinding


class CatalogoFragment : Fragment() {

    private lateinit var catalogoViewModel: CatalogoViewModel
    private var _binding: FragmentCatalogoBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        catalogoViewModel =
            ViewModelProvider(this).get(CatalogoViewModel::class.java)

        _binding = FragmentCatalogoBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}