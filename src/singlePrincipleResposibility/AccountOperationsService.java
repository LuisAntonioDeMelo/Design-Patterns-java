package singlePrincipleResposibility;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class AccountOperationsService {

    private static Map<Integer, Account> accountMap = new HashMap<>();

    public void addAccount(Account account) {
        accountMap.put(account.getAccountNumber(), account);
    }
    public Account getAccount(int accountNumber) {
        return accountMap.get(accountNumber);
    }

    // Metodo não pertence a classe e não segue o principio
    // this method can't be here because "hurts" the single resposablity principle
    public void deposit(BigDecimal ammount, int accountNumber) {
        Account account = getAccount(accountNumber);
        BigDecimal depositAmmount = account.getTotalAmount().add(ammount);
        account.setTotalAmount(depositAmmount);
    }

    public void save(Account account) {
        System.out.println("Account save!!!");
    }
}
