package NOV_18;
import java.util.*;
public class Wgraph {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int e = in.nextInt();
        int[][] arr = new int[e][3];
        for(int i = 0; i < e; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            arr[i][0] = a;
            arr[i][1] = b;
            arr[i][2] = c;
        }
        Map<Integer, List<pair>> graph = new HashMap<>();
        for(int i = 0; i < e; i++){
            making(graph, arr[i][0], arr[i][1], arr[i][2]);
        }
        printGraph(graph);
    }
    public static void making(Map<Integer, List<pair>> graph, int source, int node, int weight) {
        //Add the edge from source to destination
        graph.putIfAbsent(source, new ArrayList<>());
        graph.get(source).add(new pair(node, weight));
        graph.putIfAbsent(node, new ArrayList<>());
        graph.get(node).add(new pair(source, weight));
    }
    public static void printGraph(Map<Integer, List<pair>> graph) {
        for(int node : graph.keySet()){
            System.out.print(node + " -> ");
            for(pair edge:graph.get(node)){
                System.out.print("(" + edge.node + ", " + edge.weight + ") ");
            }
            System.out.println();
        }
    }
    static class pair {
        int node;
        int weight;

        pair(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }
}
