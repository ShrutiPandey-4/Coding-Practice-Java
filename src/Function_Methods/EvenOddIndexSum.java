package Function_Methods;

public class EvenOddIndexSum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int evenSum = 0, oddSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                evenSum += arr[i];
            else
                oddSum += arr[i];
        }

        System.out.println("Sum at even indices: " + evenSum);
        System.out.println("Sum at odd indices: " + oddSum);
    }
}
