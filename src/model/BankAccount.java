package model;

import exceptions.InsufficientFundsException;
import exceptions.InvalidAmountException;
import exceptions.InvalidNameException;

public class BankAccount {

  private String accountHolderName;
  private double balance;

  public BankAccount(String accountHolderName) {
    this.setAccountHolderName(accountHolderName);
  }

  public String getAccountHolderName() {
    return accountHolderName;
  }

  private void setAccountHolderName(String accountHolderName) {

    try{
      if(accountHolderName.isEmpty() || accountHolderName == null)
          throw new InvalidNameException("Name cannot be empty or null.");

    }
    catch (InvalidNameException e)
    {
      System.out.println(e.getMessage());
    }

    this.accountHolderName = accountHolderName;
  }

  public double getBalance() {
    return balance;
  }

  public void deposit(double amount){

      try {
        if(amount < 0)
          throw new InvalidAmountException("Input amount value cannot be negative.");
      }
      catch (InvalidAmountException e){
        System.out.println(e.getMessage());
        return;
      }


    this.balance += amount;
    System.out.println("ACCOUNT NAME: "+this.accountHolderName);
    System.out.println("Amount ₹"+amount+" credited to your account.");
    System.out.println("Current available balance ₹"+this.balance);
    System.out.println("----------------------------------------------------------------");

  }

  public boolean withdraw(double amount) {

    try {
      if (amount <= 0) {
        throw new InvalidAmountException("Withdrawal amount must be positive.");
      }

      if(this.getBalance() < amount) {
        throw new InsufficientFundsException("Insufficient balance ₹" + this.getBalance());
      }
    }
    catch (InsufficientFundsException e) {
      System.out.println("Error: "+e.getMessage());
      return false;
    }
    catch (InvalidAmountException e) {
      System.out.println("Error: "+e.getMessage());
      return false;
    }

    this.balance -= amount;
    System.out.println("ACCOUNT NAME: "+this.accountHolderName);
    System.out.println("Amount Debited: ₹"+ amount);
    System.out.println("Withdrawal Successful. Remaining available balance ₹"+this.balance);
    System.out.println("----------------------------------------------------------------");
    return true;
  }

}
