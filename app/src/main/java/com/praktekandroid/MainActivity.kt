package com.praktekandroid

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val TextView1 = findViewById<TextView>(R.id.TextView1);

        TextView1.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "hai",Toast.LENGTH_SHORT).show()

        })
    }
}