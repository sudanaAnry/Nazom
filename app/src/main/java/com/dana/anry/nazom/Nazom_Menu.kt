package com.dana.anry.nazom

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_nazom_menu.*

class Nazom_Menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nazom_menu)
        val  i = Intent(applicationContext, Pantun_nasihat::class.java)

        pantun.setOnClickListener { view->
            i.putExtra("key","nasihat.pdf")
            startActivity(i)
        }

        nunmati.setOnClickListener { view->
            i.putExtra("key","nun_mati_tanwin.pdf")
            startActivity(i)
        }

        mimmati.setOnClickListener { view->
            i.putExtra("key","mim_mati.pdf")
            startActivity(i)
        }

        aliflam.setOnClickListener { view->
            i.putExtra("key","aliflam.pdf")
            startActivity(i)
        }

        idghom.setOnClickListener { view->
            i.putExtra("key","hukum_idghom.pdf")
            startActivity(i)
        }

        bagianmad.setOnClickListener { view->
            i.putExtra("key","bagian_mad.pdf")
            startActivity(i)
        }

        madham.setOnClickListener { view->
            i.putExtra("key","mad_hamzah.pdf")
            startActivity(i)
        }

        madlazim.setOnClickListener { view->
            i.putExtra("key","mad_lazim.pdf")
            startActivity(i)
        }

        pentup.setOnClickListener { view->
            i.putExtra("key","penutup.pdf")
            startActivity(i)
        }

        //nun_mati_tanwin
    }
}