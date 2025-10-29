package Practice;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1};
        Arrays.sort(arr);

        System.out.println("Sorted Array:");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
