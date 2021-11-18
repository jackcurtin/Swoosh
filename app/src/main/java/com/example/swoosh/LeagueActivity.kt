package com.example.swoosh

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ToggleButton

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

        selectedLeague = "coed"
    }

    fun leagueNextClicked(view: View) {
        val skillActivity = Intent(this, SkillActivity::class.java)
        startActivity(skillActivity)
    }
}