package Class;

import java.util.Random;
import java.util.Scanner;

public class Slot_Machine {
    public static void main(String[] args){
        Slot_Machine.play();
    }

    public static String[] SYMBOLS = {"Cherry", "Lemon", "Orange", "Plum", "Bell"};
    public static int SPIN_COST = 10;
    public static int balance = 100;
    public static Random rand;

    public static void spinReels() {
        String[] reels = new String[3];
        for(int i=0;i<reels.length;i++){
            reels[i] = SYMBOLS[rand.nextInt(SYMBOLS.length)];
        }
        displayReels(reels);
        int payout = calculatePayout(reels);
        balance += payout;
        System.out.println("Payout: " + payout + " coins");
    }
    public static void displayReels(String[] reels){
        System.out.println("Reel 1: " + reels[0]);
        System.out.println("Reel 2: " + reels[1]);
        System.out.println("Reel 3: " + reels[2]);
    }
    public static int calculatePayout(String[] reels){
        int payout = 0;
        if(reels[0].equals(reels[1]) && reels[1].equals(reels[2])){
            switch (reels[0]) {
                case"Cherry":
                    payout = 50;
                    break;
                case"Bell":
                    payout = 30;
                    break;
                case"Plum":
                    payout = 20;
                    break;
                case"Orange":
                    payout = 10;
                    break;
                case"Lemon":
                    payout = 5;
                    break;
            }
        }
        else if(reels[0].equals(reels[1]) || reels[1].equals(reels[2]) || reels[0].equals(reels[2])){
            payout = 2;
        }
        return payout;
    }
    public static void play(){
        Scanner scanner = new Scanner(System.in);
        rand = new Random();
        while(balance >= SPIN_COST){
            System.out.println("Current balance: " + balance);
            System.out.println("Do you want to spin? Yes (1) / No (0)");
            int choice = scanner.nextInt();
            if(choice == 1){
                balance -= SPIN_COST;
                spinReels();
            }
            else{
                System.out.println("Thanks for playing!");
                break;
            }
        }
        if(balance < SPIN_COST){
            System.out.println("Insufficient funds. Game over!");
        }
        scanner.close();
    }
}
