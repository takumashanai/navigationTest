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
        Log.d("onCreateView","test2")
        _binding = FragmentSubBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        Log.d("onStart","test2")
    }

    override fun onResume() {
        super.onResume()
        Log.d("onResume","test2")
    }

    override fun onPause() {
        super.onPause()
        Log.d("onPause","test2")
    }

    override fun onStop() {
        super.onStop()
        Log.d("onStop","test2")
    }

    override fun onDestroyView(){
        super.onDestroyView()
        Log.d("onDestroyView","test2")
        _binding = null
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("onDetach","test2")
    }
}