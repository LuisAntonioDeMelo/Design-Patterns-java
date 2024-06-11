package solid.liskovsubstitution;
// Subclasse (BusinessLoan): Adiciona um atributo businessRevenue e ajusta o cálculo do juro com base na receita do negócio.
public class BusinessLoan extends Loan {
    public double businessRevenue;

    public BusinessLoan(double principal, double interestRate, double businessRevenue) {
        super(principal, interestRate);
        this.businessRevenue = businessRevenue;
    }

    @Override
    public double calculateIntrest() {
        if(businessRevenue > 10000) {
            return principal * (interestRate - 0.02);
        }
        return super.calculateIntrest();
    }
}
