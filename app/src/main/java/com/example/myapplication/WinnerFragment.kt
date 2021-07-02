package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.FragmentLoserBinding
import com.example.myapplication.databinding.FragmentWinnerBinding


class WinnerFragment : Fragment() {
    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentWinnerBinding>(
            inflater,
            R.layout.fragment_winner,
            container,
            false
        )

        val args = LoserFragmentArgs.fromBundle(requireArguments())
        binding.textView.text="you won, "+args.person

        return binding.root
    }
}