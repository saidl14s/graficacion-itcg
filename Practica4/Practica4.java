import java.awt.*;
import java.applet.*;

/**
*  @autor: J. Said Llamas Manriquez
*  @materia: Graficacion
*  @descripcion: Re-escritura del metodo drawLine y drawOval aplicando diferentes algoritmos,
*                 con comparacion de trazado entre la clase Graphics de Java y mi propio algorimo.      
*  @link: https://bitbucket.org/saidllamas/
*/

public class Practica4 extends Applet{

   Pixel pixel = new Pixel();
   boolean myClass = true, drawOval = true;
   
   public void dibujarPolilinea(int x0, int y0, int x1, int y1, Graphics g){
        int dx = x1 - x0;
        int dy = y1 - y0; 
        float pendiente = 0;
        boolean pMenor;
        if(Math.abs(dx) > Math.abs(dy)) pMenor = true;
        else pMenor = false;

        if (pMenor) {
            pendiente = (float) dy / (float) dx;
            float b = y0 - pendiente * x0;
            if(dx < 0)
                dx =  -1;
            else
                dx =  1;
            while (x0 != x1) {
                x0 += dx;
                y0 = Math.round(pendiente * x0 + b);
                  pixel.dibujarPixel(x0, y0, g);
            }
        } else {
            pendiente = (float) dx / (float) dy;      
            float b = x0 - pendiente * y0;
            if(dy < 0)
                dy =  -1;
            else
                dy =  1;
            while (y0 != y1) {
                y0 += dy;
                x0 = Math.round(pendiente * y0 + b);
                pixel.dibujarPixel(x0, y0, g);
            }
        }
    }//dibujarPolilinea
        
    public boolean dibujarPoligono(int[] puntosX, int[] puntosY, Graphics g){
        if(puntosX.length != puntosY.length) return false;
        else{
            int localidades = puntosX.length;
            for(int i = 0; i < localidades; i++){
                if((i+1) < localidades){
                    dibujarPolilinea(puntosX[i], puntosY[i], puntosX[i+1], puntosY[i+1], g);
                }else{
                    dibujarPolilinea(puntosX[i], puntosY[i], puntosX[0], puntosY[0], g);
                }
            }
            return true;
        }
    }//dibujarPoligono
    
    public void dibujarCirculo(int xC, int yC, int r, Graphics g) {
        int x = 0, y = r, u = 1, v = 2 * r - 1, E = 0;
        while (x < y) { 
            pixel.dibujarPixel(xC + x, yC + y, g);
            pixel.dibujarPixel(xC + y, yC - x, g);
            pixel.dibujarPixel(xC - x, yC - y, g);
            pixel.dibujarPixel(xC - y, yC + x, g);
            x++;
            E += u;
            u += 2;
            if (v < 2 * E) {
                y--;
                E -= v;
                v -= 2;
            }
            if (x > y) break;
            pixel.dibujarPixel(xC + y, yC + x, g);
            pixel.dibujarPixel(xC + x, yC - y, g);
            pixel.dibujarPixel(xC - y, yC - x, g);
            pixel.dibujarPixel(xC - x, yC + y, g);
        }
    }//dibujarCirculo
    
