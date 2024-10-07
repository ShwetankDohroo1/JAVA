package DAY_25_polymorphism;

import java.util.Scanner;

public class Multiply_mat {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int m = n;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }
        int[][] b = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = in.nextInt();
            }
        }
        int[][] c = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                c[i][j] = 0;
                for(int k=0;k<n;k++){
                    c[i][j] += a[i][j] * b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
