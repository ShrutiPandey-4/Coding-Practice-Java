import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        int n = sc.nextInt();
        int original = n;
        int reversed = 0;
        while(n>0){
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        if(original == reversed){
            System.out.println(original + "yes");
        }else{
            System.out.println(original + "not");
        }
    }
}
