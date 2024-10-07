package Class;

import java.util.Scanner;
public class number_of_1_in_int {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        while(n>0){
            count+=n&1;
            n = n >> 1;
        }
        System.out.println(count);
    }
}
