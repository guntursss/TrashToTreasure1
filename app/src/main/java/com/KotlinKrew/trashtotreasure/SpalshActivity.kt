package com.KotlinKrew.trashtotreasure

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SplashActivity : AppCompatActivity() {
    private lateinit var splashImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)

        splashImage = findViewById(R.id.iv_logo_splash_screen)

        animateZoomOut()
    }

    private fun animateZoomOut() {
        splashImage.animate()
            .scaleX(0.4f)
            .scaleY(0.4f)
            .setDuration(1000)
            .withEndAction {
                animateZoomIn()
            }
            .start()
    }

    private fun animateZoomIn() {
        splashImage.animate()
            .scaleX(30f)
            .scaleY(30f)
            .setDuration(1000)
            .withEndAction {
                // mulai main activity
                startNewActivity()
            }
            .start()
    }

    private fun startNewActivity() {
        startActivity(Intent(this, NameActivity::class.java))
        finish()
    }
}