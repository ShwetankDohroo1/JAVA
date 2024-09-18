package DAY_30;

import java.util.List;

public class wallbreak {
    public static void main(String[] args) {

    }
    public static int wall(List<List<Integer>> wall){
        int l = 0;
        for(Integer i:wall.get(0)){
            l+=i;
        }
        int h = wall.size();
        int[] fr = new int[l];
        for(List<Integer> ls:wall){
            int prefix = 0;
            for (int i = 0; i < ls.size(); i++) {
                prefix+=ls.get(i);
                fr[prefix]++;
            }
        }
        int max = -1;
        for (int i = 0; i < l; i++) {
            max = Math.max(max, fr[i]);
        }
        return h-max;
    }
}
