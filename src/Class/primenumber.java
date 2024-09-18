package Class;

import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        boolean ans = isprime(a);
        System.out.println(ans);
    }
    static boolean isprime(int a){
        if(a<=1){
            return false;
        }
        int b = 2;
        while(b*b <= a){
            if(a%b == 0){
                return false;
            }
            b++;
        }
        return b*b>a;
    }
}
