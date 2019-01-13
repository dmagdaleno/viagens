package com.dmagdaleno.viagens.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.dmagdaleno.viagens.R
import com.dmagdaleno.viagens.functions.extensions.formatado
import com.dmagdaleno.viagens.functions.extensions.getDrawableResource
import com.dmagdaleno.viagens.functions.getDiasText
import com.dmagdaleno.viagens.model.Pacote
import kotlinx.android.synthetic.main.activity_resumo_compra.*
import java.math.BigDecimal

class ResumoCompraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resumo_compra)

        val pacote = Pacote("sao_paulo_sp", "São Paulo", 10, BigDecimal(243.99))

        resumo_compra_foto_local.setImageDrawable(getDrawableResource(pacote.imagem))
        resumo_compra_local.text = pacote.local
        resumo_compra_periodo.text = getDiasText(pacote.dias)
        resumo_compra_preco.text = pacote.preco.formatado()
    }
}
