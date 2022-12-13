import java.util.Scanner;
public class SquareTester{

   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n;
      int[] details = new int[6];
      int[] details2 = new int[4];
      int q = 0;
   
      //Riceve da standard input due triple di numeri interi (una tripla per riga), rappresentanti le coordinate (x,y) del centro e la dimensione di ciascuno dei due quadrati.
      for(int i = 0; i < 2; i++){
         System.out.println("Inserire una tripla");
         for(int j = 0; j < 3; j++){
            details[q] = sc.nextInt();
            q++;
         }
         System.out.println();  
      }
      
      //Crea due oggetti di tipo Square usando tali valori, e stampa gli oggetti a standard output in ordine di area (il primo oggetto stampato e` quello di area più piccola).
      Square sq1 = new Square(details[0], details[1], details[2]);
      Square sq2 = new Square(details[3], details[4], details[5]);
      
      int area1 = sq1.getArea(details[2], details[2]);
      int area2 = sq2.getArea(details[5], details[5]);
      compareArea(area1, area2);
      
      //Riceve da standard input due coppie di numeri interi (una coppia per riga), rappresentanti i nuovi valori (width,height) di larghezza e altezza per ciascuno dei due quadrati.
      q = 0;
      for(int i = 0; i < 2; i++){
         System.out.println("Inserire una coppia di numeri");
         for(int j = 0; j < 2; j++){
            details2[q] = sc.nextInt();
            q++;
         }
         System.out.println();  
      }
      
      sq1.setSize(details2[0], details2[1]);
      sq2.setSize(details2[2], details2[3]);
      area1 = sq1.getArea(details2[0], details2[1]);
      area2 = sq2.getArea(details2[2], details2[3]);
      
      compareArea(area1, area2);
   
   }
   
   
   public static void compareArea(int a1, int a2){
      if(a1 < a2){
         System.out.println(a1);
         System.out.println(a2);
      }
      else{
         System.out.println(a2);
         System.out.println(a1);
      }
   }

   
   
}
