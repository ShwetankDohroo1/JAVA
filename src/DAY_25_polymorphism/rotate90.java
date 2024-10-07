package DAY_25_polymorphism;

import java.util.Scanner;

public class rotate90 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = in.nextInt();
            }
        }
        rotate(mat);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void reverserow(int[] row){
        int n = row.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = row[i];
            row[i] = row[n - i - 1];
            row[n - i - 1] = temp;
        }
    }
    public static void rotate(int[][] mat){
        int n = mat.length;
        //transpose
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            reverserow(mat[i]);
        }
    }
}
