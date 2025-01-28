
public class Main {
    public static void main(String[] args) {

        try{
            Bank bank= new Bank();

            BankAccount account1= bank.openNewAccount();
            BankAccount account2= bank.openNewAccount();

            account1.setAccountHolderName("Gauri");
            account2.setAccountHolderName("Sakshi");

            account1.deposit(1000);
            account1.withdraw(200);

            /* Exception testing
            account1.deposit(-10);
            account1.withdraw(20000);
             */

            System.out.println(account1.getAccountHolderName()+ "'s account balance: "+ account1.getBalance());
            System.out.println(account2.getAccountHolderName()+ "'s account balance: "+ account2.getBalance());

            bank.transferFunds(300, account1, account2);
            System.out.println(account1.getAccountHolderName()+ "'s account balance after transferring funds : "+ account1.getBalance());
            System.out.println(account2.getAccountHolderName()+ "'s account balance after transferring funds: "+ account2.getBalance());

            /*
            Compile-time exception demonstration
            account1.getAccountBalance();
            */

        }
        catch (InsufficientFundsException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        /*
        Run time exception demonstration
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Runtime Exception occurred: " + e.getMessage());
        }

         */


    }
}