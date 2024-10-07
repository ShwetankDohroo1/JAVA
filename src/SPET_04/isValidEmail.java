package SPET_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class isValidEmail {
    public static Boolean validemail(String email){
        boolean flag = true;

        //check if there is exactly one '@' symbol
        int at = email.indexOf('@');
        if(at == -1 || email.indexOf('@', at + 1) != -1){
            flag = false;
        }

        //check if the first character is a special character
        char firstChar = email.charAt(0);
        if(!((firstChar >= 'A' && firstChar <= 'Z') || (firstChar >= 'a' && firstChar <= 'z') || (firstChar >= '0' && firstChar <= '9'))){
            flag = false;
        }

        //check if there is at least one '.' after the '@' symbol
        int dot = email.indexOf('.', at);
        if(dot == -1){
            flag = false;
        }

        //check if the email contains any spaces
        if(email.contains(" ")){
            flag = false;
        }

        return flag;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String email = in.nextLine();
        if(validemail(email)){
            System.out.println("Email is valid");
        }
        else{
            System.out.println("Email is invalid");
        }
        in.close();
    }
}
