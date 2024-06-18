package com.luis.antonio.solid.openclosed;

import java.math.BigDecimal;

public class StoreAccount {
    private BigDecimal totalAmount;
    private BigDecimal totalAmountFee;
    //...


    public StoreAccount(BigDecimal totalAmount, BigDecimal totalAmountFee) {
        this.totalAmount = totalAmount;
        this.totalAmountFee = totalAmountFee;
    }
    public StoreAccount(String totalAmount, String totalAmountFee) {
        this.totalAmount = new BigDecimal(totalAmount);
        this.totalAmountFee = new BigDecimal(totalAmountFee);
    }


    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getTotalAmountFee() {
        return totalAmountFee;
    }

    public void setTotalAmountFee(BigDecimal totalAmountFee) {
        this.totalAmountFee = totalAmountFee;
    }

    public void showBalance(){
        System.out.println("Account balance is ::: " + totalAmount.toString());
    }
}
