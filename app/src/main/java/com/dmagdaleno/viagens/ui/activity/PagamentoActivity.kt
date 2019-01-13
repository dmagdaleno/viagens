package com.dmagdaleno.viagens.ui.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.dmagdaleno.viagens.R
import com.dmagdaleno.viagens.functions.extensions.formatado
import com.dmagdaleno.viagens.model.Pacote
import kotlinx.android.synthetic.main.activity_pagamento.*
import java.math.BigDecimal

class PagamentoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagamento)

        val pacote = Pacote("sao_paulo_sp", "São Paulo", 10, BigDecimal(243.99))

        pagamento_valor.text = pacote.preco.formatado()

        pagamento_botao_finalizar.setOnClickListener {
            val i = Intent(this, ResumoCompraActivity::class.java)
            startActivity(i)
        }

    }
}
