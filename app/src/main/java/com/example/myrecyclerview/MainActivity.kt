package com.example.myrecyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecyclerview.model.Paintings

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    var data = mutableListOf<Paintings>() 

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.rec) 
        recyclerView.layoutManager = LinearLayoutManager(this)


        data.add(Paintings(R.drawable.a , "Mithila Painting" , "Traditional Art"))
        data.add(Paintings(R.drawable.b , "Girl Painting", "Traditional Art"))
        data.add(Paintings(R.drawable.c , "Women Art" , "Traditional Art"))

        data.add(Paintings(R.drawable.d , "Chhath Puja" , "Traditional Art"))

        data.add(Paintings(R.drawable.e , "Radhe Krishna" , "Traditional Art"))

        data.add(Paintings(R.drawable.f , "Flower with women" , "Traditional Art"))
        data.add(Paintings(R.drawable.g , "Lord Krishna Mural Art" , "Traditional Art"))
        data.add(Paintings(R.drawable.h , "Midnight lotus bloom" , "Traditional Art"))





        recyclerView.adapter = PaintingsAdapter(data)
    }
}
