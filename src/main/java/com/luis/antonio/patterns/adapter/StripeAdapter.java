package com.luis.antonio.patterns.adapter;

import java.math.BigDecimal;

public class StripeAdapter implements PaymentProcessor {


    private final Stripe stripe;


    public StripeAdapter(Stripe stripe){
        this.stripe = stripe;
    }

    @Override
    public void processPayment(Double amount) {
        stripe.pay(amount +  stripe.getTax().doubleValue());
    }

}
