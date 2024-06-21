package com.luis.antonio.solid.dependencyInversion;

public class SmtpGmail {
    public SmtpGmail(String usuario, String senha) {
        // Configurando conexão smtp
    }

    public void enviar(String html, String mail) {
        System.out.println("Enviando e-mail de confirmação📧: ".concat(html));
        // Send e-mail📧
    }
}
