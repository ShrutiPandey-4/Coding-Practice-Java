package Practice;//import java.util.Scanner;
//public class Practice.Array {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array: ");
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//        System.out.println("Enter" + n + "elements: ");
//        for(int i = 0; i<n ; i++){
//            arr[i]=sc.nextInt();
//        }
//
//    }
//}

//import java.util.Scanner;
//public class Practice.Array{
//    public static void main(String [] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array");
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//        System.out.println("Enter" +n+ "elements:");
//        for(int i = 0; i<n; i++){
//            arr[i]= sc.nextInt();
//        }
//        int sum =0;
//        for(int i =0; i<n ;i++){
//            sum = sum + arr[i];
//        }
//        System.out.println("Sum: "+sum);
//
//    }
//}

//import java.util.Scanner;
//public class Practice.Array {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array:");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        int sum = 0;
//
//        System.out.println("Enter" + n + "elements");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//            sum += arr[i];
//        }
//        double avg = (double) sum / n;
//        System.out.println("Avg of elments: " + avg);
//    }
//}

//import java.util.Scanner;
//public class Practice.Array{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array:");
//        int n= sc.nextInt();
//        int [] arr = new int[n];
//        System.out.println("Enter the elements of the array");
//        for(int i =0; i<n; i++){
//            arr [i] = sc.nextInt();
//        }
//        int largest = arr[0];
//        for(int i =0; i<n; i++){
//            if(arr[i]>largest){
//                largest =arr[i];
//            }
//        }
//        System.out.println("Largest elements: "+ largest);
//    }
//}

//import java.util.Scanner;
//public class Practice.Array{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of array:");
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//
//        System.out.println("Enter" +n+ "elements: ");
//        for(int i =0; i<n ; i++){
//            arr[i] = sc.nextInt();
//        }
//        int smallest = arr[0];
//        for(int i =0; i<n; i++){
//            if(arr [i] < smallest){
//                smallest = arr[i];
//            }
//        }
//        System.out.println("Smallest elements: "+ smallest);
//    }
//}

//import java.util.Scanner;
//public class Practice.Array{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array:");
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//        int evenCounter=0;
//        int oddCounter=0;
//
//        System.out.println("Enter"+n+"elements:");
//        for(int i =0; i<n; i++){
//            arr[i] = sc.nextInt();
//
//            if(arr[i] % 2 == 0){
//                evenCounter++;
//            }else{
//                oddCounter++;
//            }
//        }
//        System.out.println("NO of even elements:" + evenCounter);
//        System.out.println("NO of odd elements:" + oddCounter);
//    }
//}

//import java.util.Scanner;
//public class Practice.Array{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array:");
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//
//        System.out.println("Enter"+n+"elements:");
//        for(int i =0; i <n; i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Enter the element to search:");
//        int key = sc.nextInt();
//
//        boolean found = false;
//        for(int i =0; i<n; i++){
//            if(arr[i] == key) {
//                System.out.println("Element found at index" + i);
//                found = true;
//                break;
//            }
//        }
//        if(!found){
//            System.out.println("Element not found in the array.");
//        }
//    }
//}

import java.util.Scanner;
public class Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int key = sc.nextInt();
        int count =0;

        System.out.println("Enter"+n+"elements: ");
        for(int i =0; i< n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == key){
                count++;
            }
        }
        System.out.println("Freq of "+key+" = "+ count);
    }
}
