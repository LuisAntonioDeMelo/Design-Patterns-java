package openclosed;

import singlePrincipleResposibility.Account;

import java.math.BigDecimal;

public class CreditCardPayment implements Payment{

    private String cardNumber;
    private String cardHolderName;

    private StoreAccount account;
    public CreditCardPayment(String cardNumber, String cardHolderName, StoreAccount account) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.account = account;
    }

    public StoreAccount getAccount() {
        return account;
    }

    @Override
    public void pay(double amount) {
        // Logica para processar pagamento com cartão de crédito
        System.out.println("Pagando com " + amount + " usando Cartão de Crédito.");
        var pay = account.getTotalAmount().add(BigDecimal.valueOf(amount));
        this.account.setTotalAmount(pay);
    }
}
