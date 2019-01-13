package com.dmagdaleno.viagens.ui.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.dmagdaleno.viagens.R
import com.dmagdaleno.viagens.constantes.App
import com.dmagdaleno.viagens.functions.extensions.formatado
import com.dmagdaleno.viagens.functions.extensions.getDrawableResource
import com.dmagdaleno.viagens.functions.extraiPeriodo
import com.dmagdaleno.viagens.model.Pacote
import kotlinx.android.synthetic.main.activity_resumo_compra.*

class ResumoCompraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resumo_compra)

        title = App.TITULO

        if(intent.hasExtra(App.PACOTE)){

            val pacote = intent.extras.getParcelable(App.PACOTE) as Pacote

            resumo_compra_foto_local.setImageDrawable(getDrawableResource(pacote.imagem))
            resumo_compra_local.text = pacote.local
            resumo_compra_periodo.text = extraiPeriodo(pacote.dias)
            resumo_compra_preco.text = pacote.preco.formatado()
        }
    }

    override fun onBackPressed() {
        val i = Intent(this, ListaPacotesActivity::class.java)
        i.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(i)
    }
}
