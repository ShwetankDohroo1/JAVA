package OOPS_java;
import java.util.Scanner;
class Basic2 {
    int id;
    String name;

    Basic2(int i, String n){
        this.id = i;
        this.name = n;
    }
}
public class basic1 {
    public static void main(String[] args) {
        Basic2 s = new Basic2(1, "shwetank");
        System.out.println(s.id + " " + s.name);
    }
}
