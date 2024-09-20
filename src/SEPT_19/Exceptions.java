package SEPT_19;

public class Exceptions {
    public static void main(String[] args) {
        int[] num = {100,200,300,400};
        int[] den = {4,3,2,1};
        for(int i=0;i<num.length +1 ;i++){
            try{
                System.out.println(divide(num[i],den[i]));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    public static int divide(int a, int b){
        try {
            return a / b;
        }catch(Exception e){
            System.out.println(e);
            return -1;
        }
    }
}
