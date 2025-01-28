package session7_exception;

import java.io.IOException;

public class Bank {
    public BankAccount openAccount() {
        return new BankAccount();
    }

    public void transferFunds(double amount, BankAccount fromAccount, BankAccount toAccount) {
        try {
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Transaction successful");
        }
        catch (InsufficientFundsException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Transaction cancelled");
        }
    }
}
