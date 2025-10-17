import java.util.Scanner;

public class HoursToSeconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter time in hours: ");
        int hours = sc.nextInt();

        int seconds = hours * 60 * 60;

        System.out.println("Time in seconds: " + seconds);
    }
}

