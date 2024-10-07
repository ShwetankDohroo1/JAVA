package AUG_20;
import java.util.*;
public class expection {
    public static void main(String[] args) {
        try{
            int data = 100/0;
            System.out.println(data);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("rest of the code.....");
    }
}
