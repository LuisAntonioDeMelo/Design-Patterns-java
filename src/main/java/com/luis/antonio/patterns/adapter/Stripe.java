package com.luis.antonio.patterns.adapter;

import java.math.BigDecimal;

public class Stripe {

    private BigDecimal tax;

    public void pay(Double amount) {
        System.out.println("Payment made with Stripe: $"+ amount);
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getTax() {
        return tax;
    }
}
