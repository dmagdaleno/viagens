package com.dmagdaleno.viagens.functions

fun getDiasText(dias: Int): String {
    return if(dias == 1) {
        "$dias dia"
    } else {
        "$dias dias"
    }
}