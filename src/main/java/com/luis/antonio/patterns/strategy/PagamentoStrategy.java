package com.luis.antonio.patterns.strategy;

import java.math.BigDecimal;

public interface PagamentoStrategy {

    public void processarPagamento(BigDecimal valor);
    boolean satisfiedBy(Conta conta);
}
