import java.util.Scanner;

public class SomeNumbers{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double sum = 0;
    double absSum = 0;
    double mult = 1;
    double avgValue = 0;
    int counter = 0;
    
    System.out.println("Inserisci un numero");
    do{
      
      double num = sc.nextDouble();
      sum += num;
      absSum = Math.abs(sum);
      mult *= num;
      counter++;
      avgValue = sum/counter;
      
      System.out.println(sum + "\n" + absSum + "\n" +mult + "\n" +avgValue);
      System.out.println("Inserisci un numero");
    }while(sc.hasNextDouble());    
    
    sc.close();
  }

}
