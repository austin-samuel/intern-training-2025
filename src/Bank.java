public class Bank {
    //bank account object
    BankAccount bankObject=new BankAccount();

    /*
    * transferFunds(): accepts amount, and transfers amount
    * fromAccount: The sender object
    * toAccount: The receiver object
    * */
    public void transferFunds(double amount,BankAccount fromAccount,
                              BankAccount toAccount) throws InsufficientFundsException {

        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
    }
}
