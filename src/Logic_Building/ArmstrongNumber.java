package Logic_Building;

import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int temp = Math.abs(num);
        int original = temp;
        int sum =0;

        int digits =0;
        int t = temp;
        while(t>0){
            digits++;
            t/=10;
        }
        while(temp >0){
            int digit = temp % 10;
            sum += Math.pow(digit,digit);
            temp/=10;
        }
        if(sum == original)
            System.out.println(num + " is an armstrong number");
        else
            System.out.println(num +" is not armstrong number");
    }
}
