package SPET_04;

public class Items {
    private String name;
    private double price;

    public Items(String name, double price){
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
}
