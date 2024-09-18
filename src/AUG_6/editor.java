package AUG_6;
import java.util.*;
public class editor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(Caps(str));
    }
    public static String Caps(String str){
        StringBuilder res = new StringBuilder(str.length());
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Checkword(ch)){
                if(flag){
                    res.append(Character.toUpperCase(ch));
                    flag = false;
                }
                else if(i > 1 && Character.isDigit(str.charAt(i-1)) && Character.isLetter(ch)){
                    res.append(Character.toUpperCase(ch));
                }
                else{
                    res.append(Character.toLowerCase(ch));
                }
            }
            else{
                res.append(ch);
                flag = !Character.isLetterOrDigit(ch);
            }
        }
        return res.toString();
    }
    public static boolean Checkword(char a){
        return Character.isLetterOrDigit(a);
    }
}