package com.praktekandroid

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val TextView1 = findViewById<TextView>(R.id.TextView1)
        val button1 = findViewById<Button>(R.id.button1)

        TextView1.setOnClickListener {
            Toast.makeText(this, "hai", Toast.LENGTH_LONG).show()
        }

        button1.setOnClickListener{
            val intent = Intent (this@MainActivity, HitungActivity ::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener{
            val intent = Intent (this@MainActivity, GameActivity ::class.java)
            startActivity(intent)
        }

    }
}

