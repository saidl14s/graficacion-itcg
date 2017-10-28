import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
*  @autor: J. Said Llamas Manriquez
*  @materia: Graficacion
*  @descripcion: Representacion grafica de plano cartesiano, con cuadricula por default
*  @link: https://bitbucket.org/saidllamas/
*/

public class PlanoCartesiano extends Frame {
   
   PixelMejorado pixel = new PixelMejorado();
   private final int X = 0, Y = 1; //legibilidad 
   static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
   static int WidthFrame = 0, HeightFrame = 0; 
   int espacio = 40;
   private boolean isCuadricula = true;
   private int center[] = new int[2];
   
   private JCheckBox chkCuadricula;
   
   public PlanoCartesiano(){
      setTitle("Plano cartesiano");
      addComponentListener(new ComponentAdapter(){
         public void componentResized(ComponentEvent e){
            WidthFrame = getBounds().width;
            HeightFrame = getBounds().height;
            
            pixel.setCenter(getCenter());
            // Actualizar punto medio X & Y
            center[X] = (int)(WidthFrame/2);
            center[Y] = (int)(HeightFrame/2);
            
            repaint();
         }
      });
      
      setLayout(new FlowLayout());
      
      chkCuadricula = new JCheckBox("Dibujar cuadricula");
      
      if(isCuadricula) chkCuadricula.setSelected(true);
      else chkCuadricula.setSelected(false);
      
      CheckBoxListener chkListener = new CheckBoxListener();
      chkCuadricula.addItemListener(chkListener);
      add(chkCuadricula);
   }//end construct
   
   public int[] getCenter(){
      return center;
   }
   
   // Asignar espacio entre cuadros
   
   public void setCuadricula(int espacio){
      this.espacio = espacio;
   }
   
   public int getCuadricula(){
      return espacio;
   }   
   
   // Dibujar cuadricula? 
   
   public boolean conCuadricula(){
      return isCuadricula;
   }
   
   public void setConCuadricula(boolean e){
      isCuadricula = e;
   }
   
   // Dibujar plano
   public void paint(Graphics g){ 
      g.drawLine(center[X], 0, center[X], HeightFrame-40); // horizontal
      g.drawLine(40, center[Y], WidthFrame-40, center[Y]); //   vertical
      
      g.setColor(new Color(230, 230, 230));
      
      // Dibujar cuadricula
      if(conCuadricula()){
         for(int i = 40; i < WidthFrame; i += getCuadricula()){
            g.drawLine(i, 0, i, HeightFrame-40); // horizontal
            g.drawLine(40, i, WidthFrame-40, i); //   vertical
         }
      }
      
   }
   
   // tamaño del frame
   public int getWidthFrame(){
      return WidthFrame;
   }
   public int getHeightFrame(){
      return WidthFrame;
   }
   
   // tamaño de pantalla
   public static int getMaxX(){
      return (int)screenSize.getWidth();
   }
   
   public static int getMaxY(){
      return (int)screenSize.getHeight();
   }
   
   public static void main(String[] args){
      PlanoCartesiano app = new PlanoCartesiano();
      app.setBounds(0,0,getMaxX(), getMaxY());
      app.setVisible(true);
      app.addWindowListener(new WindowAdapter(){
         public void windowClosing(WindowEvent e){
            System.exit(0);
         }
      });
   }
   
   // Evento en chk
   
   class CheckBoxListener implements ItemListener {
      public void itemStateChanged(ItemEvent e) {
         Object chk = e.getItemSelectable();
         if (chk == chkCuadricula) {
            if(isCuadricula)setConCuadricula(false);
            else setConCuadricula(true);
            repaint();
         }
      }
   }
}//end class