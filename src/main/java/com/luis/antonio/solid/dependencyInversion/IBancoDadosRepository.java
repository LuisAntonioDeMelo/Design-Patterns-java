package com.luis.antonio.solid.dependencyInversion;

public interface IBancoDadosRepository {
    boolean salvar(Pedido pedido);
}
