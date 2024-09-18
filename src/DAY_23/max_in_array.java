package DAY_23;

public class max_in_array {
    public static void main(String[] args) {
        int[] arr = {1,23,44,9,0,-1};
        System.out.println(maxVal(arr));
    }
    static int maxVal(int[] arr){
        int maxi = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxi){
                maxi = arr[i];
            }
        }
        return maxi;
    }
}
