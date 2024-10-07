package DAY_26;

import java.util.Arrays;
import java.util.Scanner;

public class Kaprekar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 4-digit number: ");
        int num = scanner.nextInt();
        int count = 0;

        while(num != 6174){
            if(num == 1111 || num == 0000 || num == 3333 || num == 4444 || num == 5555 || num == 6666 || num == 7777 || num == 8888 || num == 9999){
                System.out.println("abey jaa troller");
                break;
            }
            num = kaprekarStep(num);
            count++;
        }

        System.out.println("It took " + count + " iterations to reach 6174.");
    }
    public static int kaprekarStep(int num) {
        String numStr = String.format("%04d", num);
        char[] numArr = numStr.toCharArray();

        int asc = Asc(numArr);
        int desc = Desc(numArr);

        return desc - asc;
    }
    private static int Asc(char[] numArr) {
        for (int i = 0; i < numArr.length; i++) {
            for (int j = i + 1; j < numArr.length; j++) {
                if(numArr[i] > numArr[j]){
                    char temp = numArr[i];
                    numArr[i] = numArr[j];
                    numArr[j] = temp;
                }
            }
        }
        return Integer.parseInt(new String(numArr));
    }

    private static int Desc(char[] numArr) {
        for (int i = 0; i < numArr.length; i++) {
            for (int j = i + 1; j < numArr.length; j++) {
                if (numArr[i] < numArr[j]) {
                    char temp = numArr[i];
                    numArr[i] = numArr[j];
                    numArr[j] = temp;
                }
            }
        }
        return Integer.parseInt(new String(numArr));
    }
}
