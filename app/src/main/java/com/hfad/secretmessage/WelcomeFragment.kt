package com.hfad.secretmessage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController


class WelcomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // reference to the fragment's root view to call findViewById()
        val view = inflater.inflate(R.layout.fragment_welcome, container, false)
        //gets a reference to the fragment's Start button
        val startButton = view.findViewById<Button>(R.id.start)

        startButton.setOnClickListener {
            // gets the navigation controller
            view.findNavController()
                .navigate(R.id.action_welcomeFragment_to_messageFragment)
        }
            //return the fragment's root view
        return view
    }


}