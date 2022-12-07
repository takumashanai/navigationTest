package com.example.experimentalapplication

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.experimentalapplication.databinding.FragmentSubBinding

class SubFragment : Fragment() {
    private var _binding: FragmentSubBinding? = null
    private val binding get() = _binding!!

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("onAttach","test2")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("onCreate","test2")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d("onCreateView","test")
        _binding = FragmentSubBinding.inflate(inflater, container, false)
        return binding.root
    }
}