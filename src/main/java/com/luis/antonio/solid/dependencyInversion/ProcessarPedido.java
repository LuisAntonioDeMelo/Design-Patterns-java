package com.luis.antonio.solid.dependencyInversion;

public class ProcessarPedido {

    private IBancoDadosRepository dbRepo;

    private IEnvioEmailRepository mailRepo;

    public ProcessarPedido(IBancoDadosRepository dbRepo, IEnvioEmailRepository mailRepo) {
        this.dbRepo = dbRepo;
        this.mailRepo = mailRepo;
    }

    public void processar(Pedido pedido) {
        // Regra de negócio processar pedido
        System.out.println("Regra de negócio ao processar pedido...");
        pedido.setNomeCliente("");
        pedido.setEmailCliente("");
        pedido.setId(47);

        dbRepo.salvar(pedido);

        mailRepo.enviarEmailConfirmacao(pedido);
    }
}
