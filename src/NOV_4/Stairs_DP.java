package NOV_4;
import java.util.*;
public class Stairs_DP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] dp = new int[n+1];
        for(int i=0;i<n+1;i++){
            dp[i] = -1;
        }
        System.out.println(ways(n,dp));
        System.out.println(waysTab(n,dp));
    }
    //memo
    public static int ways(int n, int[] memo){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        if(memo[n] != -1){
            return memo[n];
        }
        memo[n] = ways(n-1,memo) + ways(n-2,memo);
        return memo[n];
    }
    //tabulation
    public static int waysTab(int n, int[] tab){
        if(n == 0) {
            return 1;
        }
        if(n == 1){
            return 1;
        }
        tab[0] = 1;
        tab[0] = 1;
        for(int i = 2; i <= n; i++) {
            tab[i] = tab[i-1] + tab[i-2];
        }
        return tab[n];
    }
}
