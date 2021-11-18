package com.example.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.swoosh.EXTRA_PLAYER
import com.example.swoosh.Model.Player
import com.example.swoosh.R

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        val searchLeagues: TextView = findViewById(R.id.searchLeaguesText)
        if (player != null) {
            searchLeagues.text = "Looking for a ${player.league} ${player.skill} league near you..."
        } else {
            Toast.makeText(this, "Something went wrong...", Toast.LENGTH_LONG).show()
        }

    }
}