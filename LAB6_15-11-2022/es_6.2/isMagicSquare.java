import java.util.Scanner;
public class isMagicSquare{
   public static void main(String[] args){
   
      Scanner sc = new Scanner(System.in);
      System.out.println("Inserisci dei numeri");
      
      int length = 0;
      String s = "";
      int[] arr1 = new int[length];
      int index = 0;
      while(sc.hasNextInt()){
         length++;
         index++;
         arr1 = resizeArray(arr1, length);
         arr1[index] = sc.nextInt();
      }
      s= printArray(arr1, length);
      System.out.println(s);
   
   }
   
   //ridimensiona un array
   public static int[] resizeArray(int[] v, int newLength){
     int[] arr2 = new int[newLength];
        for (int i=0; i<v.length; i++){
           arr2[i] = v[i];
        }
      
     return arr2;
   }
   
   //stampare il contenuto di un array (printArray)
   public static String printArray(int[] v, int vSize){
      String s = "";
      
      for (int i = 0; i< vSize; i++){
         s = s + v[i] + " ";
      }
      return s;
   }

}
