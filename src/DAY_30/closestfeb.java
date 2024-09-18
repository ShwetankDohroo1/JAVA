package DAY_30;

import java.util.Scanner;

public class closestfeb {
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int a=0,b=1;
        while(b<=n){
            int temp = b;
            b = a+b;
            a = temp;
        }
        System.out.println("Nearest Fibonacci Number");
        System.out.println(Math.abs(b-n)>Math.abs(n-a) ? a : b);
    }
}
