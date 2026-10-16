package com.jeiu.mynavigationapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.jeiu.mynavigationapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    private val binding: FragmentHomeBinding
        get() = _binding!!

    override fun onCreateView(  // When the view is created for the first time
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(
            inflater,
            container,
            false
        )


        return binding.root
    }

    override fun onViewCreated(   // Executed after the view has been created
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)

        // Implement button events later
        binding.btnMoveMenu.setOnClickListener {
            findNavController().navigate(
                R.id.action_homeFragment_to_menuFragment
            )
        }
    }






    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}