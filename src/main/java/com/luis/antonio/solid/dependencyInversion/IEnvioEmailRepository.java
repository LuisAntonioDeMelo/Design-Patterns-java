package com.luis.antonio.solid.dependencyInversion;

public interface IEnvioEmailRepository {
    void enviarEmailConfirmacao(Pedido order);
}
