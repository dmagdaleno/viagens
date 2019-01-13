package com.dmagdaleno.viagens.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.dmagdaleno.viagens.R
import com.dmagdaleno.viagens.functions.extensions.formatado
import com.dmagdaleno.viagens.functions.extensions.getDrawableResource
import com.dmagdaleno.viagens.functions.extraiPeriodo
import com.dmagdaleno.viagens.model.Pacote
import kotlinx.android.synthetic.main.activity_resumo_compra.*
import java.math.BigDecimal

class ResumoCompraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resumo_compra)

        if(intent.hasExtra("pacote")){

            val pacote = intent.extras.getParcelable("pacote") as Pacote

            resumo_compra_foto_local.setImageDrawable(getDrawableResource(pacote.imagem))
            resumo_compra_local.text = pacote.local
            resumo_compra_periodo.text = extraiPeriodo(pacote.dias)
            resumo_compra_preco.text = pacote.preco.formatado()
        }
    }
}
