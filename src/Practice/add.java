package Practice;

import java.util.Scanner;
public class add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        int mul = a*b;
        int sub = a-b;
        int div = a/b;
        System.out.println("Sum"+sum);
        System.out.println("Sum"+mul);
        System.out.println("Sum"+sub);
        System.out.println("Sum"+div);
    }

    public static class fahrenheit_to_celcius {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    //        double C = sc.nextDouble();
    //        double F = (C*9/5)+32;
    //        System.out.println("Temp of F="+F);
    //        int P = sc.nextInt();
    //        int R = sc.nextInt();
    //        int T = sc.nextInt();
    //        int SI = (P*R*T)/100;
    //        System.out.println("SI"+SI);
            System.out.print("Enter N: ");
            int N = sc.nextInt();

            int sum = N * (N + 1) * (2 * N + 1) / 6;

            System.out.println("Sum of squares of first " + N + " natural numbers = " + sum);
        }
    }
}
