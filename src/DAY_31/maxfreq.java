package DAY_31;

import java.util.HashMap;
import java.util.Map;

public class maxfreq {
    public static void main(String[] args) {
        String[] str = {"abc","bcd","abc","def","def","kjh","abc","abc"};
        Map<String,Integer> mp = new HashMap<>();
        for(String s:str){
            if(mp.containsKey(s)){
                mp.put(s, mp.get(s) + 1);
            }
            else{
                mp.put(s, 1);
            }
        }
        String maxstr = "";
        int maxi = 0;
        for(Map.Entry<String, Integer> i:mp.entrySet()){
            if(i.getValue() > maxi){
                maxi = i.getValue();
                maxstr = i.getKey();
            }
        }
        System.out.println("String with maximum frequency: " + maxstr);
        System.out.println("Frequency: " + maxi);
    }
}
