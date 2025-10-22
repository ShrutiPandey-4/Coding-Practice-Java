package Logic_Building;

import java.util.Scanner;
public class Square_And_Cube_Of_a_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = sc.nextInt();
        int square = n*n;
        int cube = n*n*n;
        System.out.println("Square "+n+"="+ square);
        System.out.println("Cube "+n+"="+ cube);
    }
}
