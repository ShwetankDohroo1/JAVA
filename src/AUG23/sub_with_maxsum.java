package AUG23;

import java.util.Scanner;

public class sub_with_maxsum {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int a = in.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = in.nextInt();
        }
        int maxsum = Integer.MIN_VALUE;
        int maxi = 0;
        for(int i=0;i<a;i++){
            maxi = Math.max(arr[i],maxi+arr[i]);
            maxsum = Math.max(maxi,maxsum);
        }
        System.out.println("Max sum of subarray is:- "+ maxsum);
    }
}
