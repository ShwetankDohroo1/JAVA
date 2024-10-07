package SEPT_10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapItrrator {
    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>(){{
            put("abc",5);
            put("drf",2);
            put("shw",3);
            put("efg",1);
        }};

        Iterator<Map.Entry<String, Integer>> it = mp.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, Integer> temp = it.next();
            System.out.println(temp.getKey() + " " + temp.getValue());
        }
    }
}
//find freq of all characters in a string and print all characters based on there freqs in asc order.
