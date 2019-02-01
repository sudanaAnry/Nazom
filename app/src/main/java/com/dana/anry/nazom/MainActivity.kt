package com.dana.anry.nazom

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
        val nazom =findViewById<View>(R.id.nazom) as Button
        nazom.setOnClickListener {
            val intent=Intent(applicationContext,Nazom_Menu::class.java)
            startActivity(intent)
        }

        lirik.setOnClickListener { view->
            startActivity(Intent(applicationContext,Lirik_Lagu::class.java))
        }
    }
}
