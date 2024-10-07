package SPET_04;

import java.util.Scanner;

public class PasswordValidator {
    public static void passwordvalidator(String password) throws PasswordTooShortException {
        if(password.length() < 8){
            throw new PasswordTooShortException("Password is too short! Must be at least 8 characters long.");
        }
        if(!password.matches(".*[A-Z].*")){
            throw new PasswordTooShortException("Password must contain atleast 1 UpperCase Character");
        }
        if(!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")){
            throw new PasswordTooShortException("Password must contain atleast 1 Speacial Character");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String password = in.nextLine();

        try{
            passwordvalidator(password);
            System.out.println("Password is valid.");
        }
        catch(PasswordTooShortException e){
            System.out.println(e.getMessage());
        }
    }
}
