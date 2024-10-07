package SEPT_16;

public class Main {
    public static void main(String[] args) {
        Locksystem acc = new Locksystem();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                acc.withdraw(20);
            }
        };
        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        t1.start();
        t2.start();
    }
}
