public class swap_commandline {
    public static void main(String[] args) {
        if (args.length<2){
            System.out.println("Give command line");
            return;
        }
        int a= Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);

        System.out.println("Before Swap: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}
