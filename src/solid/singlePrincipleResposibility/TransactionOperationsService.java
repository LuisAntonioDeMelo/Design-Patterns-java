package solid.singlePrincipleResposibility;

import java.math.BigDecimal;

public class TransactionOperationsService {
    //Isso é melhor por que as transações ficam no lugar certo
    public void deposit(BigDecimal amount, int accountNumber) {
        //obter os atributos e uma responsabilidade do nosso service de contas
        AccountOperationsService accountOperationsService = new AccountOperationsService();
        Account account = accountOperationsService.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount().add(amount));
        accountOperationsService.save(account);
    }


    public void withdraw(BigDecimal amount, int accountNumber){
        AccountOperationsService accountOperationsService = new AccountOperationsService();
        Account account = accountOperationsService.getAccount(accountNumber);
        if(account.getTotalAmount().compareTo(BigDecimal.ZERO) > 0){
            throw new RuntimeException("You dont have any savings for withdraw");
        }
        account.setTotalAmount(account.getTotalAmount().subtract(amount));
        accountOperationsService.save(account);
    }
}
