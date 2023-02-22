package com.leblebi.gitpractice

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.core.widget.addTextChangedListener
import androidx.core.widget.doOnTextChanged
import com.leblebi.gitpractice.databinding.ActivityMainBinding
import java.util.zip.Inflater

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("LocalChange2")

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        //////////////////////// Text Watchers feature //////////////////////////

        binding.ETm.addTextChangedListener(textWatcher)


        }
    var textWatcher=object :TextWatcher{
        override fun beforeTextChanged(
            s: CharSequence?,
            start: Int,
            count: Int,
            after: Int
        ) {
            print("salam")
        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            Log.d(TAG, "onTextChanged: SalamOlsunDunyaya")
            println("Nilll oturumlu illerim")
            binding.Tv.text = binding.ETm.text
        }

        override fun afterTextChanged(s: Editable?) {

            println("After Nilll oturumlu illerim")
        }
    }



    fun salam(){
        println("salam")
    }
    fun sala(){
        print("s")
    }
}