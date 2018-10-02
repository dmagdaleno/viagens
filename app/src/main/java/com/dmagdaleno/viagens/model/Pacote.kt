package com.dmagdaleno.viagens.model

import java.math.BigDecimal

data class Pacote(
        val imagem: String = "indefinido",
        val local: String = "indefinido",
        val dias: Int = 0,
        val preco: BigDecimal = BigDecimal.ZERO
)