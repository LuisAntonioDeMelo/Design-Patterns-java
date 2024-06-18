package com.luis.antonio.patterns.strategy;

import java.math.BigDecimal;

public record Conta(
        Long id,
        String name,
        BigDecimal saldo,
        Boolean creditoAtivo,
        TipoPagamento tipoPagamento
) {
}
