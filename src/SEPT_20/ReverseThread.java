package SEPT_20;

import java.util.Scanner;

class ReverseGreet extends Thread {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        createThread(n);
    }

    public static void createThread(int num) {
        if (num > 0) {
            Thread nextThread = new Thread(() -> createThread(num - 1));
            System.out.println("CodeQuotient Thread" + num);
            nextThread.start();
            try {
                nextThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
