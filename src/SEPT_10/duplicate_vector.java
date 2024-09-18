package SEPT_10;

import java.util.*;

public class duplicate_vector {
    public static void main(String[] args) {
        Vector<Integer> vct = new Vector<>();
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for(int i=0;i<a;i++){
            int b = in.nextInt();
            vct.add(b);
        }
        LinkedHashSet<Integer> st = new LinkedHashSet<>(vct);
        vct = new Vector<>(st);
        for(Integer i:vct){
            System.out.println(i + " ");
        }
    }
}
