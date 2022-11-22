import java.util.*;
public class ContaInteri{

   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int counter = 0;
      int n;
      
      System.out.println("Inserisci dei numeri");
      
      while (sc.hasNext()){
         try{
            n = sc.nextInt();
            counter++;
            //System.out.println(n);
         }
         catch (InputMismatchException e){
            sc.next();
         }
      }
      System.out.println("Interi: "+counter);
   }

}
