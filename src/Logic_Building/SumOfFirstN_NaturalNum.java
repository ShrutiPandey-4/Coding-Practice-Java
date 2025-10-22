package Logic_Building;

import java.util.Scanner;
public class SumOfFirstN_NaturalNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum =0;
        int n = in.nextInt();
        for(int i =1; i<=n;i++){
            sum = sum + i;
        }
        System.out.println("Sum: "+ sum);
    }
}
