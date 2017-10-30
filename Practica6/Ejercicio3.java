import java.awt.*;
import java.applet.*;

/**
*  @autor: J. Said Llamas Manriquez
*  @materia: Graficacion
*  @descripcion: 
*  @link: https://github.com/saidl14s/graficacion-itcg
*/

public class Ejercicio3 extends Applet{
   
   Pixel pixel = new Pixel(2);
   boolean original = true; //Aplicar traslacion B a la figura original?
   
   public void paint(Graphics g){
   
      int[] x = {175, 350, 275, 115}, y = {110, 110, 265, 265};
      double sx = 0, sy = 0;
      pixel.dibujarPoligono(x, y, g); //dibuja la orignal
      
      //inciso A
      sx = 2;
      sy = 2;
      g.setColor(new Color(20,200,140));
      pixel.dibujarPoligono(escalarFigura(x, sx, 'o'), escalarFigura(y, sy, 'o'),g);
      
      if(original){
         x[0] = 175;
         x[1] = 350;
         x[2] = 275;
         x[3] = 115;
         y[0] = 110;
         y[1] = 110;
         y[2] = 265;
         y[3] = 265;
      }
      
      //inciso B
      sx = 0.5;
      sy = 0.5;
//      int[] xs = escalarFigura(x, sx);
//      int[] ys = escalarFigura(y, sy);
      g.setColor(new Color(200,140,20));
//      pixel.dibujarPoligono(xs,ys,g);
      
      if(original){
         x[0] = 175;
         x[1] = 350;
         x[2] = 275;
         x[3] = 115;
         y[0] = 110;
         y[1] = 110;
         y[2] = 265;
         y[3] = 265;
      }
      
      //inciso C
      sx = 1.5;
      sy = 0.5;
      g.setColor(new Color(140,20,200));
//      pixel.dibujarPoligono(escalarFigura(x, sx),escalarFigura(y, sy),g);
      
      if(original){
         x[0] = 175;
         x[1] = 350;
         x[2] = 275;
         x[3] = 115;
         y[0] = 110;
         y[1] = 110;
         y[2] = 265;
         y[3] = 265;
      }
      //inciso D
      sx = 0.5;
      sy = 1.53;
      g.setColor(new Color(240,120,100));
//      pixel.dibujarPoligono(escalarFigura(x, sx),escalarFigura(y, sy),g);
      
   }//main
   
   public int[] escalarFigura(int[] m, double factor, char id){
      for(int i = 0; i < m.length; i++){
         if(id == 'o'){
            m[i] = (getWidth()/2)+(int) (m[i] * factor); //origen   
         } else if(id == 'c'){
            m[i] = (int) (m[i] * factor); //centro
         } else if(id == 'v'){
             m[i] = (int) (m[i] * factor);  //vertice
         } else if(id == 'p') {
            m[i] = (int) (m[i] * factor); //punto cualquiera
         }
      }
      return m;
   }//escalar
   
}//class