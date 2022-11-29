public class ArrayAlgsTester{

   public static void main(String[] args){
   
      
      //SELECTION SORT
      System.out.println("----------SELECTION SORT------------");
      int[] arr1 = {3,7,1,8,2};
      
      for(int i = 0; i < arr1.length; i++){
         System.out.println(arr1[i]);
      } 
      //riordino l'array
      ArrayAlgs.selectionSort(arr1);
      for(int i = 0; i < arr1.length; i++){
         System.out.println(arr1[i]);
      }  
      
      
      
      //MERGE SORT
      System.out.println("----------MERGE SORT------------");
      int[] arr2 = {3,7,1,8,2};
      
      for(int i = 0; i < arr2.length; i++){
         System.out.println(arr2[i]);
      } 
      //riordino l'array
      ArrayAlgs.mergeSort(arr2);
      for(int i = 0; i < arr2.length; i++){
         System.out.println(arr2[i]);
      } 
      
      
      //INSERTION SORT
      System.out.println("----------INSERT SORT------------");
      int[] arr3 = {75,89,35,6,1,9};
      
      for(int i = 0; i < arr3.length; i++){
         System.out.println(arr3[i]);
      } 
      //riordino l'array
      ArrayAlgs.insertSort(arr3);
      for(int i = 0; i < arr3.length; i++){
         System.out.println(arr3[i]);
      }
      
      
   }

}
