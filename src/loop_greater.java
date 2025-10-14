import java.util.Scanner;
public class loop_greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no for loop");
        int n = 5;
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            int num = sc.nextInt();
            if(num > largest){
                largest = num;
            }
        }
        System.out.println("largest"+largest);
    }
}
