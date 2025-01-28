package model;

import exceptions.InvalidAmountException;

public class Bank {

  static void transferFunds(double amount, BankAccount fromAccount, BankAccount toAccount) {

    System.out.println("----------------------------------------------------------------");
    System.out.println("TRANSACTION INITIATING...");
    boolean transactionFlag = false;

    // Attempt withdrawal and deposit
    if (fromAccount.withdraw(amount)) {
      toAccount.deposit(amount);
      transactionFlag = true;
    }

    if (transactionFlag) {
      System.out.println("TRANSACTION SUCCESSFUL!");
      System.out.println("Amount ₹" + amount + " transferred from " + fromAccount.getAccountHolderName() + " to " + toAccount.getAccountHolderName());
    } else {
      System.out.println("TRANSACTION FAILED!");
    }
    System.out.println("----------------------------------------------------------------");

  }

  public static void main(String[] args) {
    // Create bank accounts
    BankAccount account1 = new BankAccount("Rahul Jain");
    BankAccount account2 = new BankAccount("Vinod Pal");

    // Case-1: Deposit valid amounts
    account1.deposit(5000);
    account2.deposit(3000);

    // Case-2: Withdraw with sufficient balance
    account1.withdraw(2000);

    // Case-3: Withdraw with insufficient balance (throws InsufficientFundsException)
    account1.withdraw(4000);

    // Case-4: Transfer valid amount between accounts
    Bank.transferFunds(2000, account2, account1);

    // Case-5: Transfer amount more than available in the fromAccount (throws InsufficientFundsException)
    Bank.transferFunds(5000, account2, account1);

    // Case-6: Deposit a negative amount (throws InvalidAmountException)
    account1.deposit(-100);

    // Case-7: Withdraw a negative amount (throws InvalidAmountException)
    account2.withdraw(-500);

    // Case-8: Create account with invalid name (throws InvalidNameException)
    BankAccount invalidAccount = new BankAccount("");

    // Case-9: Runtime Exception - ArrayIndexOutOfBoundsException
    System.out.println("\n");
    int[] transactionIds = {1001, 1002, 1003};
    try {
      System.out.println("Accessing invalid transaction ID: " + transactionIds[3]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Error: " + e.getMessage());
    }

    // Case-10: Runtime Exception - ArithmeticException
    System.out.println("\n");
    try {
      int result = 100 / 0;
      System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
      System.out.println("Error: Division by zero.");
    }
  }

}
