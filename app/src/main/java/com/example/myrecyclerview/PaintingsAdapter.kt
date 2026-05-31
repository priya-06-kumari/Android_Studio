package com.example.myrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecyclerview.model.Paintings

class PaintingsAdapter( var data: MutableList<Paintings>) : RecyclerView.Adapter<ItemView>() {                         
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ItemView {  
        var v = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false) 
         return ItemView(v)                                         
    }

    override fun onBindViewHolder(item : ItemView, index : Int) {  
        var Paintings = data.get(index)
        item.image.setImageResource(Paintings.image)
        item.name.setText(Paintings.name)                             
        item.title.setText(Paintings.title)

    }
    override fun getItemCount(): Int {                                 
        return data.size
    }
}





