import java.util.Scanner;
public class Second_Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");

        int n = sc.nextInt();

        if(n<2){
            System.out.println("Array altest must have 2 elements");
            return;
        }

        int[] arr = new int[n];
        System.out.println("number" +n+ "Elements:");
        for(int i =0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            }else if(num > secondLargest && num != largest){
                secondLargest = num;
            }
        }
        if(secondLargest == Integer.MIN_VALUE){
            System.out.println("all elements are equal");
        }else{
            System.out.println("2nd largest element" + secondLargest);
        }
    }
}
