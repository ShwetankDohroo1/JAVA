package AUG22;

public class boxdemo {
    public static void main(String[] args) {
        box b1 = new box(2,3,4);
        box b2 = new box(4,5,1);
        if(b1.compareTo(b2) == 1){
            System.out.println("b1 is greater");
        }
        else if(b1.compareTo(b2) == -1){
            System.out.println("b2 is greater");
        }
        else{
            System.out.println("Both are same");
        }
    }
}