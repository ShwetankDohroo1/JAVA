package SEPT_11;
import java.util.*;
public class Chocolate {
    public static int chocolateAfterCut(int[] arr,int mid){
        int total = 0;
        for(int x : arr){
            if( x > mid){
                total += (x - mid);
            }
        }
        return total;
    }
    public static void main(String args[]){
        int arr[] = {20,8,17,15};
        int k = 7;

        //solution
        int low = 0;
        int high = -1;
        for(int x : arr){
            high = Math.max(high,x);
        }
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;

            int rem = chocolateAfterCut(arr,mid);
            if(rem >= k){
                ans = mid;
                low = mid+1;
            }
            else
                high = mid-1;
        }
        System.out.println(ans == -1 ? "all chocolates are cutt" : ans);
    }
}