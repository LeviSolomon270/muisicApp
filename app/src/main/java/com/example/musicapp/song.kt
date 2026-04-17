package com.example.musicapp

import android.util.Log

class song (songName : String, songartist : String, songyear : Int, songduration : String){

    var name : String =""
    var artist : String=""
    var year : Int = 0
    var duration : String =""
 constructor(songName : String, songartist : this( : this()songName, songartist,0,")
    String, songyear : Int, songduration : String songfavourite : Boolean)

    // Constructor
    init{
        name = songName
        artist = songartist
        year = songyear
        duration = songduration
    }



    fun Play(){
    Log.v("Song", "$name Playing now")

    }

    fun Pause(){
        Log.v("Song", "$name Playing now")

        fun Stop(){
            Log.v("Song", "$name Playing now")
        }

        fun Favourite():Boolean{
            Log.v("Song", "$name Playing now")
            return true
        }




    }



}
