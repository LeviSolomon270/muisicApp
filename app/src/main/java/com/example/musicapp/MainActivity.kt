package com.example.musicapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val songDisplayTxt = findViewById<TextView>(R.id.songDisplay)
        var songDisplay = ""

        // Calling the Song class for song objects
        val song1 = Song("Ordinary", "Alex Warren", 2024, "2.5")
        val song2 = Song("Swim", "BTS", 2021, "3.5")
        // Fixed: Added missing year and duration parameters
        val song3 = Song("So Easy", "Olivia Dean", 2023, "3.0")

        // Creating array to hold songs
        val songs = arrayOf(song1, song2, song3)

        // Loop through the songs and build the display string
        for (song in songs) {
            songDisplay += "${song.name} by ${song.artist}\n"
        }

        // Set the final string to the TextView
        songDisplayTxt.text = songDisplay

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
