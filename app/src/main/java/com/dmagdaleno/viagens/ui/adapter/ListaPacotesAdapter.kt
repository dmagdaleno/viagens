package com.dmagdaleno.viagens.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.dmagdaleno.viagens.R
import com.dmagdaleno.viagens.functions.extensions.formatado
import com.dmagdaleno.viagens.functions.extensions.getDrawableResource
import com.dmagdaleno.viagens.functions.extraiPeriodo
import com.dmagdaleno.viagens.model.Pacote
import kotlinx.android.synthetic.main.item_pacote.view.*

class ListaPacotesAdapter(
        val context: Context,
        private val pacotes: List<Pacote>) : BaseAdapter() {

    override fun getView(position: Int, view: View?, group: ViewGroup?): View {
        val inflate = LayoutInflater.from(context)
                .inflate(R.layout.item_pacote, group, false)

        val pacote = pacotes[position]

        with(inflate) {
            configuraLocal(pacote)
            configuraDias(pacote)
            configuraPreco(pacote)
            configuraImagem(pacote)
        }

        return inflate
    }

    private fun View.configuraImagem(pacote: Pacote) {
        item_pacote_imagem.setImageDrawable(context.getDrawableResource(pacote.imagem))
    }

    private fun View.configuraPreco(pacote: Pacote) {
        item_pacote_preco.text = pacote.preco.formatado()
    }

    private fun View.configuraDias(pacote: Pacote) {
        item_pacote_dias.text = extraiPeriodo(pacote.dias)
    }

    private fun View.configuraLocal(pacote: Pacote) {
        item_pacote_local.text = pacote.local
    }

    override fun getItem(position: Int): Pacote {
        return pacotes[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return pacotes.size
    }

}
