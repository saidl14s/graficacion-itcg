import java.applet.*;
import java.awt.*;

//practica 12

public class Main extends Applet{
   
   Dibujar3D dibujar = new Dibujar3D();
   
   public void paint(Graphics g){
      /*
      *  Todos los metodos reciben 4 parametros
      *  1. X => Pos en X
      *  2. Y => Pos en Y
      *  3. T => Logitud/tamaño
      *  4. Objeto Graphics
      */
      dibujar.drawCubo(50,100, 50, g);
      dibujar.drawTetraedo(150, 50, 50, g);
      dibujar.drawOctaedro(250, 50, 50, g);
      dibujar.drawPrismaTriangular(550, 450, 50, g);
      dibujar.drawPrismaCuadrangular(500, 150, 50, g);
      dibujar.drawPiramideTriangular(670, 450, 50, g);
      dibujar.drawPiramideCuadrangular(350, 160, 50, g);
      dibujar.drawCilindro(60, 250, 100, g);
      dibujar.drawCono(400, 250, 100, g);
      dibujar.drawEsfera(200, 280, 200, g);
   }
}