package DAY_23;

public class palindorme {
    public static void main(String[] args) {
        String a = "ooyoo";
        boolean ans = checkpalindrome(a);
        System.out.println(ans);
    }
    static boolean checkpalindrome(String a){
        a = a.toLowerCase();
        for(int i=0;i<a.length();i++){
            char start = a.charAt(i);
            char end = a.charAt(a.length()-1 - i);
            if(start != end){
                return false;
            }
        }
        return true;
    }
}
