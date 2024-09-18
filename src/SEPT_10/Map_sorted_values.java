package SEPT_10;

import java.util.*;

//find freq of all characters in a string and print all characters based on there freqs in asc order.
public class Map_sorted_values {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Map<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char a = str.charAt(i);
            mp.put(a,mp.getOrDefault(a,0)+1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(mp.entrySet());
        list.sort(Map.Entry.comparingByValue());

        for(Map.Entry<Character, Integer> entry : list){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
