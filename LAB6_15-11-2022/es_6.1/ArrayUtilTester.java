import java.util.Scanner;
public class ArrayUtilTester{

   public static void main(String[] args){
      
      Scanner sc = new Scanner(System.in);
      
      int value;
      int index;
      
      System.out.println("Inserisci dimensione e intervallo di variabilita'");
      int length = Integer.parseInt(sc.next());
      int range = Integer.parseInt(sc.next());
      
      int[] arr1;
      arr1 = ArrayUtil.randomIntArray(length, range);
      
      String arrayPrinted;
      arrayPrinted = ArrayUtil.printArray(arr1, length);
      System.out.println(arrayPrinted);
      
      //---------------------------------------------------OK
      //1.
      do{
       System.out.println("Inserisci un valore e una posizione in cui inserirlo");
         value = Integer.parseInt(sc.next());
         index = Integer.parseInt(sc.next());
         if(index>=length || index < 0) System.out.println("Errore. Indice non valido");
      }while(index>=length || index < 0);
      
      //aumento la dimensione dell'array di una cella
      length += 1;
      arr1 = ArrayUtil.resizeArray(arr1, length);
      //inserisco il nuovo valore nell'array ingrandito
      ArrayUtil.insert(arr1, length, index, value);
      arrayPrinted = ArrayUtil.printArray(arr1, length);
      System.out.println(arrayPrinted);
      
      //---------------------------------------------------OK
      //2.
      do{
         System.out.println("Inserisci la posizione di un elemento da eliminare (ordine non    rilevante)");
         index = Integer.parseInt(sc.next());
         if(index>=length || index < 0) System.out.println("Errore. Indice non valido");
      }while(index>=length || index < 0);
      
      //rimuovo l'elemento all'indice 'index'
      ArrayUtil.remove(arr1, length, index);
      //rimpicciolisco l'array
      length -= 1;
      //arr1 = ArrayUtil.resizeArray(arr1, length);
      arrayPrinted = ArrayUtil.printArray(arr1, length);
      System.out.println(arrayPrinted);
      
      //---------------------------------------------------OK
      //3.
      do{
         System.out.println("Inserisci la posizione di un elemento da eliminare (ordine rilevante)");
         index = Integer.parseInt(sc.next());
         if(index>=length || index < 0) System.out.println("Errore. Indice non valido");
      }while(index>=length || index < 0);
      
      //rimuovo l'elemento all'indice 'index'
      ArrayUtil.removeSorted(arr1, length, index);
      //rimpicciolisco l'array
      length -= 1;
      //arr1 = ArrayUtil.resizeArray(arr1, length);
      arrayPrinted = ArrayUtil.printArray(arr1, length);
      System.out.println(arrayPrinted);
      
      //---------------------------------------------------OK
      //4.
      System.out.println("Inserisci un valore da cercare");
      value = Integer.parseInt(sc.next());
      //cerco l'elemento 'value'
      index = ArrayUtil.find(arr1, length, value);
      if (index == -1){
         System.out.println("Il valore: "+value+ " non e' presente nell'array");
      }
      else{
         System.out.println("Il valore: "+value+ " si trova all'indice "+index);
      }
      
      //---------------------------------------------------OK
      //5.
      int min = ArrayUtil.findMin(arr1, length);
      int max = ArrayUtil.findMax(arr1, length);
      System.out.println("Valore massimo: "+max);
      System.out.println("Valore minimo: "+min);
      
   
   }


}
