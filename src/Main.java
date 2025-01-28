public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        BankAccount account1=bank.openAccount("Tarun", 1000);
        BankAccount account2=bank.openAccount("Pratap", 500);

        if (account1!=null && account2!=null) {
            try {
                System.out.println("amount after deposit in account1 : ");
                account1.deposit(200);
                System.out.println("amount after withdraw in account1 : ");
                account1.withdraw(150);
                System.out.println("Account 1 Balance: " + account1.getBalance());
                bank.transferFunds(300,account1,account2);
                System.out.println("Account 2 Balance: " + account2.getBalance());
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
 /*   runtime demo
    public void demonstrateRuntimeException() {
        try {
            int[] numbers = {1,2,3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Runtime Error: " + e.getMessage());
        }
    }
    //compiletime demo
    public void demonstrateCompileTimeException() {
    // noexistanceMethod();
}
     */
}
