package com.sgshreya.christmasgreetings

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_card.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createChristmasCard(view: View) {

        val name=name_input.editableText.toString()
        val message=message_input.editableText.toString()
        val intent=Intent(this,Card::class.java)
        intent.putExtra("name",name)
        intent.putExtra("message",message)
        Toast.makeText(this,"Making New Year Card",Toast.LENGTH_LONG ).show()
        startActivity(intent)
    }
}