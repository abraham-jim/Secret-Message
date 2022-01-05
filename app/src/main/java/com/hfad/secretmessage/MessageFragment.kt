package com.hfad.secretmessage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController


class MessageFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_message, container, false)
        val nextButton = view.findViewById<Button>(R.id.next)
        // get a reference to the message edit text
        val messageView = view.findViewById<EditText>(R.id.message)

        nextButton.setOnClickListener {
            // get the message string
            val message = messageView.text.toString()
            val action = MessageFragmentDirections
                .actionMessageFragmentToEncryptFragment(message)

          view.findNavController().navigate(action)
        }

        return view
    }
}
