package AUG23;

import java.util.Scanner;

public class goodpairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = in.nextInt();
        }
        int i = 0;
        int j = arr[a-1];
        int count = 0;
        while(i < j){
            if(arr[i] == arr[j]) {
                count++;
                i++;
                j--;
            }
            else{
                j--;
                if(arr[i] == arr[j]){
                    count++;
                    i++;
                }
            }
        }
        System.out.println(count);
    }
}
