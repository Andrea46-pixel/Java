import java.util.Scanner;

public class TrePuntoNove{

   public static void main(String[] args){
   
      //riceva in ingresso una stringa rappresentante un aggettivo qualificativo maschile o femminile (terminante con il carattere 'o' o con il carattere 'a')
      Scanner sc = new Scanner(System.in);
      System.out.println("Inserisci un aggettivo qualificativo maschile o femminile");
      String str = sc.nextLine();
      System.out.println("Aggettivo inserito: "+str);
      
      //stampi a standard output l'aggettivo inserito, con solo il primo carattere maiuscolo
      int length = str.length();
      String firstUpper = (str.substring(0,1).toUpperCase())+(str.substring(1,length));
      System.out.println("Con iniziale maiuscola: "+firstUpper);
      
      
      String noLast = firstUpper.substring(0,length-1);
      String dimMas = noLast+"ino";
      String dimFem = noLast+"ina";
      System.out.println("Forma diminutiva maschile: "+dimMas);
      System.out.println("Forma diminutiva femminile: "+dimFem);
      
      String supAssMas = noLast+"issimo";
      String supAssFem = noLast+"issima";
      System.out.println("Superlativo assoluto maschile: "+supAssMas);
      System.out.println("Superlativo assoluto femminile: "+supAssFem);
      
      
   
   }

}
