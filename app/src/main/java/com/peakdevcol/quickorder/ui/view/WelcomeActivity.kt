package com.peakdevcol.quickorder.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.peakdevcol.quickorder.R
import com.peakdevcol.quickorder.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}