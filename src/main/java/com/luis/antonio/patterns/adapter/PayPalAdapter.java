package com.luis.antonio.patterns.adapter;

public class PayPalAdapter implements PaymentProcessor{
    private  Paypal paypal;

    public PayPalAdapter(Paypal paypal) {
        this.paypal = paypal;
    }

    @Override
    public void processPayment(Double amount) {
      paypal.makePayment(amount);
    }
}
