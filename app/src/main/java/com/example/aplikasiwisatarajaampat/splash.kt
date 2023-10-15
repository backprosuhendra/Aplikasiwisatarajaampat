package com.example.aplikasiwisatarajaampat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)
        CoroutineScope(Dispatchers.Main).launch {
            delay(3000)
            val intent = Intent(this@splash, home::class.java)
            startActivity(intent)
            finish()
        }

    }
}