import java.util.Scanner;

public class Saluto{

   public static void main(String[] args){
   
      Scanner sc = new Scanner(System.in);
      System.out.println("Inserisci il tuo nome");
      String name = sc.nextLine();
      
      System.out.println("Hello, "+name);
      
   
   }

}
