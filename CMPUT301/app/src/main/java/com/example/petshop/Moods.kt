package com.example.petshop

class Happy(date: String): Mood(date) {
    override fun getMood(): String {
        return "Happy"
    }
}

class Sad(date: String): Mood(date){
    override fun getMood(): String {
        return "Sad"
    }
}