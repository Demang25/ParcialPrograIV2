package com.prograiv.univo.parcialprograiv

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button5.setOnClickListener {
            val intento1 = Intent(this, Bienvenido::class.java)
            startActivity(intento1)
        }
    }
}
