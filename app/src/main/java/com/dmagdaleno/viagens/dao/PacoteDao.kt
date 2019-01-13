package com.dmagdaleno.viagens.dao

import com.dmagdaleno.viagens.model.Pacote
import java.math.BigDecimal

class PacoteDao {

    fun lista(): List<Pacote> = listOf(
        Pacote("sao_paulo_sp", "São Paulo", 2, 243.99),
        Pacote("belo_horizonte_mg", "Belo Horizonte", 3, 421.50),
        Pacote("recife_pe", "Recife", 4, 754.20),
        Pacote("rio_de_janeiro_rj", "Rio de Janeiro", 6, 532.55),
        Pacote("salvador_ba", "Salvador", 5, 899.99),
        Pacote("foz_do_iguacu_pr", "Foz do Iguaçu", 1, 289.90)
    )
}