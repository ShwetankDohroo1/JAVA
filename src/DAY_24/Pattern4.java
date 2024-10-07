package DAY_24;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int a = in.nextInt();
        pattern4(a);
    }
    static void pattern4(int a){
        for (int i = 0; i < 2*a; i++) {
            int total = i > a ? 2*a - i: i;
            for (int j = 0; j < total; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
