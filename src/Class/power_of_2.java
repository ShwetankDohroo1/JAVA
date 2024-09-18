package Class;

import java.util.Scanner;
public class power_of_2 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(a > 0 && (a&(a-1)) == 0);
    }
}
