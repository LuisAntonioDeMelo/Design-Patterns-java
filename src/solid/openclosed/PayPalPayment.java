package solid.openclosed;

import java.math.BigDecimal;

public class PayPalPayment implements Payment{
    private String email; // paypal account properties - propiedades do paypal
    private StoreAccount account;
    public PayPalPayment(String email, StoreAccount account) {
        this.email = email;
        this.account = account;
    }
    public StoreAccount getAccount() {
        return account;
    }

    @Override
    public void pay(double amount) {
        // Logica para processar pagamento com paypal
        System.out.println("Pagando com " + amount + " com Paypal.");
        var pay = account.getTotalAmount().add(BigDecimal.valueOf(amount));
        this.account.setTotalAmount(pay);
    }
}
