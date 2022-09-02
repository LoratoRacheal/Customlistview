package com.example.mycustomlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(var mctx:Context, var resources:Int, var items:List<Model>):ArrayAdapter<Model>(mctx,resources,items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
       val layoutInflater:LayoutInflater=LayoutInflater.from(mctx)
       val view:View=layoutInflater.inflate(resources,null)

       val imageview:ImageView=view.findViewById(R.id.image)
       val titletexview:TextView=view.findViewById(R.id.textView1)
       val descriptiontextview:TextView=view.findViewById(R.id.textView2)

       var mItems:Model=items[position]
       imageview.setImageDrawable(mctx.resources.getDrawable(mItems.image))
       titletexview.text=mItems.title
       descriptiontextview.text=mItems.description


       return view










    }

}