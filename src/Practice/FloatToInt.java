import java.util.Scanner;

public class FloatToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a floating number: ");
        float num = sc.nextFloat();

        int intValue = (int) num; // Type casting from float to int

        System.out.println("Float value: " + num);
        System.out.println("Integer value after conversion: " + intValue);
    }
}
