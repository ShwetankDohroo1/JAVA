package AUG24;

public class stock {
    private static int stock;
    private static double price;
    private static int tosell;

    static void restock(int newstocks){
        stock += newstocks;
        System.out.println("New Total of Stocks is :- " + stock);
    }
    static void selling(){
        if(stock < tosell){
            System.out.println("Insufficient stocks");
        }
        else{
            System.out.println("Money earned;- " + tosell*price);
            stock -= tosell;
            System.out.println("Stocks left:- " + stock);
        }
    }

    public static void main(String[] args) {
        stock = 100;
        price = 20.0;
        tosell = 50;

        // Restock
        restock(30);

        // Sell
        selling();
    }
}
