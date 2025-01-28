import java.util.HashMap;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/*
* Two objects are created
* Both have name, deposit amount, withdraw amount
* Transfer is done from first person to second person
*/
public class Main {
    public static void main(String[] args) throws InsufficientFundsException {

         System.out.println("--------------------------");
         System.out.println("Welcome to Aditya's Bank");
         System.out.println("--------------------------");
         Scanner sc=new Scanner(System.in);

         System.out.println("We will demonstrate the bank by 2 accounts\nEnter the name of 1st account: ");
         String person1=sc.next();
         Bank bObj1=new Bank();

         boolean nameFlag1=bObj1.bankObject.setAccountHolderName(person1);
       //  System.out.println(nameFlag1);
         System.out.println("Ok now deposit some money, enter the amount please: ");

         double firstAmount=sc.nextDouble();
         bObj1.bankObject.deposit(firstAmount);

         System.out.println("Please withdraw some money too!");
         double secondAmount=sc.nextDouble();
         bObj1.bankObject.withdraw(secondAmount);

         System.out.println("Account 1 established.\n");
         System.out.println("Enter the name of second account holder: ");
         String person2=sc.next();
         Bank bObj2=new Bank();
         boolean nameFlag2=bObj2.bankObject.setAccountHolderName(null);

         System.out.println("Enter the amount to be deposited in second account: ");
         double amount=sc.nextDouble();
         bObj2.bankObject.deposit(amount);

         System.out.println("Ok, please withdraw some amount too.");
         secondAmount=sc.nextDouble();
         bObj2.bankObject.withdraw(secondAmount);

         System.out.println("Both accounts established.\nNow we will transfer amount.");

         try {
              System.out.println(person1 + " balance: " + bObj1.bankObject.getBalance());
              System.out.println(person2 + " balance: " + bObj2.bankObject.getBalance());
         }
         catch(Exception e)
         {
              System.out.println("Method don't exist");
         }
         System.out.println("Enter the amount you want to transfer");
         double transferAmount=sc.nextDouble();

         System.out.println("Transferring "+transferAmount+" from "+ person1+" to "+ person2);
         bObj2.transferFunds(transferAmount,bObj1.bankObject,bObj2.bankObject);

         System.out.println("Transferred");
         System.out.println(person1+" balance: "+bObj1.bankObject.getBalance());
         System.out.println(person2+" balance: "+bObj2.bankObject.getBalance());

         
         }
    }

