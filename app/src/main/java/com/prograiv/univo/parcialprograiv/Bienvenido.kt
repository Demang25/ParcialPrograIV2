package com.prograiv.univo.parcialprograiv

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_bienvenido.*

class Bienvenido : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenido)
    }
    var Esfrag = true
    fun cambiarFragmente (view:View){
        val fragmento1 = BlankFragment1()
        val manager = supportFragmentManager
        val transaccion = manager.beginTransaction()
        if (Esfrag){
            transaccion.replace(R.id.sitiorespaldo,fragmento1)
            transaccion.addToBackStack(null)
            transaccion.commit()
        }
        else{
            Toast.makeText(this, "NO TIENES PERMITIDO PRRO", Toast.LENGTH_LONG).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId){
            R.id.item1->{
                //Toast.makeText(this, "Item1", Toast.LENGTH_LONG).show()
                val url = "http://www.github.com"
                val i = Intent(Intent.ACTION_VIEW)
                i.data = Uri.parse(url)
                startActivity(i)
            }
            R.id.item2->{
                val intento2 = Intent(this, Comentarios::class.java)
                startActivity(intento2)
            }
            R.id.item3->{
                Toast.makeText(this, getString(R.string.estadisticast), Toast.LENGTH_LONG).show()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
