package com.dmagdaleno.viagens.functions.extensions

import java.text.DecimalFormat
import java.util.*

fun Double.formatado(): String {
    return DecimalFormat.getCurrencyInstance(Locale("pt", "BR"))
            .format(this)
            .replace("R$", "R$ ")
            .replace("-R$ ", "R$ -")
}

fun Double.positivo(): Boolean {
    return this >= .0
}