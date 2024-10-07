package SEPT_11;
import java.util.*;
public class Find_pairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int a = in.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = in.nextInt();
        }
        finding(k,arr);
    }
    public static void finding(int k, int[] arr){
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int sum = k - arr[i];
            if(sum == arr[i]){
                if(mp.containsKey(sum) && mp.get(sum) == 1){
                    System.out.println("(" + sum + ", " + arr[i] + ")");
                }
            }
            else if(mp.containsKey(sum) && !mp.containsKey(arr[i])){
                System.out.println("(" + sum + ", " + arr[i] + ")");
            }
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }
    }
}
