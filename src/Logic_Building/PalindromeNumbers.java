package Logic_Building;

import java.util.Scanner;
public class PalindromeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = Math.abs(num);
        int reversed =0;
        int original = temp;

        while(temp >0){
            int digit = temp % 10;
            reversed = reversed *10 +digit;
            temp = temp / 10;
        }
        if(reversed == original){
            System.out.println(num +" is a Palindrome");
        }else{
            System.out.println(num +" is not a Palindrome");
        }
    }
}
