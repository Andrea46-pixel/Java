import java.util.Scanner;
public class ParoleStringa{

   public static void main(String[] args){
   
      Scanner sc = new Scanner(System.in);
      System.out.println("Inserisci una stringa");
      String s = sc.nextLine();
      sc = new Scanner(s);
      while (sc.hasNext()){
         System.out.println(sc.next());
      }
   
   }

}
