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
   
   public void paint(Graphics g){
      int[] x = {155, 255, 305, 105}, y = {122, 122, 237, 237};
      int tx = 0, ty = 0;
      pixel.dibujarPoligono(x, y, g); //dibuja la orignal
      
   }//main
   
}//end class