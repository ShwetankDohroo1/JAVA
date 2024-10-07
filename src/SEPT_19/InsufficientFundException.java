package SEPT_19;

public class InsufficientFundException extends Exception{
    private double amount;

    @Override
    public String toString() {
        return "Or paise laa jakr";
    }
    public InsufficientFundException(double amount){
        this.amount = amount;
    }

    void getAmount(){
        System.out.println(amount);
    }
}
