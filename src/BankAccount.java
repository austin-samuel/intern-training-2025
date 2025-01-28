public class BankAccount {
    private double balance;
    private String AccountHolderName;
    public BankAccount(String name,double balance)
    {
        try
        {
           if(balance<0)
           {
               throw new IllegalArgumentException("balance cannot be negative");
           }
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("error: "+e.getMessage());
            this.balance=0;
        }
        this.balance=balance;
        setAccountHolderName(name);
    }
public void deposit(double amount)
{
    if(amount<=0)
    {
        throw new IllegalArgumentException("amount to be deposited must be greater than zero ");
    }
    System.out.println("current account balance is: "+balance);
   this.balance+=amount;
   System.out.println("Updated balance is : "+balance);
}
public void withdraw(double amount)throws InsufficientFundsException
{
    if(amount<=0)
    {
        throw new IllegalArgumentException("amount to be deposited must be greater than zero ");
    }
    System.out.println("current available balance is :"+balance);

    if(amount>balance)
    {
        throw new InsufficientFundsException("Insufficient balance");
    }
    this.balance-=amount;
    System.out.println("withdrawn amount :"+amount);
}
public double getBalance()
{
    return balance;
}
public String getAccountHolderName()
{
    return AccountHolderName;
}
    public void setAccountHolderName(String accountHolderName) {
        if(accountHolderName==null ||accountHolderName.isEmpty())
        {
            throw new IllegalArgumentException("name cannot be empty");
        }
        AccountHolderName = accountHolderName;
    }
}
