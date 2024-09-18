package Class;

import java.util.Scanner;
public class reverse_bit {
    //reverse bits of an integer
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int result = reversing(a);
        System.out.println(result);
    }
    public static int reversing(int a){
        int result = 0;
        for(int i=0;i<32;i++){
            result = result<<1;
            result = result | (a & 1);
            a = a >> 1;
        }
        return result;
    }
}
