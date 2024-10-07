package SEPT_19;

public class BankAccount {
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundException{
        if(amount > balance){
            throw new InsufficientFundException(amount);
        }
        balance -= amount;
    }
}
