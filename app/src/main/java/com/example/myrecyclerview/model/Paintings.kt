package com.example.myrecyclerview.model

//model class
class Paintings {
    var image: Int  //coz android studio maps the images as numbers
    var name: String
    var title: String

    constructor(image: Int, name: String, title: String) {
        this.image = image
        this.name = name
        this.title = title
    }
}
//class Paintings(var image : Int , var name : String , var title : String)
//