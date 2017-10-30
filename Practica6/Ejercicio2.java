import java.awt.*;
import java.applet.*;

/**
*  @autor: J. Said Llamas Manriquez
*  @materia: Graficacion
*  @descripcion: 
*  @link: https://github.com/saidl14s/graficacion-itcg
*/

public class Ejercicio2 extends Applet{
   
   Pixel pixel = new Pixel(2);
   boolean original = true; //Aplicar traslacion B a la figura original?
   
   public void paint(Graphics g){
      int[] x = {155, 255, 305, 105}, y = {122, 122, 237, 237};
      int tx = 0, ty = 0;
      pixel.dibujarPoligono(x, y, g); //dibuja la orignal
      
      g.setColor(new Color(20,200,140));
      
      //inciso A
      tx = 0;
      ty = 20;
      pixel.dibujarPoligono(trasladarFigura(x, tx),trasladarFigura(y, ty),g);
      
      g.setColor(new Color(200,140,20));
      if(original){
         x[0] = 155;
         x[1] = 255;
         x[2] = 305;
         x[3] = 105;
         y[0] = 122;
         y[1] = 122;
         y[2] = 237;
         y[3] = 237;
      }
      
      //inciso B
      tx = 20;
      ty = -50;
      pixel.dibujarPoligono(trasladarFigura(x, tx),trasladarFigura(y, ty),g);
      
      g.setColor(new Color(140,20,200));
      if(original){
         x[0] = 155;
         x[1] = 255;
         x[2] = 305;
         x[3] = 105;
         y[0] = 122;
         y[1] = 122;
         y[2] = 237;
         y[3] = 237;
      }
      
      //inciso C
      tx = 30;
      ty = 75;
      pixel.dibujarPoligono(trasladarFigura(x, tx),trasladarFigura(y, ty),g);
      
   }//main
   
   public int[] trasladarFigura(int[] m, int factor){
      for(int i = 0; i < m.length; i++){
         m[i] = m[i] - factor;
      }
      return m;
   }//trasladar
   
   
}//class