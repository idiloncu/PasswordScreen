package com.example.passwordscreen

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.Navigation
import com.example.passwordscreen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val password="admin"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        enableEdgeToEdge()
        setContentView(view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
      /*  binding.submitButton.setOnClickListener(){
            if (binding.editTextPassword.text.toString() == password ){
                Navigation.findNavController(it).navigate(R.id.action_mainPageFragment_to_mainFragment3)
            }
           else {
                Toast.makeText(this,"Wrong Password!",Toast.LENGTH_LONG)

            }

       */
        }
    }
