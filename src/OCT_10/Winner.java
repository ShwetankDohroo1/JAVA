package OCT_10;

import java.util.*;

public class Winner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++){
            arr[i] = in.nextInt();
        }
        if(solve(arr)){
            System.out.println("A");
        }
        else if(!solve(arr)){
            System.out.println("B");
        }
    }
    public static Boolean solve(int[] arr){
        ArrayList<Pair> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            Pair p = new Pair(arr[i],Sum(arr[i]));
            list.add(p);
        }
        Collections.sort(list , (c, d) ->{
            if( d.digitSum != c.digitSum){
                return d.digitSum - c.digitSum;
            }
            else{
                return d.num - c.num;
            }
        });
        int asum = 0;
        int bsum = 0;
        for(int i=0;i<list.size();i++){
            if(i%2==0){
                asum += list.get(i).num;
            }
            else{
                bsum += list.get(i).num;
            }
        }
        return Sum(asum) > Sum(bsum);
    }
    public static int Sum(int a){
        int sum = 0;
        while(a>0){
            sum+=a%10;
            a/=10;
        }
        return sum;
    }
}
class Pair{
    int num;
    int digitSum;
    Pair(int a, int b){
        this.num = a;
        this.digitSum = b;
    }
}
