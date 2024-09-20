package SEPT_19;

public class BankDemo {
    public static void main(String[] args) {
        BankAccount bk = new BankAccount(1000);
        try{
            bk.withdraw(2000);
        }catch (InsufficientFundException e){
//            e.getAmount();
            System.out.println(e);
        }
    }
}
