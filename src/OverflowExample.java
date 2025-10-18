public class OverflowExample {
    public static void main(String[] args) {
        byte b = 127;  // maximum value of byte
        b++;           // causes overflow

        System.out.println("Value after overflow: " + b);
    }
}
