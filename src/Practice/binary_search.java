package Practice;

import java.util.Scanner;
public class binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array");
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//        System.out.println("Enter the elements in the array");
//        for(int i = 0; i< n; i++){
//            arr[i] = sc.nextInt();
//        }
        int [] arr = {10, 20, 30, 40, 50, 60};
        System.out.println("Enter no to be searched");
        int target = sc.nextInt();
        int low=0, high = arr.length-1;
        boolean found = false;
        while(low <= high){
            int mid = (low + high)/2;
            if (arr[mid]==target){
                System.out.println("Element found at index "+ mid);
                found = true;
                break;
            }
            else if (arr[mid] < target){
                low = mid +1;
            }
            else{
                high = mid -1;
            }
        }
        if(!found){
            System.out.println("element not found");
        }
        sc.close();
    }
}
