package Aug_21;

import java.util.*;
public class Stair {
    /* calculate the number of ways to reach the top of a stair case with n steps you can take 1,2 steps but you can not take 2 consecutive steps of same size expect one */
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(countways(a,0));
    }
    public static int countways(int n, int last){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        int count = 0;
        count += countways(n-1,1);
        if(last != 2){
            count += countways(n - 2, 2);
        }
        if(last != 3){
            count += countways(n - 3, 3);
        }
        return count;
    }
}
