import java.util.Scanner;
import java.io.*;
public class SettePuntoSei{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Nome file in lettura: ");
      String lettura = sc.nextLine();
      System.out.println("Nome file in scrittura: ");
      String scrittura = sc.nextLine();
      String line;
      String body = "";
      
      try(FileReader r = new FileReader(lettura); PrintWriter out = new PrintWriter(scrittura); Scanner sc1 = new Scanner(r)){
         while(sc1.hasNextLine()){
            line = sc1.nextLine();
            out.println(toInitUpCase(line));
         }
         
         
      }
      catch(IOException e){
         System.out.println("Error...");
      }
      
   
   }


   private static String toInitUpCase(String s){
	String line = "";;
	Scanner sc = new Scanner(s);
	while(sc.hasNext()){
		String word = sc.next();
		String first = word.substring(0,1).toUpperCase();
		if(word.length()>1){
			String second = word.substring(1).toLowerCase();
			line += first+second + " ";
		}
		else line = first+" ";
	}
	
	line = line.substring(0, line.length()-1);

	sc = new Scanner(line);
	sc.useDelimiter("'");
	line="";
	while(sc.hasNext()){
	   String token = sc.next();
        String neword = token.substring(0,1).toUpperCase();
        if (token.length() > 1){
            neword += token.substring(1);
	   }
        line += neword + "'";
		
	}
	line = line.substring(0,line.length()-1);
	return line;
   }
	

}
