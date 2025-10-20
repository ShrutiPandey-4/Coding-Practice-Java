package Practice;

import java.util.Scanner;
public class largest_2_no {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();

//        if(a>b){
//            System.out.println("Largest no ="+a);
//        } else if(b>a){
//            System.out.println("Largest"+ b);
//        }else{
//            System.out.println("both equal");
//        }

        int n = sc.nextInt();
        int largest = Integer.MIN_VALUE;
        System.out.println("NUmber"+n);

        for(int i = 0; i<n ; i++){
            int num = sc.nextInt();
            if(num > largest){
                largest = num;
            }
        }
        System.out.println("Largest"+largest);
        sc.close();
    }
}
