package Logic_Building;

public class PrimeNumber_btw1to100 {
    public static void main(String[] args) {
        for(int count = 2;count<=100;count++){

            boolean isPrime=true;
            for(int i =2; i<=Math.sqrt(count);i++){
                if(count % i==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                System.out.println(count);
        }
    }
}
