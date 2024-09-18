package AUG_6;
//swap the first and last word of a string(sentence) that may include word, spaces, special character or digit.
import java.util.Scanner;
import java.util.regex.Pattern;

public class swap_first_last {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(Swapping(str));
    }

    public static String Swapping(String str) {
        str = str.replaceAll("[^a-zA-Z0-9\\s]", " ");
        String[] words = str.split("\\s+");
        if(words.length < 2){
            return str;
        }
        String temp = words[0];
        words[0] = words[words.length-1];
        words[words.length-1] = temp;
        return String.join(" ", words);
    }
}
