package DAY_25_polymorphism;

import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int m = in.nextInt();
        int[][] a = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j] = in.nextInt();
            }
        }
        int left = 0;
        int right = m-1;
        int top = 0;
        int bottom = n-1;
        int count = 0;
        while(left <= right && top <= bottom){
            //traverse from left to right along the top row
            for (int i = left; i <= right; i++) {
                System.out.print(a[top][i] + " ");
            }
            top++;

            //traverse from top to bottom along the right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(a[i][right] + " ");
            }
            right--;

            //traverse from right to left along the bottom row, if there is still a row
            if(top<=bottom){
                for (int i = right; i >= left; i--) {
                    System.out.print(a[bottom][i] + " ");
                }
                bottom--;
            }

            //traverse from bottom to top along the left column, if there is still a column
            if(left<=right){
                for (int i = bottom; i >= top; i--) {
                    System.out.print(a[i][left] + " ");
                }
                left++;
            }
            count++;
        }
        System.out.println(count);
    }
}
