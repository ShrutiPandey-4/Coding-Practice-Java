import java.util.Scanner;
public class fabonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int first=0, second = 1;
        System.out.println("FS upto" +N+ "terms");
        for(int i = 1; i<= N; i++){
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        sc.close();
    }
}
