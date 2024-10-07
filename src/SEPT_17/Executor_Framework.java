package SEPT_17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor_Framework {
    public static void main(String[] args) {
        Long starTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(9);
        for (int i = 0; i < 100; i++) {
            int finalI = i;
            executor.submit(()->{
                long ans = factorial(finalI);
                System.out.println("Factorial of " + finalI+ " is:- " + ans);
            });
        }
        executor.shutdown();
    }
    public static long factorial(int n){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
