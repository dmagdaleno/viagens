package com.dmagdaleno.viagens.ui.adapter

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.dmagdaleno.viagens.R
import com.dmagdaleno.viagens.extensions.formatado
import com.dmagdaleno.viagens.model.Pacote
import kotlinx.android.synthetic.main.item_pacote.view.*

class ListaPacotesAdapter(
        val context: Context,
        val pacotes: List<Pacote>) : BaseAdapter() {

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
        item_pacote_imagem.setImageDrawable(getDrawable(pacote))
    }

    private fun View.configuraPreco(pacote: Pacote) {
        item_pacote_preco.text = pacote.preco.formatado()
    }

    private fun View.configuraDias(pacote: Pacote) {
        item_pacote_dias.text = getDiasLabel(pacote.dias)
    }

    private fun View.configuraLocal(pacote: Pacote) {
        item_pacote_local.text = pacote.local
    }

    private fun getDiasLabel(dias: Int): String {
        return if(dias == 1) {
            "$dias dia"
        } else {
            "$dias dias"
        }
    }

    private fun View.getDrawable(pacote: Pacote): Drawable? {
        with(context.resources){
            val id = getIdentifier(pacote.imagem, "drawable", context.packageName)
            return getDrawable(id)
        }
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
