import java.util.Scanner;
public class Sum_natutal_no_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i++) {
//            sum += i;
            sum += i*i;
        }
        System.out.println("sum"+ sum);
    }
}
