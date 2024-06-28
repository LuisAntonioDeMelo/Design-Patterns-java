package com.luis.antonio.patterns.adapter;

public class Paypal {
    public void makePayment(Double amount) {
        System.out.println("Payment made with Paypal: $" + amount);
    }
}


