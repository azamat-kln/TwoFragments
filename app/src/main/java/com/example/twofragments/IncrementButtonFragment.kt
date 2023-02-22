package com.example.twofragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.lifecycle.ViewModelProvider

class IncrementButtonFragment : Fragment(R.layout.fragment_button_increment) {

    private lateinit var sharedViewModel: SharedViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sharedViewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        view.findViewById<Button>(R.id.incrementButton).setOnClickListener {
            sharedViewModel.increment()
        }
    }

}