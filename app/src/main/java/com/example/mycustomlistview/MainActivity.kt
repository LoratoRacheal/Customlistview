package com.example.mycustomlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView=findViewById<ListView>(R.id.ListView)
        var list= mutableListOf<Model>()
        list.add(Model("Feather", "Picture taken in 2020", R.drawable.nice))
        list.add(Model("Glass", "Bora bora", R.drawable.glass))
        list.add(Model("Spiral", "Drawn by an AI", R.drawable.rraaa))
        list.add(Model("Moonlight", "Pianted in Korea", R.drawable.shuu))
        list.add(Model("Imagination", "Made in my mind", R.drawable.prr))


        listView.adapter=MyAdapter(this,R.layout.row,list)

       listView.setOnItemClickListener { adapterView, view, i, l ->
           Toast.makeText(this , "Pretty huh", Toast.LENGTH_SHORT).show()
       }
        

    }
}