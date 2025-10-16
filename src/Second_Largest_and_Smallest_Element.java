import java.util.Arrays;
import java.util.Scanner;
public class Second_Largest_and_Smallest_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter "+n+" elements: ");
        for(int i =0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Second smallest element: "+arr[1]);
        

    }
}
