public class MathFunctions {
    public static void main(String[] args) {
        double base = 3;
        double exponent = 4;
        double power = Math.pow(base, exponent); // 3^4 = 81

        double number = 25;
        double root = Math.sqrt(number); // √25 = 5

        System.out.println(base + " raised to the power " + exponent + " = " + power);
        System.out.println("Square root of " + number + " = " + root);
    }
}
