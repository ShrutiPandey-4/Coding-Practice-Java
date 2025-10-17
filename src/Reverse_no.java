import java.util.Scanner;
public class Reverse_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no to be reversed");
        int num = sc.nextInt();
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;


//            int reversed = 0;
//
//            while (num != 0) {
//                int digit = num % 10;     // take last digit
//                reversed = reversed *10 + digit; // build reversed number
////                num /= 10;                // remove last digit
//                num = num / 10;
//            }

            System.out.println("Reversed number = " + reversed);
        }
    }
}


