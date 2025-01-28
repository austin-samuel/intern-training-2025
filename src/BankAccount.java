import java.io.IOException;

public class BankAccount {
    private double bankAmount=0;
    public String accountHolderName;
    public BankAccount()
    {
    }

    /*
    * To deposit the amount in bank
    * IOException: amount begin less than 0
    * returns void
    * */
    void deposit(double amount)
    {
        try {
            if (amount < 0) {
                throw new IOException("You can't give negative amount!!");
            } else {
                this.bankAmount+= amount;
            }
        }
            catch(IOException e)
            {
                System.out.println(e.getMessage());
            }
        }

    /*
    * Withdraws amount from bank account
    * InsufficientFundsException: custom exception
    * returns void
    * */
    void withdraw (double amount) throws InsufficientFundsException
    {
        boolean flag=false;
        try {
            if (amount < 0) {
                throw new IllegalAccessException("Illegal Access: Amount cannot be negative");
            }
        }
        catch(IllegalAccessException e1) {
            System.out.println(e1.getMessage());
        }
        if((this.bankAmount >= amount) && (amount>0))
        {
            this.bankAmount-=amount;
        }
        else throw new InsufficientFundsException("Amount is not sufficient to withdraw");
    }

    /*
    * getBalance(): to display current balance of account
    * returns double value
    * */
    double getBalance()
    {
        System.out.println("Accessing balance...");
        return this.bankAmount;
    }

    /*
    * setAccountHolderName(): giving name to account
    * returns nothing but sets value*/
    boolean setAccountHolderName(String name)
    {
        boolean NameAssigned=false;
        try {
            this.accountHolderName = name;
            if(name.isEmpty())
            {
                throw new NullPointerException("The name given was empty!!");
            }
            NameAssigned=true;
            System.out.println("Account holder name given");
        }
        catch(NullPointerException e)
        {
            System.out.println("Empty String/ Null Pointer Exception"+e.getMessage());
        }
        return NameAssigned;
    }
}
