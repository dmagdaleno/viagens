package com.dmagdaleno.viagens.ui.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.dmagdaleno.viagens.R
import com.dmagdaleno.viagens.constantes.App
import com.dmagdaleno.viagens.dao.PacoteDao
import com.dmagdaleno.viagens.ui.adapter.ListaPacotesAdapter
import kotlinx.android.synthetic.main.activity_lista_pacotes.*

class ListaPacotesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_pacotes)

        title = App.TITULO

        configuraListaPacotes()
    }

    private fun configuraListaPacotes() {
        val pacotes = PacoteDao().lista()
        lista_pacotes_list.adapter = ListaPacotesAdapter(this, pacotes)
        lista_pacotes_list.setOnItemClickListener { _, _, i, l ->
            val pacote = pacotes[i]
            val intent = Intent(this, ResumoPacoteActivity::class.java)
            intent.putExtra(App.PACOTE, pacote)
            startActivity(intent)
        }
    }
}
