package Class;

import java.util.Random;
import java.util.Scanner;

public class Guess_game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int points = 100;

        while(points >= 0){
            int random = rand.nextInt(100);
            System.out.println("Enter a number between 0 and 99:");
            int guess = in.nextInt();

            if(guess < 0 || guess > 100){
                System.out.println("Invalid number! Please enter a number between 0 and 100.");
                continue;
            }

            int diff = Math.abs(random - guess);

            if(diff == 0){
                points += 20;
                System.out.println("Correct guess master! Points: " + points);
            }
            else if(diff <= 5){
                points += 10;
                System.out.println("Close guess! The number was " + random + ". Points: " + points);
            }
            else{
                points -= 20;
                System.out.println("Not even close looser. The number was " + random + ". Points: " + points);
            }

            if(points <= 0){
                System.out.println("Game over! You've lost all your points.");
                break;
            }
        }
    }
}
