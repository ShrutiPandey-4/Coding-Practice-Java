package Logic_Building;

public class EvenNum1to50 {
    public static void main(String[] args) {
      int  n = 50;
//      for(int i =1; i<=n; i++){
          for(int i =2; i<=n; i+=2){
          if(i % 2 == 0){
              System.out.println(i);
          }
      }
    }
}
