package SPET_04;
import java.util.*;
public class Customer implements Runnable{
    private String name;
    private List<Items> items;
    private double TotalCost;

    public Customer(){};
    public Customer(String name, List<Items> items){
        this.name = name;
        this.items = items;
        this.TotalCost = 0.0;
    }

    public void checkout(){
        for(Items i:items){
            TotalCost+=i.getPrice();
        }
        try{
            System.out.println(name + " is checking out with " + items.size());
            Thread.sleep(items.size() * 100);
            System.out.println(name + " completed checked out with bill of " + TotalCost);
        }
        catch(InterruptedException err){
            System.out.println(err.getMessage());
        }
    }
    @Override
    public void run(){
        checkout();
    }

}
