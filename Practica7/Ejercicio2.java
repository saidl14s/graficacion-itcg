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
      int[] x = {155, 255, 255, 155}, y = {155, 155, 255, 255};
      int tx = 0, ty = 0;
      pixel.dibujarPoligono(x, y, g); //dibuja la orignal
   }//main
   
}//class