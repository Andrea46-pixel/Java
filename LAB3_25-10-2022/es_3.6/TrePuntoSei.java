import java.util.Scanner;

public class TrePuntoSei{

   public static void main(String[] args){
   
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Inserire tre parole separate da un carattere di spaziatura");
      String word1 = sc.next();
      String word2 = sc.next();
      String word3 = sc.next();
      
      System.out.println(word1+"\n"+word2+"\n"+word3);
   
   }

}
