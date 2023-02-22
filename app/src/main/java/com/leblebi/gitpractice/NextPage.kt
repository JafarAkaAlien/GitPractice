package com.leblebi.gitpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.leblebi.gitpractice.databinding.ActivityMainBinding
import com.leblebi.gitpractice.databinding.ActivityNextPageBinding

class NextPage : AppCompatActivity() {
    private lateinit var binding  : ActivityNextPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_page)


        binding = ActivityNextPageBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.buttonKecid.setOnClickListener{
            val intent =  Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        val bundle = intent.extras
        val text = bundle?.getString("text")
        binding.yazici.setOnClickListener{

            binding.yaziyeri.text = text
        }
    }
}