package solid.openclosed;

public class PaymentProcessor {

    //sem modificações
    //nos podemos sempre adicionar novas extensões e implementar novos tipos de pagamento
    private Payment payment;

    public PaymentProcessor(Payment payment){
        this.payment = payment;
    }

    public void processPayment(double amount) {
        payment.pay(amount);
    }
}
