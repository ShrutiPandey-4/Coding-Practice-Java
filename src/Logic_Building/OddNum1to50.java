package Logic_Building;

public class OddNum1to50 {
    public static void main(String[] args) {
        int n = 50;
        System.out.println("Odd numbers between 1 to 50");

//        for(int i =1; i<=n; i++){
        for (int i = 1; i <= n; i += 2) {
            if (i % 2 != 0) {
                System.out.println(i);

            }
        }
    }
}
