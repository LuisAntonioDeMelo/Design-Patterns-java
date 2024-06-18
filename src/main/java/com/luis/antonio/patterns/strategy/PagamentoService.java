package com.luis.antonio.patterns.strategy;

public class PagamentoService {

    private final PagamentoStrategyImpl pagamentoStrategy;

    public PagamentoService(PagamentoStrategyImpl pagamentoStrategy) {
        this.pagamentoStrategy = pagamentoStrategy;
    }

    public void processaPagamento(Conta conta) {
        pagamentoStrategy.selecionaPagamento(conta);
    }
}
