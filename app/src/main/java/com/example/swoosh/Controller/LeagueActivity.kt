package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.ToggleButton
import com.example.swoosh.EXTRA_LEAGUE
import com.example.swoosh.R

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""
    lateinit var mensBtn:ToggleButton
    lateinit var womensBtn:ToggleButton
    lateinit var coedBtn:ToggleButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
        mensBtn = findViewById(R.id.mensLeagueBtn)
        womensBtn = findViewById(R.id.womensLeagueBtn)
        coedBtn = findViewById(R.id.coedLeagueBtn)
    }

    fun onMensClicked(view: View) {
        womensBtn.isChecked = false
        coedBtn.isChecked = false

        selectedLeague = "mens"
    }

    fun onWomensClicked(view:View) {
        mensBtn.isChecked = false
        coedBtn.isChecked = false

        selectedLeague = "womens"
    }

    fun onCoedClicked(view:View) {
        mensBtn.isChecked = false
        womensBtn.isChecked = false

        selectedLeague = "co-ed"
    }

    fun leagueNextClicked(view: View) {
        if(selectedLeague != ""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
        }
    }
}