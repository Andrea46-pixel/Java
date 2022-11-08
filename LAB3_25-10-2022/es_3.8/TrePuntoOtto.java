import java.util.Scanner;
import java.util.Locale;

public class TrePuntoOtto{

   public static void main(String[] args){
   
      Scanner sc = new Scanner(System.in);
      sc.useLocale(Locale.US);
      System.out.println("Inserisci tre numeri a virgola mobile usando il punto");
      
      Double num1 = sc.nextDouble();
      Double num2 = sc.nextDouble();
      Double num3 = sc.nextDouble();
      
      double sum = num1+num2+num3;
      
      System.out.println(num1+"+"+num2+"+"+num3+"="+sum);
   
   }

}
