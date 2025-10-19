package Practice;

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0); // take first character input

        int ascii = (int) ch; // typecast char to int

        System.out.println("ASCII value of '" + ch + "' is: " + ascii);
    }
}

