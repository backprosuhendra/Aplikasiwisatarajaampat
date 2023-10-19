package com.example.aplikasiwisatarajaampat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class activity_splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        CoroutineScope(Dispatchers.Main).launch {
            delay(3000)
            val intent = Intent(this@activity_splash, Detail_kamar::class.java)
            startActivity(intent)
            finish()
        }

    }
}