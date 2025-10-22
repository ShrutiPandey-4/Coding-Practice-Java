package Logic_Building;

import java.util.Scanner;
public class Factorial_Using_Recursion {
    static long factorial(int n){
        if(n == 0 || n == 1)
            return 1;
        else
            return n*factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = sc.nextInt();
        System.out.println("Fact of "+n+ "="+factorial(n));
    }
}
