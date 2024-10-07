package Class;

import java.util.Scanner;

public class Sherlock {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int q = in.nextInt();
        int[][] mat = new int[n][m];
        for(int i = 0; i < q; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            helper(mat,n,m,a,b);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] % 2 != 0){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
    public static void helper(int[][] mat,int n,int m,int a,int b){
        if(a==0){
            for(int i=0;i<m;i++){
                mat[b][i]++;
            }
        }
        else{
            for(int i=0;i<n;i++){
                mat[i][b]++;
            }
        }
    }
}
