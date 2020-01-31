package com.afs.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tombol = findViewById(R.id.tombol)as Button

        tombol.setOnClickListener {
            Toast.makeText(this, "Hello World!", Toast.LENGTH_SHORT).show()
        }
    }


}
