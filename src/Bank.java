import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<BankAccount> bankAccounts = new ArrayList<>();

    BankAccount createAccount(String name, Double amount){
        try {
            BankAccount bankAccount = new BankAccount(name, amount);
            bankAccounts.add(bankAccount);
            System.out.println("S: Account Created");
            return bankAccount;
        }
        catch (IOException | NullPointerException e){
            System.out.println("Exception during Account creation :: "+e);
        }

        return null;
    }

    void transferFunds(Double amount, BankAccount fromAccount, BankAccount toAccount) {
        try {
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("S: Fund Transferred");
        }
        catch (Exception e) {
            System.out.println("Exception during funds transfer :: "+e);
        }
    }

    void displayBalance(){
        for (BankAccount bankAccount : bankAccounts){
            System.out.println(bankAccount.getAccountHolderName()+" ------ "+bankAccount.getAccountBalance());
        }
    }
}
