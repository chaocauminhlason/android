package com.example.myapplication.t2

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class t22MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_t22_main)
        var lv1=findViewById<ListView>(R.id.tuan2_lv1)
        var arr= arrayOf("item1","item2","item3","item4")
        val adapter1= ArrayAdapter(this,android.R.layout.simple_list_item_1,arr)
        lv1!!.adapter =adapter1
    }
}