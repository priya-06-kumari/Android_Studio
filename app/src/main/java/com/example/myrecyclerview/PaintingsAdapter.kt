package com.example.myrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecyclerview.model.Paintings

class PaintingsAdapter( var data: MutableList<Paintings>) : RecyclerView.Adapter<ItemView>() {                          //here wev will pass data to constructor
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ItemView {  //returns ItemView
        var v = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false) //inflate means  import item_layout
         return ItemView(v)                                          //v is passed in ItemView Constructor
    }

    override fun onBindViewHolder(item : ItemView, index : Int) {  //item is an object of ItemView
        var Paintings = data.get(index)
        item.image.setImageResource(Paintings.image)
        item.name.setText(Paintings.name)                              //name bind kra h name se and so on
        item.title.setText(Paintings.title)

    }
    override fun getItemCount(): Int {                                 // it tells how many views to be created in recycler view
        return data.size
    }
}





//these function are call by AS here , we have only define the functions