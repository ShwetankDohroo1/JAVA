package SEPT_12;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        FI1 t = new FI1();
//        t.print("Shwetank");
//
//        Functional_Interface t2 = new Functional_Interface(){
//          @Override
//          public void print(String name){
//              System.out.println("You are inside Anonymous interface "+ name);
//          }
//        };
//        t2.print("Shwetank");
//
//        Functional_Interface t3 = (name) -> {
//            System.out.println("You are in Lembda Expression " + name);
//        };
//        t3.print("Shwetank");
        int[] arr = {3,4,5,6,7,2,1,9};

        Calculator add = (a,b) -> a+b;
        Calculator sub = (a,b) -> a-b;
        Calculator mult = (a,b) -> a*b;
        Calculator div = (a,b) -> a/b;

        System.out.println(add.cal(20,30));
        System.out.println(sub.cal(20,30));
        System.out.println(mult.cal(20,30));
        System.out.println(div.cal(60,30));
    }
}
