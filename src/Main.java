public class Main {
    public static void main(String[] args){
        Bank bank = new Bank();
        BankAccount bankAccount1 = bank.createAccount("fansan", 5000.00);
        BankAccount bankAccount2 = bank.createAccount("jarvis", 3000.00);
        BankAccount bankAccount3 = bank.createAccount(null, 3000.00);
        BankAccount bankAccount4 = bank.createAccount("asd", -200.00);

        bank.displayBalance();
        bank.transferFunds(500.0,bankAccount1,bankAccount2);
        bank.displayBalance();
        bank.transferFunds(1000.0,bankAccount2,bankAccount1);
        bank.displayBalance();
        bank.transferFunds(3000.0,bankAccount2, bankAccount1);

        try {
            bankAccount1.setAccountHolderName("");
        } catch (NullPointerException e) {
            System.out.println("Exception while setting name :: "+e);
        }

        // ----- Runtime Exception -----
        //Array Index Out Of Bounds Exception
        try {
            int[] arr = {1, 2, 3};
            arr[3] = 4;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Runtime Exception Demo :: "+e);
        }

        //Arithmetic Exception
        try {
            int a=10/0;
        }catch (ArithmeticException e){
            System.out.println("Runtime Exception Demo :: "+e);
        }

        //Compile Time Exception
        // Class not found exception
//        try {
//            Fansan fansan;
//        }catch (ClassNotFoundException e){
//            System.out.println("Compile Time Exception Demo :: "+e);
//        }
    }
}
