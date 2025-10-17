import java.util.Scanner;
public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no");
        int num = sc.nextInt();

//        if(num % 2 == 0){
//            System.out.println(num + "even");
//        }else {
//            System.out.println(num + "odd");
//        }

        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);
    }
}
