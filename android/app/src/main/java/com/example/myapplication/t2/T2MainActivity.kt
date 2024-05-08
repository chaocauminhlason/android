package com.example.myapplication.t2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class t2MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_t2_main)
        var txt1=findViewById<EditText>(R.id.tuan2_txt1)
        var txt2=findViewById<EditText>(R.id.tuan2_txt2)
        var btn1=findViewById<Button>(R.id.tuan2_bt)

        btn1!!.setOnClickListener{
            var i= Intent(this@t2MainActivity,t2MainActivityResult::class.java)
            i.putExtra("so1",txt1.text!!.toString())
            i.putExtra("so2",txt2.text!!.toString())
            startActivity(i)
        }
    }
}