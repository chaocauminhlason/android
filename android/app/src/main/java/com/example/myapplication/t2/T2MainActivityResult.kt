package com.example.myapplication.t2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class t2MainActivityResult : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_t2_main_result)
        var tvKQ= findViewById<TextView>(R.id.tuan2_tvKq)
        val i1=intent
        val chuoi1=i1.extras!!.getString("so1")
        val so1=chuoi1!!.toFloat()
        val chuoi2 = i1.extras!!.getString("so2")
        val so2=chuoi2!!.toFloat()
        val tong= so1+so2
        tvKQ!!.text=tong.toString()
        }
    }
