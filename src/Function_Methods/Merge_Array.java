package Function_Methods;

import java.util.Scanner;
public class Merge_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n1 = sc.nextInt();
        int [] arr1 = new int[n1];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i< n1; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of the array");
        int n2 = sc.nextInt();
        int [] arr2 = new int[n1];
        System.out.println("Enter the lements of the array");
        for(int i = 0; i< n1; i++){
            arr2[i] = sc.nextInt();
        }

        int [] merged = new int[n1+n1];

        for(int i =0; i< n1; i++){
            merged[i] = arr1[i];
        }

        for(int i =0; i< n2; i++){
            merged[i] = arr2[i];
        }

        System.out.println("merged array:");
        for(int i = 0; i< merged.length;i++){
            System.out.println(merged[i] + " ");
        }
    }
}
