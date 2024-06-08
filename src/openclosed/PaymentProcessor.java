package openclosed;

public class PaymentProcessor {

    private Payment payment;

    public PaymentProcessor(Payment payment){
        this.payment = payment;
    }

    public void processPayment(double amount) {
        payment.pay(amount);
    }
}
