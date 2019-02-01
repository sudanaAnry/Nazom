package com.dana.anry.nazom

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView
import kotlinx.android.synthetic.main.activity_pantun_nasihat.*

class Pantun_nasihat : AppCompatActivity() {
    var str = "";


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantun_nasihat)

        str = intent.getStringExtra("key")
        pdf.fromAsset(str).load()


    }
}
