package SEPT_16;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locksystem {
    private Lock lock = new ReentrantLock();
    private int balance = 100;

    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if(balance >= amount){
                    try{
                        System.out.println(Thread.currentThread().getName() + " proceeding to withdraw " + amount);
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println();
                        System.out.println(Thread.currentThread().getName() + " withdraw successful of " + amount);
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    }finally {
                        lock.unlock();
                    }
                }
                else{
                    System.out.println(Thread.currentThread().getName() + " not that much money ");
                }
            }
            else{
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock, try again later ");
            }
        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
