import java.util.Scanner;
import java.io.*;
public class Leggi2{
   public static void main(String[] args){
   
      try(FileReader r = new FileReader("input.txt"); Scanner sc = new Scanner(r)){
         
         while(sc.hasNextLine()){
            Scanner scan = new Scanner(sc.nextLine());
            while(scan.hasNext()){
               System.out.println(scan.next());
            }
         }
      }
      catch(IOException e){
         System.out.println("Error...");
      }
   }


}
