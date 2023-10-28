package com.example.ttquizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ttquizapp.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var resultBinding: ActivityResultBinding

    private var userName: String? = null
    private var correctAnswers: Int = 0
    private var totalQuestion: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        resultBinding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(resultBinding.root)

        resultBinding.tvUserName.text = userName

        resultBinding.tvScore.text = "Your score is $correctAnswers out of $totalQuestion"
    }
}
