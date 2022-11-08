import java.util.Scanner;

public class StandardDeviation{
  public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);
    double standardDeviation = 0;
    int counter = 0;
    double sum = 0;
    double sumSquares = 0;
    
    System.out.println("Inserisci un numero");
    do{
      double num = sc.nextDouble();
      counter++;
      sum += num;
      sumSquares += num*num;
      
      //if (counter <1){
      //  System.out.println("Insert more numbers...");
      //}
      if (counter == 1){
        System.out.println("Standard deviation: 0");
      }
      else{
        standardDeviation = Math.sqrt((sumSquares - sum*sum/counter)/(counter-1));
        System.out.println("Standard deviation: " + standardDeviation);
      }
      System.out.println("Inserisci un numero");
    }while(sc.hasNextDouble());    
    
    sc.close();
  
  }

}
