package SEPT_17;

import AUG27.thread;

public class Lambda {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("hello");
        Thread t1 = new thread();
        t1.start();
    }
}
