package com.example.musicapp

import android.util.Log

class Song(songName: String, songartist: String, songyear: Int, songduration: String) {

    var name: String = ""
    var artist: String = ""
    var year: Int = 0
    var duration: String = ""
    var isFavourite: Boolean = false

    // Secondary constructor to include favorite status
    constructor(
        songName: String,
        songartist: String,
        songyear: Int,
        songduration: String,
        songfavourite: Boolean
    ) : this(songName, songartist, songyear, songduration) {
        this.isFavourite = songfavourite
    }

    init {
        name = songName
        artist = songartist
        year = songyear
        duration = songduration
    }

    fun play() {
        Log.v("Song", "$name: Playing now")
    }

    fun pause() {
        Log.v("Song", "$name: Paused")
    }

    fun stop() {
        Log.v("Song", "$name: Stopped")
    }

    fun favourite(): Boolean {
        Log.v("Song", "$name favourite status: $isFavourite")
        return isFavourite
    }
}
