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
                  dibujarPixel(x0, y0, g);
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
                dibujarPixel(x0, y0, g);
            }
        }
    }//dibujarPolilinea
    
    public void dibujarPolilinea(double x0, double y0, double x1, double y1, Graphics g){
        double dx = x1 - x0;
        double dy = y1 - y0; 
        double pendiente = 0;
        boolean pMenor;
        if(Math.abs(dx) > Math.abs(dy)) pMenor = true;
        else pMenor = false;

        if (pMenor) {
            pendiente = (float) dy / (float) dx;
            double b = y0 - pendiente * x0;
            if(dx < 0)
                dx =  -1;
            else
                dx =  1;
            while (x0 != x1) {
                x0 += dx;
                y0 = Math.round(pendiente * x0 + b);
                  dibujarPixel((int)x0, (int)y0, g);
            }
        } else {
            pendiente = (float) dx / (float) dy;      
            double b = x0 - pendiente * y0;
            if(dy < 0)
                dy =  -1;
            else
                dy =  1;
            while (y0 != y1) {
                y0 += dy;
                x0 = Math.round(pendiente * y0 + b);
                dibujarPixel((int)x0, (int)y0, g);
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
   
   public boolean dibujarPoligono(double[] puntosX, double[] puntosY, Graphics g){
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
}//end class 