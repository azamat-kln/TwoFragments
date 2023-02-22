package com.example.twofragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class NumberTextViewFragment : Fragment(R.layout.fragment_textview_number) {

    private lateinit var sharedViewModel: SharedViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sharedViewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        sharedViewModel.number.observe(viewLifecycleOwner) {
            view.findViewById<TextView>(R.id.numberTextView).text = it.toString()
        }
    }

}