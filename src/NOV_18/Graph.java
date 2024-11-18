package NOV_18;

import java.util.*;

public class Graph {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int e = in.nextInt();
        int[][] arr = new int[e][2];
        for(int i = 0; i < e; i++){
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph = CreateGraph(n,e,arr);
        System.out.println(graph);
    }
    static Map<Integer, List<Integer>> CreateGraph(int n, int e, int[][] arr){
        Map<Integer, List<Integer>> mp = new HashMap<>();
        for(int i=0;i<e;i++){
            int a = arr[i][0], b = arr[i][1];
            if(mp.containsKey(a)){
                mp.get(a).add(b);

                //remove below when directed graph
                if(mp.containsKey(b)){
                    mp.get(b).add(a);
                }
                else{
                    List<Integer> temp = new ArrayList<>();
                    temp.add(a);
                    mp.put(b,temp);
                }
            }
            else{
                List<Integer> temp = new ArrayList<>();
                temp.add(b);
                mp.put(a,temp);

                //remove below when directed graph
                if(mp.containsKey(b)){
                    mp.get(b).add(a);
                }
                else{
                    List<Integer> temp1 = new ArrayList<>();
                    temp1.add(a);
                    mp.put(b,temp1);
                }
            }
        }
        return mp;
    }
}
