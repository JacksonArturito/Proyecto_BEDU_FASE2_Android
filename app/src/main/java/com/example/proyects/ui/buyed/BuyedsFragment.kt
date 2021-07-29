package com.example.proyects.ui.buyed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.proyects.databinding.FragmentBuyedBinding


class BuyedsFragment : Fragment() {

    private lateinit var buyedsViewModel: BuyedsViewModel
    private var _binding: FragmentBuyedBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        buyedsViewModel =
            ViewModelProvider(this).get(BuyedsViewModel::class.java)

        _binding = FragmentBuyedBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}