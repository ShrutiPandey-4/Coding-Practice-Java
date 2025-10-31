package Function_Methods;

public class MaxMinDiff {
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 5};
        int max = arr[0], min = arr[0];

        for (int n : arr) {
            if (n > max) max = n;
            if (n < min) min = n;
        }

        System.out.println("Difference = " + (max - min));
    }
}
