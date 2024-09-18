package DAY_26;

import java.util.Scanner;

public class addone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        Adding(number);
    }

    public static void Adding(int number) {
        String numStr = Integer.toString(number);
        StringBuilder result = new StringBuilder();
        int carry = 0;

        for (int i = numStr.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            digit += 1 + carry;

            if(digit >= 10){
                carry = 1;
                digit = digit - 10;
            }
            else{
                carry = 0;
            }
            result.append(digit);
        }
        if(carry == 1){
            result.append(1);
        }
        result.reverse();
        int newNumber = Integer.parseInt(result.toString());
        System.out.println(newNumber);
    }
}
