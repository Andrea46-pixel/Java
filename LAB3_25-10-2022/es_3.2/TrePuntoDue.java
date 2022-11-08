import java.util.Scanner;

public class TrePuntoDue{

   public static void main(String[] args){
   
   
      Scanner sc = new Scanner(System.in);
      System.out.println("Si scelga il numero da convertire nell'intervallo chiuso [0, b3-1],   dove b è la base");
      int n = sc.nextInt();
      
      System.out.println("Si scelga la base");
      int b = sc.nextInt();
      
      //int n = 7;
      //int b = 2;
      
      int q1 = n/b;
      int r1 = n%b;
      
      int q2 = q1/b;
      int r2 = q1%b;
      
      int q3 = q2/b;
      int r3 = q2%b;
      
      System.out.println("Il numero "+n+" in base 10 è "+r3+r2+r1+" in base "+b);
      
   
   }

}
