import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter the elements of the array");
        for(int i =0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be searched");
        int key = sc.nextInt();

        boolean found = false;
        for(int i = 0; i < n; i++){
            if (arr[i] == key){
                System.out.println("Element "+key+" found at index"+i);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("Element " + key + " not found in the array.");
        }
sc.close();
    }
}
