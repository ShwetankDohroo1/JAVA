package AUG22;

import java.util.Scanner;

class Expectionage extends ArithmeticException{
    Expectionage(String msg){
        super(msg);
    }
}

public class problem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            getElibility(in.nextInt());
        }
        catch(Expectionage e){
            System.out.println(e.getMessage());
        }
    }
    static void getElibility(int age){
        if(age < 18){
            throw new ArithmeticException("\nInvalid Age");
        }
        else{
            System.out.println("You are eligible");
        }
    }
}
