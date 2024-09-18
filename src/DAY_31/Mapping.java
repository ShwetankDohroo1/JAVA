package DAY_31;
import java.util.*;
public class Mapping {
    public static void main(String[] args) {
        String str = "aquicbrownfoxjumpoverthelazydog";
        Map<Character,Integer> mp = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(mp.containsKey(ch)){
                int fr = mp.get(ch);
                fr+=1;
                mp.put(ch,fr);
            }
            else{
                mp.put(ch,1);
            }

        }
        System.out.println(mp);
    }
}
