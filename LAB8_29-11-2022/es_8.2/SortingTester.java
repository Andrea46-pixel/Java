import java.util.Random;
public class SortingTester{

   public static void main(String[] args){
   
      //costruisca un array A di numeri interi random da 1 a 100 di lunghezza n
      int dim = Integer.parseInt(args[0]);
      int[] arr = new int[dim];
      Random rn = new Random();
      
      for(int i = 0; i < dim; i++){
         arr[i] = (rn.nextInt(100))+1;
      }
      
      //testi ciascuno degli algoritmi visti (selectionsort, mergesort, insertionsort) su tale sequenza e se n<=20 verifichi che l'ordinamento sia corretto stampando in uscita l'array originale e i tre array ordinati
      
      //SELECTION SORT
      System.out.println("----------SELECTION SORT------------");
      int[] arr1 = new int[dim];
      System.arraycopy(arr, 0, arr1, 0, dim);
      
      if(dim <= 20){
         for(int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
         } 
         //riordino l'array
         ArrayAlgs.selectionSort(arr1);
         System.out.println("#################");
         for(int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
         }    
      }
      else ArrayAlgs.selectionSort(arr1);
      
      
      
      
      //MERGE SORT
      System.out.println("----------MERGE SORT------------");
      int[] arr2 = new int[dim];
      System.arraycopy(arr, 0, arr2, 0, dim);
      
      if(dim <= 20){
         for(int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
         } 
         //riordino l'array
         ArrayAlgs.mergeSort(arr2);
         System.out.println("#################");
         for(int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
         }    
      }
      else ArrayAlgs.mergeSort(arr2);
      
      
      //INSERTION SORT
      System.out.println("----------INSERT SORT------------");
      int[] arr3 = new int[dim];
      System.arraycopy(arr, 0, arr3, 0, dim);
      
      if(dim <= 20){
         for(int i = 0; i < arr3.length; i++){
            System.out.println(arr3[i]);
         } 
         //riordino l'array
         ArrayAlgs.insertSort(arr3);
         System.out.println("#################");
         for(int i = 0; i < arr3.length; i++){
            System.out.println(arr3[i]);
         }    
      }
      else ArrayAlgs.insertSort(arr3);
   }

}
