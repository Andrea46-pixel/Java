import java.util.*;

public class LinkedListTester{

   public static void main(String[] args){
   
      LinkedList list = new LinkedList();
      Random rand = new Random(123);
      Scanner console = new Scanner(System.in);
      
      System.out.println("Numero di elementi da introdurre nella linked list?");
      int n = console.nextInt();
      
      System.out.println("Inserisco "+n+" elementi nella linked list");
      System.out.println("Il primo verra' inserito all'inizio, il secondo alla fine e cosi' via");
      for(int i=0; i<n; i++){
         int value = rand.nextInt(100);
         System.out.println("Elemento da inserire: "+value);
         if(i%2==0){
            list.addFirst(value);         
         }
         else{
            list.addLast(value); 
         }
        
         System.out.println("Iterazione "+i+" : "+list);        
      }
      
      System.out.println("Elemento dopo cui inserire il numero 1000?");
      n = console.nextInt();
     
      ListIterator iter = list.getIterator();
      while(iter.hasNext()){
         if(iter.next().equals(n)){
            iter.add(1000);
         }
      }
      System.out.println(list); 
      
      System.out.println("Elemento da rimuovere");
      n = console.nextInt();
      iter = list.getIterator();
      while(iter.hasNext()){
         if(iter.next().equals(n)){
            iter.remove();
         }
      }
      System.out.println(list); 
      
      System.out.println("Rimuovo il primo nodo");
      list.removeFirst();
      System.out.println(list);
      
      System.out.println("Rimuovo l'ultimo nodo");
      list.removeLast();
      System.out.println(list);
      
      console.close();
   
   }


}
