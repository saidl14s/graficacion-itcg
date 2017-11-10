import java.awt.*;

public class Dibujar3D{
   
   public void drawTetraedo(int x, int y, int t, Graphics g){
      int p = (int)t / 2; //proporcion
      int[] xc = {x, x+t, x+p, x, x+p, x+t};
      int[] yc = {y, y, y-((int)t/3), y, y-t, y};
      g.drawPolyline(xc, yc, 6);
      g.drawLine(x+p, y-t, x+p, y-((int)t/3));
   }
   
   public void drawCubo(int x, int y, int t, Graphics g){
      int[] xc = {x, x+t, x+t, x, x};
      int[] yc = {y, y, y+t, y+t, y};
      g.drawPolyline(xc, yc, 5);
      int p = (int)t / 3; //proporcion
      //3d
      int[] xf = {x+p, x+p+t, x+p+t, x+p, x+p};
      int[] yf = {y-p, y-p, y-p+t, y-p+t, y-p};
      g.drawPolyline(xf, yf, 5);
      //uniones
      g.drawLine(x, y, x+p, y-p);
      g.drawLine(x+t, y, x+t+p, y-p);
      g.drawLine(x+t, y+t, x+t+p, y-p+t);
      g.drawLine(x, y+t, x+p, y-p+t);
   }
   
   public void drawOctaedro(int x, int y, int t, Graphics g){
      int p = (int)t / 3; // proporcion
      int p2 = (int)p / 5; // segunda proporcion      
      int[] xc = {x, x+p, x+t, x+((int)t/2), x,  x+((int)t/2), x+t};
      int[] yc = {y, y+p2, y, y-((int)t/2), y, y+((int)t/2), y};
      g.drawPolyline(xc, yc, 7);
      g.drawLine(x+p, y+p2, x+((int)t/2), y+((int)t/2));
      g.drawLine(x+p, y+p2, x+((int)t/2), y-((int)t/2));
   }
   
   public void drawPrismaTriangular(int x, int y, int t, Graphics g){
      int p = (int)t / 2; // proporcion
      int p2 = (int)t / 3; // segunda proporcion      
      int[] xc = {x, x+t, x+p, x, x, x+t,x+t};
      int[] yc = {y, y, y-p2, y, y+(t+p), y+(t+p), y};
      g.drawPolyline(xc, yc, 7);
      g.drawLine(x+p,y+(t+p)-p2, x+p, y-p2);
      g.drawLine(x+p,y+(t+p)-p2, x, y+(t+p));
      g.drawLine(x+p,y+(t+p)-p2, x+t, y+(t+p));
   }
   
   public void drawPrismaCuadrangular(int x, int y, int t, Graphics g){
      int p = (int)t / 3; //proporcion
      int alt = y+y;
      int[] xc = {x, x+t, x+t+p, x+p, x, x, x+t, x+t};
      int[] yc = {y, y, y-p, y-p, y, alt, alt, y};
      g.drawPolyline(xc, yc, 8);
      g.drawLine(x+t+p, y-p, x+t+p, alt-p);
      g.drawLine(x+t+p, alt-p, x+t, alt);
   }
   
   public void drawPiramideTriangular(int x, int y, int t, Graphics g){
      int p = (int)t / 2; //proporcion
      int[] xc = {x, x+t, x+p, x, x+p, x+t};
      int[] yc = {y, y, y+((int)t/3), y, y-t, y};
      g.drawPolyline(xc, yc, 6);
      g.drawLine(x+p, y-t, x+p, y+((int)t/3));
   }
   
   public void drawPiramideCuadrangular(int x, int y, int t, Graphics g){
      int p = (int)t / 3; //proporcion
      int alt = y+y;
      int[] xc = {x, x+t, x+t+p, x+p, x, x, x+t, x+t};
      int[] yc = {y, y, y-p, y-p, y, alt, alt, y};
      g.drawPolyline(xc, yc, 5);
      g.drawLine(x, y, x+p+p, y-t-((int)t/3));
      g.drawLine(x+p+p, y-t-((int)t/3), x+t, y);
      g.drawLine(x+p+p, y-t-((int)t/3), x+t+p, y-p);
      g.drawLine(x+p+p, y-t-((int)t/3), x+p, y-p);
   }
   
   public void drawCilindro(int x, int y, int t, Graphics g){
      int p = (int)t / 2; //proporcion
      int p2 = (int)p / 4; //proporcion2
      g.drawOval(x, y, p, (int)p/2);
      g.drawLine(x, y+p2, x, y+t+p2);
      g.drawOval(x, y+t, p, (int)p/2);
      g.drawLine(x+p, y+p2, x+p, y+t+p2);
   }
   
   public void drawCono(int x, int y, int t, Graphics g){
      int p = (int)t / 2; //proporcion
      int p2 = (int)p / 4; //proporcion2
      g.drawOval(x, y, p, (int)p/2);
      g.drawLine(x, y+p2, x+((int)p/2), y+t+p2);
      g.drawLine(x+((int)p/2), y+t+p2, x+p, y+p2);
   }
   
   public void drawEsfera(int x, int y, int t, Graphics g){
      int p = (int)t / 2; //proporcion
      int p2 = (int)p / 4; //proporcion2
      g.drawOval(x, y, p, p);
      g.drawOval(x, y+p2, p, (int)p/2);
   }
   
}