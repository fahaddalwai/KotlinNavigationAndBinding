package com.example.myapplication

import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.myapplication.databinding.FragmentFirstBinding
import com.google.android.material.snackbar.Snackbar

class FirstFragment : Fragment() {

    private val myName: MyName = MyName("Aleks Haecky")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding = DataBindingUtil.inflate<FragmentFirstBinding>(
            inflater,
            R.layout.fragment_first,
            container,
            false
        )

        binding.inputbutton.setOnClickListener { view: View ->       //View is used to access all the views in the screen.ie the current fragment.
            myName.name = binding.inputname.text.toString()
            if (myName.name.startsWith("f")) {
                view.findNavController()
                    .navigate(FirstFragmentDirections.actionFirstFragmentToWinnerFragment(myName.name))
            } else {
                view.findNavController()
                    .navigate(FirstFragmentDirections.actionFirstFragmentToLoserFragment(myName.name))
            }
        }
        

        setHasOptionsMenu(true)


        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.options_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.itemId) {
            R.id.options -> {
                Snackbar.make(
                    requireActivity().findViewById(R.id.main),
                    "option menu has not been implemented yet",
                    Snackbar.LENGTH_LONG
                ).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }


}