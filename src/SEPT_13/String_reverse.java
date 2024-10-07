package SEPT_13;

import java.util.Scanner;

public class String_reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(reversing(str));
    }
    public static String reversing(String str){
        StringBuilder ans = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                ans.append(temp.reverse());
                ans.append(str.charAt(i));
                temp.setLength(0);
            }
            else{
                temp.append(str.charAt(i));
            }
        }
        ans.append(temp.reverse());//yeh taaaki last me jo string bachi hai voh daal rha hu ans me kyuki last me agr string hai no digit toh voh upr loop me ans me append nhi hogi.
        return ans.toString();
    }
}
