package session7_exception;

import java.io.IOException;

public class BankAccount {
    private String name;
    private double balance;

    public void deposit(double amount) throws IOException {
        if (amount < 0) {
            throw new IOException("Exception :: Negative values not allowed");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException, IOException {
        if (amount > balance) {
            throw new InsufficientFundsException("Exception :: Insufficient funds");
        }
        if (amount < 0) {
            throw new IOException("exception :: Negative values not allowed");
        }
        this.balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolderName(String name) {
        try {
            if (name == null) {
                throw new NullPointerException("Exception :: Name cannot be null");
            }
            if (name.isEmpty()) {
                throw new IOException("Exception :: Name cannot be empty");
            }
            this.name = name;
        }
        catch (NullPointerException | IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }
}
