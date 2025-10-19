package Function_Methods;

import java.util.Scanner;
public class Sum2 {
    public static void main(String[] args) {
        int ans= sum2();
        System.out.println(ans);
    }
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;
    }
}
