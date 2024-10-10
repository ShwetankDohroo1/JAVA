package OCT_9;

import java.util.Scanner;

public class JumpStreet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++){
            arr[i] = in.nextInt();
        }
        int start = 0;
        int end = a-1;
        while(start < a-1){
            if(arr[start] == 0){
                start--;
                break;
            }
            else{
                start++;
            }
        }
        while(end > 0){
            if(arr[end] == 0){
                end++;
                break;
            }
            else{
                end--;
            }
        }
        System.out.println(end - start);
    }
}
