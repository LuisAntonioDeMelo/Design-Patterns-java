package solid.liskovsubstitution;
// Classe Base (Loan): Define a estrutura básica de um empréstimo com um método para calcular o juros
public class Loan {
    protected double principal;
    protected double interestRate;

    public Loan(double principal, double interestRate) {
        this.principal = principal;
        this.interestRate = interestRate;
    }

    public double calculateIntrest() {
        return principal * interestRate;
    }
}
