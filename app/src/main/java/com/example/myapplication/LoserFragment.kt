package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.FragmentLoserBinding

class LoserFragment : Fragment() {

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentLoserBinding>(
            inflater,
            R.layout.fragment_loser,
            container,
            false
        )

        val args = LoserFragmentArgs.fromBundle(requireArguments())

        binding.textView.text="you lost, "+args.person

        return binding.root
    }

}