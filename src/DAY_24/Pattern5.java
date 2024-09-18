package DAY_24;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        pattern5(a);
    }
    static void pattern5(int a){
        for (int i = 0; i < 2*a; i++) {
            int total = i > a ? 2*a - i: i;
            int spaces = a - total;
            for(int j = 0;j<spaces;j++){
                System.out.print(" ");
            }
            for (int j = 0; j < total; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
