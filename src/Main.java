package session7_exception;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        BankAccount account1 = bank.openAccount();
        BankAccount account2 = bank.openAccount();

        account1.setAccountHolderName(null);
        account1.setAccountHolderName("");
        account1.setAccountHolderName("Aryan");
        account2.setAccountHolderName("Sanchy");

        account1.setBalance(100.00);
        account2.setBalance(490.00);

        System.out.println();
        System.out.println("Amount transferring = Rs. 100");
        bank.transferFunds(100, account2, account1);
        System.out.println("Balance in account " + account1.getName() + " after transaction = " + account1.getBalance());
        System.out.println("Balance in account " + account2.getName() + " after transaction = " + account2.getBalance());

        System.out.println();
        System.out.println("Amount transferring = Rs. 800");
        bank.transferFunds(800, account2, account1);
        System.out.println("Balance in account " + account1.getName() + " after transaction = " + account1.getBalance());
        System.out.println("Balance in account " + account2.getName() + " after transaction = " + account2.getBalance());

        System.out.println();
        System.out.println("Amount transferring = Rs. -100");
        bank.transferFunds(-100, account2, account1);
        System.out.println("Balance in account " + account1.getName() + " after transaction = " + account1.getBalance());
        System.out.println("Balance in account " + account2.getName() + " after transaction = " + account2.getBalance());

//        System.out.println(10/0);
//        System.out.println(account1.getHello());
//        FileReader file = new FileReader("Hello.txt");
    }
}
