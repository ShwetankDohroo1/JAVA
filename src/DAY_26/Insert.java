package DAY_26;

import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int additional = in.nextInt();

        String ans = Integer.toString(number);
        StringBuilder str = new StringBuilder(ans);

        String additionalStr = Integer.toString(additional);

        boolean inserted = false;
        for(int i = 0; i < str.length(); i++){
            int digit = Character.getNumericValue(str.charAt(i));
            if(digit > additional){
                continue;
            }
            else{
                str.insert(i, additionalStr);
                inserted = true;
                break;
            }
        }
        if(!inserted){
            str.append(additionalStr);
        }
        System.out.println(str.toString());
    }
}
