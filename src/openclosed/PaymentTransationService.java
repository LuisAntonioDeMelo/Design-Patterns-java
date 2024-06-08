package openclosed;

import java.util.List;

public class PaymentTransationService {

    public static void processPayment() {
        StoreAccount account = new StoreAccount("10000", "300000");

        //Payment payment = creditCardPayment;// so para entender;
        Payment creditCardPayment = new CreditCardPayment("4444-5555-6666-7777", "Luis Antonio", account);
        PaymentProcessor creditCardProccessor =  new PaymentProcessor(creditCardPayment);
        creditCardProccessor.processPayment(150.0);

        Payment payPalPayment = new PayPalPayment("luis_antonio@email.com", account);
        PaymentProcessor payPalProcessor = new PaymentProcessor(payPalPayment);
        payPalProcessor.processPayment(500);

        Payment cryptoPayment = new CryptoPayment("1A2B3C4D5E6F", account);
        PaymentProcessor cryptoProcessor = new PaymentProcessor(cryptoPayment);
        cryptoProcessor.processPayment(500.0);

        ///obedecendo o open close principle e possivel implementar diversos tipos de pagamento
        //sem precisar colocar varios tipos de pagamento na mesma classe
        account.showBalance();
    }

    public static void main(String[] args) {
        processPayment();
    }
}
