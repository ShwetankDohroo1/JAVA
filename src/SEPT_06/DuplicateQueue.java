package SEPT_06;

import java.util.LinkedList;
import java.util.Queue;

public class DuplicateQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(2);
        q.add(4);
        q.add(3);

        System.out.println("Original Queue: " + q);
        duplicate(q);
        System.out.println("Duplicated Queue: " + q);
    }
    public static void duplicate(Queue<Integer> q){
        int size = q.size();
        for(int i=0;i<size;i++){
            int element = q.remove();
            q.add(element);
            q.add(element);
            System.out.println(q);
        }
    }
}
