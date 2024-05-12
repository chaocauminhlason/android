package com.example.myapplication

import android.content.Context
import android.widget.TextView
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley

class VolleyFn1 {
    var  strJSON=""
    //ham doc du lieu tu api
    fun getAllData(context: Context, textview: TextView)
    {
        // tao request
        val queue= Volley.newRequestQueue(context)
        // truyen url
        val url ="https:hungntgttg.github.io/array_json_new.json"
        //3. goi request
        //mang cua cac doi tuowng-> goi mang truoc, doi tuong sau
        //jsonArray
        val request=JsonArrayRequest(url, { response ->
            for (i in  0  until response.length()){
                try{
                    val person =response.getJSONObject(i)
                    val id= person.getString("id");
                    val name =person.getString("name")
                    val email =person.getString("email")
                    //dua vao chuoi
                    strJSON += "Id: $id\n";
                    strJSON += "name: $id\n";
                    strJSON += "email: $id\n";
                }
                catch ( e:Exception){
                    e.printStackTrace();
                }
            }
            textview.text=strJSON
        },{error -> textview.text=error.message})
        //b4 thuc thi request
        queue.add(request)
    }
}