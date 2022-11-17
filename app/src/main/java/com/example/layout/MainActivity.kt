package com.example.layout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import com.example.layout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var button_logout : Button
    private lateinit var button_darkmode : ImageButton
    private lateinit var switch : Switch

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        button_logout = binding.buttonLogout
        switch = binding.switchNight

        switch.setOnCheckedChangeListener { _, isChecked ->

            if (switch.isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            }
            else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }


        button_logout.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        })


    }
}