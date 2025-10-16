import java.util.Scanner;
public class Copy_Array_Elements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int [] source = new int[n];
        int [] destination = new int[n];
        System.out.println("Enter "+n+ " elements for source array");
        for(int i =0; i<n; i++){
            source [i]= sc.nextInt();
            destination [i] = source[i];
        }
        System.out.println("Element of destination array: ");
        for(int i=0; i<n; i++){
            System.out.println(destination[i]+" ");
        }
    }
}
