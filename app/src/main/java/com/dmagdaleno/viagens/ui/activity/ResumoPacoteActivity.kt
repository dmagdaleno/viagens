package com.dmagdaleno.viagens.ui.activity

import android.content.res.Resources
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.dmagdaleno.viagens.R
import com.dmagdaleno.viagens.extensions.getDrawableResource
import com.dmagdaleno.viagens.model.Pacote
import kotlinx.android.synthetic.main.activity_resumo_pacote.*
import java.math.BigDecimal
import java.util.*

class ResumoPacoteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resumo_pacote)

        val pacote = Pacote("sao_paulo_sp", "São Paulo", 2, BigDecimal(243.99))

        resumo_pacote_imagem.setImageDrawable(getDrawableResource(pacote.imagem))
        resumo_pacote_local.text = pacote.local
        resumo_pacote_dias.text = pacote.dias.toString()
        resumo_pacote_preco.text = pacote.preco.toString()
    }
}
