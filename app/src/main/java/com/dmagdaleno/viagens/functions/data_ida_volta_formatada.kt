package com.dmagdaleno.viagens.functions

import com.dmagdaleno.viagens.model.Pacote
import java.text.SimpleDateFormat
import java.util.*

fun getDataIdaVoltaFormatada(pacote: Pacote): String {
    val ida = Calendar.getInstance()
    val volta = Calendar.getInstance()
    volta.add(Calendar.DATE, pacote.dias)
    val formatter = SimpleDateFormat("dd/MM")
    return "${formatter.format(ida.time)} - ${formatter.format(volta.time)} de ${volta.get(Calendar.YEAR)}"
}