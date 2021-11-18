package com.example.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.swoosh.EXTRA_LEAGUE
import com.example.swoosh.EXTRA_SKILL
import com.example.swoosh.R

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        val skill = intent.getStringExtra(EXTRA_SKILL).toString()

        val searchLeagues: TextView = findViewById(R.id.searchLeaguesText)
        searchLeagues.text = "Looking for a $league $skill league near you..."

    }
}