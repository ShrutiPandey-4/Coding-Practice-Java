public class ImplicitCasting {
    public static void main(String[] args) {
        int i = 10;
        float f = i;       // int → float
        double d = f;      // float → double

        System.out.println("int value: " + i);
        System.out.println("After implicit casting to float: " + f);
        System.out.println("After implicit casting to double: " + d);
    }
}

