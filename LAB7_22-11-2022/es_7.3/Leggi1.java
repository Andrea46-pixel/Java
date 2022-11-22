import java.util.Scanner;
import java.io.*;
public class Leggi1{

   public static void main(String[] args){
   
      try(FileReader r = new FileReader("input.txt"); Scanner sc = new Scanner(r)){
         while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
         }
      }
      catch(IOException e){
         System.out.println("Error...");
      }
   
   }

}
