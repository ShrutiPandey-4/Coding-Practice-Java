package Logic_Building;

import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = sc.nextInt();

        int count =0;
        int temp =n;
        if(n == 0) count = 1;
        while(temp != 0){
            temp /= 10;
            count++;
        }
        System.out.println("Num of digit in "+n+" = "+count);
    }
}
