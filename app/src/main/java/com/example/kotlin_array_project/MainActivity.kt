package com.example.kotlin_array_project

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Adjust for system bars
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Get reference to TextView
        val outputTextView = findViewById<TextView>(R.id.outputTextView)

        // Arrays
        val firstNames = arrayOf(
            "James", "Joseph", "Art", "Len", "Don", "Sima", "Mitsue",
            "Leo", "Sage", "Krish", "Minna", "Abe", "Kyle", "Graciela",
            "Cammi", "Matt", "Mel", "Glady", "Yukee"
        )

        val lastNames = arrayOf(
            "Bhatt", "Darakjy", "Veere", "Paprocki", "Foller", "Morasca", "Toll",
            "Dilli", "Wiezer", "Marrier", "Amigo", "Maclead", "Caldarera", "Roota",
            "Albares", "Poquette", "Garufi", "Rim", "Whobrey"
        )

        val fullNames = Array(firstNames.size) { index ->
            "${firstNames[index]} ${lastNames[index]}"
        }

        // Prepare the text output
        val outputText = StringBuilder()
        outputText.append("--- First Names ---\n")
        firstNames.forEach { outputText.append(it).append("\n") }

        outputText.append("\n--- Last Names ---\n")
        lastNames.forEach { outputText.append(it).append("\n") }

        outputText.append("\n--- Full Names ---\n")
        fullNames.forEach { outputText.append(it).append("\n") }

        // Set text to TextView
        outputTextView.text = outputText.toString()
    }
}