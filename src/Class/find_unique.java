package Class;

import java.util.Scanner;
public class find_unique {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            int a = in.nextInt();
            arr[i] = a;
        }
        int uni = 0;
        for(int i=0;i<size;i++){
            uni^=arr[i];
        }
        System.out.println(uni);
    }
}
