import java.lang.Math;

public class DuePuntoSette{

   public static void main(String[] args){
   
      double raggio = 10.12;
      double altezza = 10.87;
      
      final double pi = Math.PI;
      
      double areaBase = pi*raggio*raggio;
      double volume = areaBase*altezza;
      
      System.out.println("***Il volume del cilindro di raggio "+raggio+" e altezza "+altezza+" e' pari a "+volume+"***");
   
   }

}
