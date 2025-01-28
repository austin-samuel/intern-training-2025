public class Bank {
    public BankAccount openNewAccount()
    {
        return new BankAccount();
    }

    public void transferFunds(double amount, BankAccount fromAccount, BankAccount toAccount) throws InsufficientFundsException
    {

        if (amount>fromAccount.getBalance()){
            throw new InsufficientFundsException("Insufficient funds. Cannot transfer.");
        }
        fromAccount.withdraw(amount);
        toAccount.deposit(amount);

    }
}
