import java.util.Scanner;
public class EuclideMCD{
  public static void main(String[] args){
  
  int counter = 0;
  int m = 0;
  int n = 0;
  
  Scanner sc = new Scanner(System.in);
  
   do{
    System.out.println("Inserisci il "+(counter+1)+"° numero:");
    int num = sc.nextInt();
    
    if (num <= 0){
      System.out.println("Numero non valido...");
      continue;
    }
    else{
      counter++;
      if(counter == 1){
        m = num;
      }
      else{
        n = num;
        if (m<n){
          System.out.println("Numero non valido. Deve essere < di "+m);
          counter--;
        }
      }
    }
   }while(counter<2);
   
   int j;
   while((m%n) != 0){
     j = m;
    m = n;
    n = j%n;
    if (n==0){
      break;
    }
   }
   System.out.println("MCD: "+n);
  
  }

}
