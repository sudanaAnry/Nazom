package com.dana.anry.nazom

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lirik__lagu.*
import kotlinx.android.synthetic.main.activity_nazom_menu.*

class Lirik_Lagu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lirik__lagu)
        val  i = Intent(applicationContext, Pantun_nasihat::class.java)

        utusan.setOnClickListener { view->
            i.putExtra("key","utusan.pdf")
            startActivity(i)
        }

        pancor.setOnClickListener { view->
            i.putExtra("key","engkauwahaiancor.pdf")
            startActivity(i)
        }

        pemuda.setOnClickListener { view->
            i.putExtra("key","pemudasasak.pdf")
            startActivity(i)
        }

        bercahayalah.setOnClickListener { view->
            i.putExtra("key","bercahayalah.pdf")
            startActivity(i)
        }

        pecintailmu.setOnClickListener { view->
            i.putExtra("key","pemudapencintailmu.pdf")
            startActivity(i)
        }

        pacu.setOnClickListener { view->
            i.putExtra("key","pacugamaq.pdf")
            startActivity(i)
        }

        waqiah.setOnClickListener { view->
            i.putExtra("key","suratwaqiah.pdf")
            startActivity(i)
        }

        pancordamai.setOnClickListener { view->
            i.putExtra("key","pancordamai.pdf")
            startActivity(i)
        }

        mars.setOnClickListener { view->
            i.putExtra("key","marsnw.pdf")
            startActivity(i)
        }
        keistimewaan.setOnClickListener { view->
            i.putExtra("key","keistimewaannw.pdf")
            startActivity(i)
        }
        ikhlas.setOnClickListener { view->
            i.putExtra("key","dasarikhlas.pdf")
            startActivity(i)
        }

        //nun_mati_tanwin
    }
}