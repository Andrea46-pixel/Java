public class DuePuntoOtto{

   public static void main(String[] args){
   
      final double a = 856.23;
      
      int first = (int)a/100;
      
      int second = (int)(a%100)/10;
      
      int third = (int)(a%10);
      
      int fourth = (int)((a%1)*10);
      
      int fifth = (int)((a%1)*100);
      
      int sixth = (int)((a%1)*1000);
      
      //int fourth = (int)
      
      System.out.println(first + " " + second +" " +third+" "+fourth+" "+fifth+" "+sixth);
      
      
      System.out.println(fifth);
   
   }

}
