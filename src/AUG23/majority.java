package AUG23;

import java.util.Scanner;

public class majority {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = in.nextInt();
        }
        int majority = arr[0];
        int count = 1;
        for (int i=1; i<arr.length; i++){
            if(count == 0){
                majority = arr[i];
                count = 1;
            }
            else if(arr[i] == majority){
                count++;
            }
            else{
                count--;
            }
        }
        System.out.println(majority);
    }
}
