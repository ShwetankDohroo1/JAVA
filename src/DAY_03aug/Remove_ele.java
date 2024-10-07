package DAY_03aug;
//given 2 arrays,find minimum number of elements to be remove from both arrays such that there should be no common elements
import java.util.*;
public class Remove_ele {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int[] arr1 = new int[a];
        int[] arr2 = new int[b];
        for (int i = 0; i < a; i++) {
            arr1[i] = in.nextInt();
        }
        for (int i = 0; i < b; i++) {
            arr2[i] = in.nextInt();
        }
        System.out.println(findmin(arr1,arr2));
    }
    public static int findmin(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i : array1) {
            set1.add(i);
        }
        for (int i : array2) {
            set2.add(i);
        }

        Set<Integer> commoneles = new HashSet<>(set1);
        commoneles.retainAll(set2);
        return commoneles.size();
    }
}
