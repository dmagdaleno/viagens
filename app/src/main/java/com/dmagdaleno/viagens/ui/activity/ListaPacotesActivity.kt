package com.dmagdaleno.viagens

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.dmagdaleno.viagens.ui.adapter.ListaPacotesAdapter
import kotlinx.android.synthetic.main.activity_lista_pacotes.*

class ListaPacotesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_pacotes)

        lista_pacotes_list.adapter = ListaPacotesAdapter()
    }
}
