import java.awt.Rectangle;
public class Square  extends Rectangle{
   
   public Square(int ax, int ay, int aside){
      super.setLocation(ax, ay);
      super.setSize(aside,aside);
   }
   
   public int getArea(int side1, int side2){
      int area = side1*side2;
      return area;
   }
   
   public void setSize(int awidth, int aheight){
      if(awidth == aheight){
         super.setSize(awidth, aheight);
      }
      else{
         throw new IllegalArgumentException();
      }
   }
   
   public void setSize(int dim){
      super.setSize(dim, dim);
   }

}
