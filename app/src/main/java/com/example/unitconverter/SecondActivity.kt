package com.example.unitconverter

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.unitconverter.databinding.SecondActivityBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: SecondActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SecondActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.backButton.setOnClickListener {
            Intent(this, MainActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.convertButton.setOnClickListener {
            conversion()
        }

    }
    private fun conversion(){
        val userInput = binding.edittext.text.toString().toInt()
        val outputValue = userInput * 100
        binding.textView.text = outputValue.toString()
    }
}