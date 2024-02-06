package com.KotlinKrew.trashtotreasure

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
var textInput: EditText = TODO()

class MainActivity : AppCompatActivity() {
    private lateinit var TombolPindah: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TombolPindah = findViewById(R.id.btn_login)
        textInput = findViewById(R.id.et_input_text)
            TombolPindah.setOnClickListener {
                if (TextUtils.isEmpty(textInput.text)) {
                    Toast.makeText(this, "Nama tidak boleh kosong", Toast.LENGTH_LONG).show()
                } else {
                    val pindah = Intent(this, HomeActivity::class.java)
                    startActivity(pindah)
                }
            }
    }
}