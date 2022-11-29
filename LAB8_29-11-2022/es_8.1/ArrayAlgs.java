public class ArrayAlgs{

   //METODO SELCTION SORT
   public static void selectionSort(int[] a){
   
      if(a==null){
         return;
      }
   
      
      for(int i=0; i<a.length-1; i++){
         
         //cerco il valore minimo contenuto nelle celle tra i fino all'ultima, e ne copio l'indice nella variabile min
         int min=i;
         for(int j=i+1; j<a.length; j++){
         
            if(a[j]<a[min]){
               min = j;
            }
         }
         
         //nel caso l'indice non corrisponda a quello di partenza viene fatto lo switch
         if(min != i){
            int help = a[i];
            a[i] = a[min];
            a[min] = help;
         }
         
      }
   }
   
   
   //METODO PER FUSIONE (MERGE SORT)
   public static void mergeSort(int[] a){
      
      if(a == null) return;
      if(a.length < 2) return;
      
      int half = a.length/2;
      int[] p1 = new int[half];
      int[] p2 = new int[a.length-half];
      
      System.arraycopy(a, 0, p1, 0, p1.length);
      System.arraycopy(a, half, p2, 0, p2.length);
      
      mergeSort(p1);
      mergeSort(p2);
      
      //fusione
      merge(a, p1, p2);
      
   }
   
   private static void merge(int[] a, int[] b, int[] c){
   
      int ia = 0, ib = 0, ic = 0;
      while(ib < b.length && ic < c.length){
         if(b[ib] < c[ic]){
            a[ia++] = b[ib++];
         }
         else{
            a[ia++] = c[ic++];
         }
      }
      
      while(ib < b.length){
         a[ia++] = b[ib++];
      }
      while(ic < c.length){
         a[ia++] = c[ic++];
      }
   }
   
   
   //METODO INSERT SORT
   public static void insertSort(int[] a){
      for(int i = 1; i<a.length; i++){
         for(int j = i-1; j >= 0; j--){
            if(a[j] > a[j+1]){
               int help = a[j+1];
               a[j+1] = a[j];
               a[j] = help;
            }
            else break;
         }
      
      }
   }
   
   
}
