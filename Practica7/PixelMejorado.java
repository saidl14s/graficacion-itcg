import java.awt.*;

public class PixelMejorado{
   
   private int GROSOR = 2;
   private Color color = new Color(100,200,100);
   private int center[] = new int[2];
   
   public PixelMejorado(){
   }//end constuct
   
   public PixelMejorado(int grosor){
      GROSOR = grosor;
   }//end constuct
   
   public void dibujarPixel(int x, int y, Graphics graphics){
      graphics.fillRect(center[0]+x, center[1]-y, GROSOR, GROSOR);
   }
   
   public void setCenter(int[] center){
      this.center = center;
   }
   
}//end class 