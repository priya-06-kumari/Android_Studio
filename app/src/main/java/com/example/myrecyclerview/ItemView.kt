package com.example.myrecyclerview

import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import androidx.cardview.widget.CardView

class ItemView  : RecyclerView.ViewHolder {  //ViewHolder is a class , item vieholderclass name

   var image : ImageView//object hai Imageview ka
    lateinit var card : CardView
    var name : TextView
    var title : TextView


    constructor(item:View)  :super(item){ //item is a object of View item represents itrm_layout
         image = item.findViewById(R.id.img)
        name= item.findViewById(R.id.name)
        title= item.findViewById(R.id.title)
    }
}