package com.dmagdaleno.viagens.ui.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.dmagdaleno.viagens.R
import com.dmagdaleno.viagens.constantes.App
import com.dmagdaleno.viagens.functions.extensions.formatado
import com.dmagdaleno.viagens.model.Pacote
import kotlinx.android.synthetic.main.activity_pagamento.*
import java.math.BigDecimal

class PagamentoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagamento)

        title = App.TITULO

        if(intent.hasExtra(App.PACOTE)){

            val pacote = intent.extras.getParcelable(App.PACOTE) as Pacote

            pagamento_valor.text = pacote.preco.formatado()

            pagamento_botao_finalizar.setOnClickListener {
                val i = Intent(this, ResumoCompraActivity::class.java)
                i.putExtra(App.PACOTE, pacote)
                startActivity(i)
            }
        }
    }
}
