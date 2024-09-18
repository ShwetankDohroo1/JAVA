package DAY_26;

import java.util.Scanner;

public class TimeSpan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int seconds = in.nextInt();
        Changer change = new Changer();
        change.converted(seconds);
    }
}
class Changer{
    int hr;
    int min;
    int sec;
    int days;

    public void converted(int seconds){
        if(seconds == 0){
            System.out.println("Dude you dying,byee...");
            return;
        }
        days = seconds / 86400;
        seconds %= 86400;

        hr = seconds / 3600;
        seconds %= 3600;

        min = seconds / 60;
        sec = seconds % 60;
        display(hr,min,sec,days);
    }
    public void display(int hr, int min, int sec, int days){
        System.out.println(days + " days, " + hr + " hours, " + min + " minutes, " + sec + " seconds");
    }

}
