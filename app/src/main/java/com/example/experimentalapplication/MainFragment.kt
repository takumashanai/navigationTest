package com.example.experimentalapplication

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.example.experimentalapplication.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("onAttach","test")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("onCreate","test")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d("onCreateView","test")
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        Log.d("onStart","test")
    }

    override fun onResume() {
        super.onResume()
        Log.d("onResume","test")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("onViewCreated","test")
        val button = binding.button
        button.setOnClickListener {
            val navHostFragment =
                activity?.supportFragmentManager?.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
            val navController = navHostFragment.navController
            val action = MainFragmentDirections.actionMainFragmentToSubFragment()
            navController.navigate(action)
        }
    }

    override fun onPause() {
        super.onPause()
        Log.d("onPause","test")
    }

    override fun onStop() {
        super.onStop()
        Log.d("onStop","test")
    }

    override fun onDestroyView(){
        super.onDestroyView()
        Log.d("onDestroyView","test")
        _binding = null
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("onDetach","test")
    }
}