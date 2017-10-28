import java.awt.*;

public class Pixel{
   
   private int GROSOR = 2;
   private Color color = new Color(100,200,100);
   
   public Pixel(){
   }//end constuct
   
   public Pixel(int grosor){
      GROSOR = grosor;
   }//end constuct
   
   public void dibujarPixel(int x, int y, Graphics graphics){
      graphics.fillRect(x, y, GROSOR, GROSOR);
   }
   
   public void dibujarPixel(int x, int y, int grosor, Graphics graphics){
      graphics.fillRect(x, y, grosor, grosor);
   }
   
   public void dibujarPixel(int x, int y, Color color, Graphics graphics){
      graphics.setColor(color);
      graphics.fillRect(x, y, GROSOR, GROSOR);
   }
   
   public void dibujarPixel(int x, int y, int grosor, Color color, Graphics graphics){
      graphics.setColor(color);
      graphics.fillRect(x, y, grosor, grosor);
   }
   
   public void dibujarRecta(int x, int y, int x2, int y2, Graphics graphics){
      graphics.fillRect(x, y, x2, y2);
   }
   
}//end class 