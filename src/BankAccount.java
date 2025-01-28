import java.io.IOException;

public class BankAccount {
    private String accountHolderName;
    private Double accountBalance = 0.00;
    BankAccount(String name, Double amount) throws IOException, NullPointerException{
        if(name==null || name.isEmpty())
            throw new NullPointerException("Name cannot be empty");

        if(amount<0) throw new IOException("Amount cannot be less than zero");
        this.accountHolderName = name;
        this.accountBalance = amount;
    }

    void deposit(Double amount) throws IOException {
        if(amount<0) throw new IOException("Amount cannot be less than zero");
        System.out.println("S: Amount deposited to "+this.accountHolderName);
        accountBalance+=amount;
    }

    void withdraw(Double amount) throws IOException, InsufficientFundsException {
        if(amount<0) throw new IOException("Amount cannot be less than zero");
        if(accountBalance>amount){
            accountBalance-=amount;
            System.out.println("S: Amount Debited from "+this.accountHolderName);
        }
        else throw new InsufficientFundsException("Insufficient Account Balance in "+this.accountHolderName);
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        if(accountHolderName.isEmpty()) throw new NullPointerException("Name cannot be empty");
        this.accountHolderName = accountHolderName;

    }
}
