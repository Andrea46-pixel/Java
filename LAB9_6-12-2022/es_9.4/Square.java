import java.awt.Rectangle;
public class Square  extends Rectangle{
   
   private int x, y, width, height, area;
   
   public Square(int ax, int ay, int aside){
      super.setLocation(ax, ay);
      x = aside;
      y = aside;
      width = aside;
      height = aside;
      area = 0;
      super.setSize(x,y);
   }
   
   public int getArea(int ax, int ay){
      area = ax*ay;
      return area;
   }
   
   public void setSize(int awidth, int aheight){
      if(awidth == aweight){
         width = awidth;
         height = aheight;
      }
      else{
         throw new IllegalArgumentException();
      }
   }
   
   public void setSize(int dim){
      width = dim;
      height = dim;
   }

}
