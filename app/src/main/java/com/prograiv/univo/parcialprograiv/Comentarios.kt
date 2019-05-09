package com.prograiv.univo.parcialprograiv

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_comentarios.*
import kotlinx.android.synthetic.main.activity_main.*

class Comentarios : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comentarios)

        enviar.setOnClickListener {
            if (editText.text.toString().trim().isNotEmpty() && editText2.text.toString().trim().isNotEmpty()) {
                val intento3 = Intent(this, Bienvenido::class.java)
                startActivity(intento3)
                Toast.makeText(this, getString(R.string.comentario_enviado), Toast.LENGTH_LONG).show()

            } else {
                Toast.makeText(this, getString(R.string.llenar), Toast.LENGTH_LONG).show()
            }

        }

    }

}
