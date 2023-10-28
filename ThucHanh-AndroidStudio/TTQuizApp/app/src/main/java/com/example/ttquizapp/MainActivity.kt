package com.example.ttquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ttquizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var test: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        test = ActivityMainBinding.inflate(layoutInflater)
        setContentView(test.root)

        test.btnStart.setOnClickListener {
            val userName = test.etName.text.toString().trim()

            if (userName.isEmpty()) {
                Toast.makeText(this, "Please enter your name!", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, QuizActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
