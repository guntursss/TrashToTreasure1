package com.KotlinKrew.trashtotreasure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.KotlinKrew.trashtotreasure.databinding.ActivityHomeBinding


class HomeActivity : AppCompatActivity() {
    private lateinit var nama:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        nama = findViewById(R.id.tv_name)
        nama.text = textInput.text
    }
}