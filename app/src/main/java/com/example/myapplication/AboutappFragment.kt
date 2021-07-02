package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment

import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityMainBinding.inflate
import com.example.myapplication.databinding.FragmentAboutappBinding

class AboutappFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding= DataBindingUtil.inflate<FragmentAboutappBinding>(inflater,R.layout.fragment_aboutapp, container, false)



        return binding.root
    }


}