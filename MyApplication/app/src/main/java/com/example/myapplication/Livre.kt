package com.example.myapplication

class Livre {

    private val image :Int

    constructor(image:Int){

        this.image=image
    }

    fun getImage(): Int {
        return this.image
    }
}