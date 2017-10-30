import java.awt.*;
import java.applet.*;

/**
*  @autor: J. Said Llamas Manriquez
*  @materia: Graficacion
*  @descripcion: 
*  @link: https://github.com/saidl14s/graficacion-itcg
*/

public class Ejercicio1 extends Applet{
   
   Pixel pixel = new Pixel(2);
   boolean original = true; //Aplicar traslacion B a la figura original?
   
   public void paint(Graphics g){
      int[] x = {290, 430, 290, 150}, y = {150, 290, 430, 290};
      int tx = 0, ty = 0;
      pixel.dibujarPoligono(x, y, g); //dibuja la orignal
      
      g.setColor(new Color(20,200,140));
      
      //inciso A
      tx = -100;
      ty = 150;
      pixel.dibujarPoligono(trasladarFigura(x, tx),trasladarFigura(y, ty),g);
      
      g.setColor(new Color(200,140,20));
      if(original){
         x[0] = 290;
         x[1] = 430;
         x[2] = 290;
         x[3] = 150;
         y[0] = 150;
         y[1] = 290;
         y[2] = 430;
         y[3] = 290;
      }
      
      //inciso B
      tx = 100;
      ty = 150;
      pixel.dibujarPoligono(trasladarFigura(x, tx),trasladarFigura(y, ty),g);
      
   }//main
   
   public int[] trasladarFigura(int[] m, int factor){
      for(int i = 0; i < m.length; i++){
         m[i] = m[i] - factor;
      }
      return m;
   }//trasladar
   
}//end class