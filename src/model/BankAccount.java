package model;

public class BankAccount {

  private String accountHolderName;
  private double amount;
  private double balance;

  public String getAccountHolderName() {
    return accountHolderName;
  }

  public void setAccountHolderName(String accountHolderName) {

    try{
      if((accountHolderName.isEmpty() )|| (accountHolderName == null))
          throw new CustomException

    }
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void deposit(double amount){

    while(amount < 0)
    {
      try {
          throw new customException("Input amount value cannot be negative.");
      }
      catch (customException e){
        System.out.println(e.getMessage());

      }
    }

    balance += amount;
    System.out.println("Amount ₹"+amount+" credited to your account no. 1000xyz");
    System.out.println("Total available balance ₹"+balance);
  }

  public void withdraw(double amount) {


  }


}
