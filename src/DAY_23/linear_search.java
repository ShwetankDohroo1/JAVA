package DAY_23;

public class linear_search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int a = 9;
        System.out.println(search(arr,a));
    }
    static int search(int[] arr ,int a){
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == a){
                index = i;
                return index;
            }
        }
        return -1;
    }
}
