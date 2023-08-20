package com.peakdevcol.quickorder.ui.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.peakdevcol.quickorder.R
import com.peakdevcol.quickorder.databinding.ActivityWelcomeBinding
import com.peakdevcol.quickorder.ui.viewmodel.WelcomeViewModel

class WelcomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWelcomeBinding

    private val welcomeViewModel: WelcomeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        optionsWelcome()
    }

    private fun optionsWelcome() {
        binding.loginBtn.setOnClickListener {
            //TODO val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.registerBtn.setOnClickListener {
            //TODO val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}