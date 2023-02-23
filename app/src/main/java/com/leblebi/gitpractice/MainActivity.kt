package com.leblebi.gitpractice

import android.content.ContentValues.TAG
import android.content.Intent
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

        binding.button.setOnClickListener{
            val bundle = Bundle()
            //bundle.putSerializable()
            bundle.putString("text",binding.Tv.text.toString())
            val intent = Intent(this, NextPage::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
            finish()
        }

        }





    ////////////////////////////////// TextWathcer obyekti ////////////////////////////
    var textWatcher=object :TextWatcher{
        override fun beforeTextChanged(
            s: CharSequence?,
            start: Int,
            count: Int,
            after: Int
        ) {

        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            binding.Tv.text = binding.ETm.text
        }

        override fun afterTextChanged(s: Editable?) {


        }



    }



    fun salam(){
        println("salam")
    }
    fun sala(){
        print("s")
    }
}