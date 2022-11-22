import java.util.Scanner;
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
            /*for(int i=0; i<word.length();i++){
               if(i==0){
                  word[i] = word[i].toUpperCase();
               }
               else{
                  word[i].toLowerCase();
               }
            }*/
            String first = word.
            out.print(word+" ");
            //body += word + " ";
         }
         
         
      }
      catch(IOException e){
         System.out.println("Error...");
      }
      
   
   }

}
