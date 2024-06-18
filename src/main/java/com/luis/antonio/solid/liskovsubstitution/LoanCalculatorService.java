package com.luis.antonio.solid.liskovsubstitution;
public class LoanCalculatorService {

    //simulacao
    public static void printLoanInterest(Loan loan){
        double interest = loan.calculateIntrest(); //podemos passar tanto o personal quanto os bussiness
        System.out.println("Calculo valor do emprestimo :" + interest);
    }
    public static void main(String[] args) {
        Loan personalLoan = new PersonalLoan(10000, 0.05, 800);
        Loan businessLoan = new BusinessLoan(5000, 0.04, 200000);

        printLoanInterest(personalLoan);
        printLoanInterest(businessLoan);
    }
}
