import java.util.Scanner;
import java.io.*;
public class SettePuntoSei{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Nome file in lettura: ");
      String lettura = sc.nextLine();
      System.out.println("Nome file in scrittura: ");
      String scrittura = sc.nextLine();
      String word;
      String body = "";
      
      try(FileReader r = new FileReader(lettura); PrintWriter out = new PrintWriter(scrittura); Scanner sc1 = new Scanner(r)){
         while(sc1.hasNext()){
            word = sc1.next();
            String first = word.substring(0,1).toUpperCase();
		  String second = word.substring(1,word.length()).toLowerCase();
		  word = first + second;
            out.print(word+" ");
         }
         
         
      }
      catch(IOException e){
         System.out.println("Error...");
      }
      
   
   }

}
