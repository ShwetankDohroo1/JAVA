package DAY_24;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in. nextInt();
        pattern3(a);
    }
    static void pattern3(int a){
        for (int i = 1; i <= a; i++) {
            for (int j = a-1; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
