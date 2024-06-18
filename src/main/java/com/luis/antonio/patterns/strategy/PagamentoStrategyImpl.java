package com.luis.antonio.patterns.strategy;

import com.luis.antonio.patterns.strategy.pattern.BankAccountStrategy;
import com.luis.antonio.patterns.strategy.pattern.BitcoinStrategy;
import com.luis.antonio.patterns.strategy.pattern.CreditStrategy;

import java.util.Map;

public class PagamentoStrategyImpl {

    private final Map<TipoPagamento, PagamentoStrategy> mapStrategy = Map.of(
            TipoPagamento.AVISTA, new BankAccountStrategy(),
            TipoPagamento.CREDITO, new CreditStrategy(),
            TipoPagamento.CRYPTO, new BitcoinStrategy()
    );

    public void selecionaPagamento(Conta conta) {
        PagamentoStrategy pagamentoStrategy = mapStrategy.get(conta.tipoPagamento());

        if(pagamentoStrategy.satisfiedBy(conta)) {
            pagamentoStrategy.processarPagamento(conta.saldo());
        };
        throw new IllegalArgumentException("");
    }
}
