package com.example.myapplication

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.content.ContextCompat
import com.chibde.visualizer.LineBarVisualizer

class MainActivity : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lineBarVisualizer =findViewById<LineBarVisualizer>(R.id.visualizer)
        mediaPlayer = MediaPlayer.create(this,R.raw.ultranumb)
        lineBarVisualizer.setColor(ContextCompat.getColor(this,R.color.purple_500))
        lineBarVisualizer.setDensity(70F)
        lineBarVisualizer.setPlayer(mediaPlayer.audioSessionId)

        //lineBarVisualizer.setPlayer(mediaPlayer.audioSessionId)
        mediaPlayer.start()

    }
}