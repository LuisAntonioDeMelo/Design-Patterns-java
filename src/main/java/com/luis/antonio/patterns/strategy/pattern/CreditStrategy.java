package com.luis.antonio.patterns.strategy.pattern;

import com.luis.antonio.patterns.strategy.Conta;
import com.luis.antonio.patterns.strategy.PagamentoStrategy;
import com.luis.antonio.patterns.strategy.TipoPagamento;

import java.math.BigDecimal;

public class CreditStrategy implements PagamentoStrategy {
    @Override
    public void processarPagamento(BigDecimal valor) {

    }

    @Override
    public boolean satisfiedBy(Conta conta) {
        return conta.creditoAtivo() && conta.saldo().compareTo(BigDecimal.ZERO)== 0;
    }

}
