package DAY_29;

import java.util.ArrayList;
import java.util.Scanner;

public class nprime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(2);
        int num = 3;
        while(arr.size() != a){
            boolean flag = true;
            for(int i:arr){
                if(num%i == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                arr.add(num);
            }
            num+=2;
        }
        for(int i:arr){
            System.out.print(i + " ");
        }
    }
}
