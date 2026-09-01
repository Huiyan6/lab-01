package com.example.petshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.os.MessageCompat
import com.example.petshop.ui.theme.PetShopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { // Sets up the android app on app start
        super.onCreate(savedInstanceState) // calls some function from the superclass of MainActivity?
        enableEdgeToEdge() // allow top of the screen to show the time and data, and battery UI
        val cat = Cat("Coco", 6)
        val dog = Dog("Mochi", 6)
        val scorpion = Scorpion("Stinger", 32)
        
        val pets = mutableListOf<Pet>(cat, dog, scorpion)
        val pettablePets = mutableListOf<Pettable>(cat, dog)
        setContent { // indicates start of jetpack compose syntax within kotlin.
            PetShopTheme {

            }
        }
    }
}


