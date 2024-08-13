package com.example.rhabbit.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.rhabbit.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // layout
    private lateinit var btRs : Button  // reset Button

    // habit 1
    private lateinit var pbHab1 : ProgressBar
    private lateinit var lbPHab1: TextView  // lbProgressHabit1
    private lateinit var lbGHab1: TextView  // lbGoalHabit1
    private lateinit var btAHab1: Button    // btAddHabit1

    // habit 2
    private lateinit var pbHab2 : ProgressBar
    private lateinit var lbPHab2: TextView  // lbProgressHabit1
    private lateinit var lbGHab2: TextView  // lbGoalHabit1
    private lateinit var btAHab2: Button    // btAddHabit1

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        /*
        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
         */




        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}