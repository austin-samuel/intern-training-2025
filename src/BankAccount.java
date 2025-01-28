public class BankAccount {
    private double balance;
    private String accountHolderName;

    public BankAccount()
    {
        this.balance=0;
    }
   public void deposit(double amount){
        try{
            if(amount<0)
            {
                throw new IllegalArgumentException("Deposit amount cannot be negative");
            }
            else{
                this.balance += amount;

            }
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

    }

    public void withdraw(double amount)
    {
        try{
            if(amount<0)
            {
                throw new IllegalArgumentException("Withdrawal amount cannot be negative");
            }
            if(amount> this.balance)
            {
                throw new InsufficientFundsException("The balance is insufficient");
            }

            this.balance -= amount;

        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }


    }

    public double getBalance()
    {
        return this.balance;
    }

    public void setAccountHolderName(String name) throws IllegalArgumentException
    {
        if(name== null || name.isEmpty())
        {
            throw new IllegalArgumentException("Account holder name cannot be null or empty");
        }
        this.accountHolderName= name;
    }

    public String getAccountHolderName()
    {
        return this.accountHolderName;
    }

}
