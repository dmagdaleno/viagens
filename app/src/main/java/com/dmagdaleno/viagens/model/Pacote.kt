package com.dmagdaleno.viagens.model

import java.io.Serializable

data class Pacote(
        val imagem: String = "indefinido",
        val local: String = "indefinido",
        val dias: Int = 0,
        val preco: Double = 0.0
): Serializable