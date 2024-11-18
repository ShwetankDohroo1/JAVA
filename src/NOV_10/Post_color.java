package NOV_10;

import java.util.Scanner;

public class Post_color {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int polls = in.nextInt();
        int colors = in.nextInt();
        int[] dp = new int[polls+1];
        for(int i=0;i<polls+1;i++){
            dp[i] = -1;
        }
        int ans = helper(polls,colors,dp);
        System.out.println(ans);
    }
    public static int helper(int a,int b,int[]dp){
        if(a == 1){
            return b;
        }
        if(a==2){
            return (b+b*(b-1));
        }
        if(dp[a] != -1){
            return dp[a];
        }
        dp[a] = (helper(a-1,b,dp) + helper(a-2,b,dp))*(b-1);
        return dp[a];
    }
}
