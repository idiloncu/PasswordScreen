package com.example.passwordscreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.passwordscreen.databinding.FragmentMainPageBinding

class MainPageFragment : Fragment() {

    private lateinit var binding: FragmentMainPageBinding
    private val password="admin"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMainPageBinding.inflate(inflater,container, false)

        binding.submitButton.setOnClickListener(){
            if (binding.editTextPassword.text.toString() == password ){
                Navigation.findNavController(it).navigate(R.id.action_mainPageFragment_to_mainFragment3)
            }
            else {
              // Toast.makeText(this@MainPageFragment,"Wrong Password!",Toast.LENGTH_LONG)
            }
    }
        return binding.root
    }
}