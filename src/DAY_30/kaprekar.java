package DAY_30;

import java.util.Scanner;

public class kaprekar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(checking(n)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    public static boolean checking(int n){
        int sq = n*n;
        String numStr = Integer.toString(sq);
        int ln = numStr.length();
        for (int i = 1; i < ln; i++) {
            String leftPart = numStr.substring(0, i);
            String rightPart = numStr.substring(i);

            int leftnum = (leftPart.isEmpty())?0: Integer.parseInt(leftPart);
            int rightnum = (rightPart.isEmpty())?0: Integer.parseInt(rightPart);

            if((leftnum + rightnum) == n){
                return true;
            }
        }
        return false;
    }
}
