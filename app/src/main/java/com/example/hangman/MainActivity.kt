package com.example.hangman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var word: TextView;
    lateinit var wordString : String;

    lateinit var hiddenWord : TextView;
    lateinit var hiddenWordString : String;


    val dictionary = mapOf("?pp?le" to "apple", "c?r" to "car", "s?kk?r" to "sukkur")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        word = findViewById(R.id.hidden)
        wordString = word.toString();

        wordString = dictionary["?pp?le"].toString()
        word.setText(wordString)
    }


    fun guess(v: View){

    }

}