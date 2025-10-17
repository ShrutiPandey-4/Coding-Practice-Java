import java.util.Scanner;
public class Sum_Array_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter" +n+ "terms:");
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int sum =0;
        for(int num : arr){
            sum += num;
        }
        System.out.println("Sum " + sum);

        // Step 4: Calculate average (use double for decimal result)
        double average = (double) sum / n;

        // Step 5: Output
        System.out.println("Average of array elements = " + average);
    }
}
