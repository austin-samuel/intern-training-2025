public class Main {
    public static void main(String[] args){
        Bank bank = new Bank();
        BankAccount bankAccount1 = bank.createAccount("fansan", 5000.00);
        BankAccount bankAccount2 = bank.createAccount("jarvis", 3000.00);
        BankAccount bankAccount3 = bank.createAccount(null, 3000.00);
        BankAccount bankAccount4 = bank.createAccount("asd", -200.00);

        bankAccount1.setAccountHolderName("");
        bank.displayBalance();
        bank.transferFunds(500.0,bankAccount1,bankAccount2);
        bank.displayBalance();
        bank.transferFunds(1000.0,bankAccount2,bankAccount1);
        bank.displayBalance();

        bank.transferFunds(3000.0,bankAccount2, bankAccount1);
        bank.displayBalance();


    }
}
