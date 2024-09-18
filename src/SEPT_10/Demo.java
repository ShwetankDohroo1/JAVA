package SEPT_10;

import java.util.Arrays;
import java.util.Comparator;

public class Demo {
    public static void main(String[] args) {
        Integer[] arr = {-144,25,-49,36,52};
        Comparator<Integer> sqrtroot = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int a = (int) Math.sqrt(Math.abs(o1));
                int b = (int) Math.sqrt(Math.abs(o2));
                return Integer.compare(a,b);
            }
        };
        Arrays.sort(arr,sqrtroot);
        System.out.println(Arrays.toString(arr));
    }
}
