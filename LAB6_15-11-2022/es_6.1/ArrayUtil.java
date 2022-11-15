public class ArrayUtil{

   //generazione di un array di interi di numeri casuali (randomIntArray)
   public static int[] randomIntArray(int length, int n){
      int[] arr = new int[length];
      for (int i = 0; i<arr.length; i++){
         arr[i] = (int)(n * Math.random());
      }
      return arr;
   }
   
   //stampare il contenuto di un array (printArray)
   public static String printArray(int[] v, int vSize){
      String s = "";
      
      for (int i = 0; i< vSize; i++){
         s = s + v[i] + " ";
      }
      return s;
   }
   
   //eliminare un elemento (ordine non importante)
   public static void remove(int[] v, int vSize, int index){
      v[index] = v[v.length-1];
      //v = resize(v, v.length -1);
      v = resizeArray(v, v.length-1);
   }
   
   //eliminare un elemento (ordine importante)
   public static void removeSorted(int[] v, int vSize, int index){
      for (int i=index; i<vSize-1; i++){
         v[i] = v[i+1];
      }
      //v = resize(v, v.length -1);
      v = resizeArray(v, v.length-1);
   }
   
   //inserire un elemento
   public static void insert(int[] v, int vSize, int index, int value){
      //v = resize(v, v.length+1);
      for (int i=vSize-1; i>index; i--){
         v[i] = v[i-1];
      }
      v[index] = value;
      
   
   }
   
   //ricerca del minimo
   public static int findMin(int[] v, int vSize){
      int min = v[0];
      for (int i=1; i<vSize; i++){
         if(v[i]<min){
            min = v[i];
         }
      }
      return min;
   
   }
   
   //ricerca del massimo
   public static int findMax(int[] v, int vSize){
      int max = v[0];
      for (int i=1; i<vSize; i++){
         if(v[i]> max){
            max = v[i];
         }
      }
      return max;
   }
   
   //ricerca di un valore in modo sequenziale
   public static int find(int[] v, int vSize, int target){
      int index = -1;
      for (int i=0; i<vSize; i++){
         if(v[i] == target){
            index = i;
            break;
         }
      }
      return index;
   
   }
   
   //ingrandisce un array con la nuova dimensione
   public static int[] resizeArray(int[] v, int newLength){
      int[] arr2 = new int[newLength];
      if(newLength > v.length){
         for (int i=0; i<v.length; i++){
         arr2[i] = v[i];
         }
      }
      else{
         for (int i=0; i<newLength; i++){
         arr2[i] = v[i];
         }
      }
      
      return arr2;
   }

}
