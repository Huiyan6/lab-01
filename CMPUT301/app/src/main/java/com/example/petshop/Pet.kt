package com.example.petshop

abstract class Pet(val name: String, var age: Int){
    abstract fun speak(): String
}

abstract class Mood(date: String){
    abstract fun getMood(): String
}

interface Pettable{
    fun pet()
}