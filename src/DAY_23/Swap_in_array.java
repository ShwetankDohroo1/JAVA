package DAY_23;

public class Swap_in_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        swap(arr,1,3);
    }
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
