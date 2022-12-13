import java.util.Scanner;
import java.io.*;

public class DNAProfile{

   public static void main(String[] args){
   
      String dna = "";
      try(FileReader read = new FileReader(args[0]); Scanner sc = new Scanner(read)){
         while(sc.hasNextLine()){
            dna += sc.nextLine();
         }
         System.out.println("DNA: " + dna);
      }
      catch(IOException e){
         System.out.println("Error...");
      }
      
      int cnt = Agat(dna);
      System.out.println("COUNTER: "+cnt);
      
      
   
   }
   
   public static int Agat(String str){
      Scanner sc = new Scanner(str);
      String toComp = "AGAT";
      System.out.println("CIAOOO");
      int n = (str.length() - toComp.length()) + 1;
      System.out.println("CIAOOO");
      String sub = "";
      int start = 0;
      int end = 4;
      int counter = 0;
      int check = 0;
      int max = 0;
      
      
      for(int i = 0; i < n; i++){
         if(end > str.length()){
            sub = str.substring(str.length()-4);
            System.out.println("END MAGGIORE: "+sub);
         }
         else{
            sub = str.substring(start,end);
         }
         
         if(sub.equals(toComp) == true){
            check++;
            if(check > max){
               max = check;
            }
         }
         else{
            check = 0;
         }
         //if(check == 5) counter++;
         
         System.out.println("SUB: "+sub);
         System.out.println("MAX: "+max);
         start++;
         end ++;
      }
      
      return max;
   }

}
