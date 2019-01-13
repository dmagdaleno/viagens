package com.dmagdaleno.viagens.ui.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.dmagdaleno.viagens.R
import com.dmagdaleno.viagens.dao.PacoteDao
import com.dmagdaleno.viagens.ui.adapter.ListaPacotesAdapter
import kotlinx.android.synthetic.main.activity_lista_pacotes.*

class ListaPacotesActivity : AppCompatActivity() {

    companion object {
        private const val TITULO_APP = "Pacotes"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_pacotes)

        title = TITULO_APP

        configuraListaPacotes()

        val i = Intent(this, PagamentoActivity::class.java)
        startActivity(i)
    }

    private fun configuraListaPacotes() {
        val pacotes = PacoteDao().lista()
        lista_pacotes_list.adapter = ListaPacotesAdapter(this, pacotes)
    }
}
