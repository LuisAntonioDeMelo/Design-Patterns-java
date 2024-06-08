package openclosed;

import singlePrincipleResposibility.Account;

import java.math.BigDecimal;

public class CryptoPayment implements Payment{

    private String walletAddress;
    private StoreAccount account;
    public CryptoPayment(String walletAddress, StoreAccount account) {
        this.walletAddress = walletAddress;
        this.account = account;
    }

    public StoreAccount getAccount() {
        return account;
    }

    public void setAccount(StoreAccount account) {
        this.account = account;
    }

    @Override
    public void pay(double amount) {
        // Logica para processar pagamento com cartão de crédito
        System.out.println("Pagando com " + amount + " usando Crypto.");
        var pay = account.getTotalAmount().add(BigDecimal.valueOf(amount));
        this.account.setTotalAmount(pay);
    }
}
