package SPET02;

import java.util.*;
import java.util.concurrent.Callable;

public class demo implements Callable<Integer> {
    int n;
    demo(int n) {
        this.n = n;
    }

    @Override
    public Integer call() throws Exception {
        System.out.printf(Thread.currentThread().getName());
        n = n * (n+1)/2;
        return n;
    }

    public static void main(String[] args) {
        demo[] arr = new demo[5];
        arr[0] = new demo(20);
        arr[1] = new demo(10);
        arr[2] = new demo(30);
        arr[3] = new demo(40);
        arr[4] = new demo(50);
    }
}
