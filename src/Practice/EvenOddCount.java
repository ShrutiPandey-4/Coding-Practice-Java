package Practice;

public class EvenOddCount {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 7, 8};
        int even = 0, odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}
