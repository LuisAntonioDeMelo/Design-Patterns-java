package com.luis.antonio.solid.dependencyInversion;

import com.luis.antonio.solid.dependencyInversion.IEnvioEmailRepository;
import com.luis.antonio.solid.dependencyInversion.Pedido;
import com.luis.antonio.solid.dependencyInversion.SmtpGmail;

/**
 * DIP SOLUÇÃO
 */
public class EnviarEmailConfirmacao implements IEnvioEmailRepository {

    public void enviarEmailConfirmacao(Pedido pedido) {
        SmtpGmail smtp = new SmtpGmail("usuarioSmtp", "senhaSmtp");
        String nome = pedido.getNomeCliente();
        String email = pedido.getEmailCliente();

        String html = "Caro cliente ".concat(nome).concat(",pedido ")
                .concat(pedido.getId().toString()).concat(" confirmado");

        smtp.enviar(html, email);
    }

}