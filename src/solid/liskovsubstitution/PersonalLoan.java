package solid.liskovsubstitution;
// Subclasse (PersonalLoan): Adiciona um atributo personalCreditScore e ajusta o cálculo do juro com base no crédito pessoal.

public class PersonalLoan extends Loan {
    private int personalCretidScore;
    private int MIN_LIMIT_RATE = 750;

    public PersonalLoan(double principal, double interestRate, int personalCretidScore) {
        super(principal, interestRate);
        this.personalCretidScore = personalCretidScore;
    }

    @Override
    public double calculateIntrest() {
        if(personalCretidScore > MIN_LIMIT_RATE ){
            return principal * (interestRate - 0.01); // desconte no credito >>>>
        }
        return super.calculateIntrest();
    }
}
