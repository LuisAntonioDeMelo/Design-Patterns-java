package com.luis.antonio.patterns.adapter;

import java.math.BigDecimal;

public class PaymentSystem {

    /*
    Adapter (ou Wrapper), que permite que classes com interfaces incompatíveis
    trabalhem juntas. Este padrão é especialmente útil quando você precisa usar
    uma classe existente, mas a interface que ela implementa não é a que você precisa.
     */

    public static void main(String[] args) {

        PaymentProcessor payPalProcessor = new PayPalAdapter(new Paypal());

        Stripe stripe = new Stripe();
        stripe.setTax(BigDecimal.valueOf(200));
        StripeAdapter stripeProcessor = new StripeAdapter(stripe);


        payPalProcessor.processPayment(200.0);
        stripeProcessor.processPayment(300.0);
    }
}
