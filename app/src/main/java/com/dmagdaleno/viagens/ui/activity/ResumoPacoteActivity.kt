package com.dmagdaleno.viagens.ui.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.dmagdaleno.viagens.R
import com.dmagdaleno.viagens.functions.extensions.formatado
import com.dmagdaleno.viagens.functions.extensions.getDrawableResource
import com.dmagdaleno.viagens.functions.getDataIdaVoltaFormatada
import com.dmagdaleno.viagens.functions.extraiPeriodo
import com.dmagdaleno.viagens.model.Pacote
import kotlinx.android.synthetic.main.activity_resumo_pacote.*
import java.math.BigDecimal

class ResumoPacoteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resumo_pacote)

        if(intent.hasExtra("pacote")){

            val pacote = intent.getSerializableExtra("pacote") as Pacote
            resumo_pacote_imagem.setImageDrawable(getDrawableResource(pacote.imagem))
            resumo_pacote_local.text = pacote.local
            resumo_pacote_dias.text = extraiPeriodo(pacote.dias)
            resumo_pacote_preco.text = pacote.preco.formatado()

            val data = getDataIdaVoltaFormatada(pacote)

            resumo_pacote_data.text = data

            resumo_pacote_botao_realiza_pagamento.setOnClickListener {
                val i = Intent(this, PagamentoActivity::class.java)
                i.putExtra("pacote", pacote)
                startActivity(i)
            }
        }
    }
}
