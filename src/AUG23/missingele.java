package AUG23;

import java.util.Scanner;

public class missingele {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = in.nextInt();
        }
        int missing = 0;
        int repeating = 1;
        for (int i = 1; i < a; i++) {
            if(arr[i-1] == arr[i + 1]);{
                repeating = arr[i];
            }
            if(arr[i] != arr[i - 1] + 1 && arr[i] != arr[i - 1]){
                missing = arr[i - 1] + 1;
            }
        }
        if(arr[a - 1] != a){
            missing = a;
        }

        System.out.println("Repeating element: " + repeating);
        System.out.println("Missing element: " + missing);
    }
}
