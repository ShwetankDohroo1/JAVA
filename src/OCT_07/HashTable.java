package OCT_07;

import java.util.Arrays;
import java.util.Scanner;

public class HashTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int[] freqarr = new int[26];
        for(char ch:str.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                freqarr[ch - 'a']++;
            }
        }
        System.out.println("Frequency array: " + Arrays.toString(freqarr));
    }
}
