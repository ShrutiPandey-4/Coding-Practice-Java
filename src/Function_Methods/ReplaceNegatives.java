package Function_Methods;

import java.util.Scanner;

public class ReplaceNegatives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0)
                arr[i] = 0;
        }

        System.out.println("Array after replacing negatives with 0:");
        for (int num : arr)
            System.out.print(num + " ");
    }
}