    public void paint(Graphics g){
      int [] pX = {10, 15, 12};
      int [] pY = {100, 150,1};
      int promY = 50;
      int centro[] = new int[2];
      // camino
      int inicioCamino = centro[0] + 30;
      g.setColor(new Color(100,200,110));
      
      if(myClass)      dibujarPolilinea(inicioCamino,promY+100,inicioCamino+65,promY+100,g);
      else             g.drawLine(inicioCamino,promY+100,inicioCamino+65,promY+100);
      for(int i = 1; i <= 65; i++){
         inicioCamino++;
//         pixel.dibujarPixel(inicioCamino, promY+100, 3, new Color(100,200,110), g);
      }
      
      int altura = 0;
      if(myClass)      dibujarPolilinea(inicioCamino,(promY+100),inicioCamino,(promY+100)-130,g);
      else             g.drawLine(inicioCamino,(promY+100),inicioCamino,(promY+100)-130);
      for(int i = 1; i <= 130; i++){
         altura = (promY+100)-i;
//         pixel.dibujarPixel(inicioCamino, altura, 3, g);
      }
      
      if(myClass)      dibujarPolilinea(inicioCamino,altura,inicioCamino+65,altura,g);
      else              g.drawLine(inicioCamino,altura,inicioCamino+65,altura);
      for(int i = 1; i <= 65; i++){
         inicioCamino++;
//         pixel.dibujarPixel(inicioCamino, altura, 3, g);
      }
      
      if(myClass)      dibujarPolilinea(inicioCamino,(promY+100),inicioCamino,(promY+100)-130,g);
      else             g.drawLine(inicioCamino,(promY+100),inicioCamino,(promY+100)-130);
      for(int i = 130; i >= 1; i--){
         altura = (promY+100)-i;
//         pixel.dibujarPixel(inicioCamino, altura, 3, g);
      }
      
      
      if(myClass)      dibujarPolilinea(inicioCamino,altura,inicioCamino+65,altura,g);
      else              g.drawLine(inicioCamino,altura,inicioCamino+65,altura);
      for(int i = 1; i <= 65; i++){
         inicioCamino++;
//         pixel.dibujarPixel(inicioCamino, altura, 3, new Color(100,200,110), g);
      }
      
      if(myClass)      dibujarPolilinea(inicioCamino,(promY+100),inicioCamino,(promY+100)-130,g);
      else              g.drawLine(inicioCamino,(promY+100),inicioCamino,(promY+100)-130);
      for(int i = 1; i <= 130; i++){
         altura = (promY+100)-i;
//         pixel.dibujarPixel(inicioCamino, altura, 3, g);
      }
      
      if(myClass)      dibujarPolilinea(inicioCamino,altura,inicioCamino+65,altura,g);
      else              g.drawLine(inicioCamino,altura,inicioCamino+65,altura);
      for(int i = 1; i <= 65; i++){
         inicioCamino++;
//         pixel.dibujarPixel(inicioCamino, altura, 3, g);
      }
      //end camino
      
      
      //estrella
      if(myClass){
         dibujarPolilinea(100, 200, 125, 250, g);
         dibujarPolilinea(100, 200, 75, 250, g);
         //izq
         dibujarPolilinea(75, 250, 25, 250, g);
         dibujarPolilinea(25, 250, 75, 300, g);
         dibujarPolilinea(75, 300, 50, 350, g);
         dibujarPolilinea(50, 350, 90, 325, g);
         //der
         dibujarPolilinea(125, 250, 180, 250, g);
         dibujarPolilinea(180, 250, 125, 300, g);
         dibujarPolilinea(125, 300, 150, 350, g);
         dibujarPolilinea(150, 350, 90, 325, g);
      }else{
         g.drawLine(100, 200, 125, 250);
         g.drawLine(100, 200, 75, 250);
         g.drawLine(75, 250, 25, 250);
         g.drawLine(25, 250, 75, 300);
         g.drawLine(75, 300, 50, 350);
         g.drawLine(50, 350, 90, 325);
         g.drawLine(125, 250, 180, 250);
         g.drawLine(180, 250, 125, 300);
         g.drawLine(125, 300, 150, 350);
         g.drawLine(150, 350, 90, 325);
      }
      //recta
/*         dibujarPolilinea(10,20,30,40,g);
         g.drawLine(10, 20,30,40);*/
         //Poligono
/*         if(!dibujarPoligono(pX, pY, g)) System.out.println("Ocurrio un error");
         g.drawPolygon(pX,pY,3);*/
         //circunferencia
         if(drawOval)
            if(myClass) dibujarCirculo(300, 250, 40, g);
            else        g.drawOval(300, 250, 40, 40);
   }//end paint
   
}// end class
