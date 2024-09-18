package AUG_6;
//swap the first and last character of every word if any special character or punctuation, replace it with space and then swap of every word.
import java.util.Scanner;

public class swap_character {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(Swapping(str));
    }
    public static String Swapping(String str){
        str = str.replaceAll("[^a-zA-Z0-9\\s]", " ");
        String[] words = str.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if(word.length() > 1){
                words[i] = word.charAt(word.length() - 1) + word.substring(1, word.length() - 1) + word.charAt(0);
            }
        }
        return String.join(" ", words);
    }
}
