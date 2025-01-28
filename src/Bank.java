public class Bank {
    public BankAccount openAccount(String name,double balance)
    {
        return new BankAccount(name,balance);
    }
    public void transferFunds(double amount, BankAccount from, BankAccount to) {
        try {
            from.withdraw(amount);
            to.deposit(amount);
            System.out.println("Transferred " + amount + " from " + from.getAccountHolderName() +
                    " to " + to.getAccountHolderName());
        } catch (InsufficientFundsException | IllegalArgumentException e) {
            System.out.println("Error during transfer: " + e.getMessage());
        }
    }
}
