package Logic_Building;

import java.util.Scanner;
public class ReversesNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int reversed = 0;
        int temp = Math.abs(num);

        while(temp >0){
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp = temp/10;
        }
        if(num<0){
            reversed = - reversed;
        }
        System.out.println("Reversed number: "+ reversed);
    }
}
