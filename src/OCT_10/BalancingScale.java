package OCT_10;

import java.util.Scanner;

public class BalancingScale {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++){
            arr[i] = in.nextInt();
        }
        System.out.println(finding(a,arr));
    }
    public static int finding(int a, int[] arr){
        int totalSum = 0;
        for(int i=0;i<a;i++){
            totalSum += arr[i];
        }
        int leftSum = 0;
        for(int i=0;i<a;i++){
            int rightSum = totalSum - leftSum - arr[i];

            if(leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];
        }

        return -1;
    }
}
