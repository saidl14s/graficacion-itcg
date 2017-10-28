import java.awt.*;
import java.applet.*;

/**
*  @autor: J. Said Llamas Manriquez
*  @materia: Graficacion
*  @descripcion: Dibujo de batman
*  @link: https://bitbucket.org/saidllamas/
*/

public class Batman extends Applet{

   Color azul = new Color(112, 146, 191);
   Color gris = new Color(107, 107, 107);
   Color negro = new Color(27, 27, 27);
   Color blanco_s = new Color(195, 188, 178);
   Color blanco = new Color(204, 203, 199);
   Color amarillo = new Color(255, 255, 0);
   Color carne = new Color(214, 170, 141);
   Color carne_s = new Color(109, 82, 65);
   Color brilloBlanco = new Color(86, 86, 86);
   
   
   Pixel pixel = new Pixel(3);
      
   public void paint(Graphics g){
      setBackground( azul );
      
      g.setColor(negro);
      
      //cabeza
      for(int i = 125; i < 340; i+=3)//ancho
         for(int ix = 30; ix < 300; ix+=3)//alto
            pixel.dibujarPixel(i, ix, g);
      //capa
      int z = 0;
      for(int ix = 270; ix < 440; ix+=3){
         for(int i = 105; i < 360+z+z; i+=3){
            pixel.dibujarPixel(i-z, ix, g);
         }
         if(ix % 2 == 0) z+=3;
         else z++;
      }
      //torzo
      z = 0;
      g.setColor(gris);
      for(int ix = 300; ix < 440; ix+=3){
         for(int i = 125; i < 340+z+z; i+=3){
            pixel.dibujarPixel(i-z, ix, g);
         }
         if(ix % 2 == 0) z++;
      }
      
      //nariz
      g.setColor(brilloBlanco);
      for(int i = 132; i < 189; i+=3){
         pixel.dibujarPixel(234, i, g);
         pixel.dibujarPixel(236, i, g);
         pixel.dibujarPixel(235, i, g);
      }
      
      //brillo frente
      for(int ix = 168; ix < 303; ix+=3)//alto
         for(int i = 28; i < 105; i+=3)//ancho         
            pixel.dibujarPixel(ix, i, g);
      
      int asl =22;
      for(int pss = 15; pss <28; pss++){
         for(int xs = 168; xs < 188; xs+=3){
            pixel.dibujarPixel(xs, pss, g);
            pixel.dibujarPixel(xs+113, pss, g);
         }
      }
      
      //ojos
            //OJO
         g.setColor(blanco_s);
         for(int i = 186; i < 200; i+=3){
            pixel.dibujarPixel(i, 136, g);
            pixel.dibujarPixel(i+90, 136, g);
         }
      g.setColor(blanco);
      int i = 168;
         //izq
         for(; i < 214; i+=3){//ancho
            pixel.dibujarPixel(i ,138, g);
            pixel.dibujarPixel(i ,141, g);
            pixel.dibujarPixel(i ,144, g);         
         }
         //der
         for(i = 257 ; i < 303; i+=3){//ancho
            pixel.dibujarPixel(i,138, g);
            pixel.dibujarPixel(i ,141, g);
            pixel.dibujarPixel(i ,144, g);
         }
      
      //boca
      g.setColor(carne);
       for(i = 170; i < 303; i+=3)//ancho
         for(int ix = 210; ix < 250; ix+=3)//alto
            pixel.dibujarPixel(i, ix, g);
            
      //labios
      g.setColor(negro);
      for(i = 186; i < 217; i+=3)//ancho
         pixel.dibujarPixel(i,216,g);
      pixel.dibujarPixel(217,218,g);
      pixel.dibujarPixel(219,221,g);
      pixel.dibujarPixel(183,221,g);
      pixel.dibujarPixel(184,221,g);
      pixel.dibujarPixel(186,221,g);
      pixel.dibujarPixel(186,219,g);
      
      //logo      
         //relleno
         g.setColor(amarillo);
         for(int pps = 0; pps < 50; pps+=3){
            for(int ap = 158+pps; ap < 300-pps; ap++){
               pixel.dibujarPixel(ap, 370-pps-5, g);
              
            }
         }
         for(int pps = 0; pps < 50; pps+=3){
            for(int ap = 158+pps; ap < 300-pps; ap++){
               pixel.dibujarPixel(ap, 370+pps-3, g);
              
            }
         }
         //vampiro
         //izq
         g.setColor(negro);
         pixel.dibujarPixel(195,336, g);
         pixel.dibujarPixel(193,338, g);
         pixel.dibujarPixel(191,340, g);
         pixel.dibujarPixel(189,342, g);
         pixel.dibujarPixel(187,344, g);
         pixel.dibujarPixel(185,346, g);
         pixel.dibujarPixel(183,348, g);
         pixel.dibujarPixel(181,350, g);
         pixel.dibujarPixel(179,352, g);
         pixel.dibujarPixel(177,354, g);
         pixel.dibujarPixel(175,356, g);
         pixel.dibujarPixel(173,358, g);
         pixel.dibujarPixel(171,360, g);
         pixel.dibujarPixel(169,362, g);
         //der
         pixel.dibujarPixel(195+68,336, g);
         pixel.dibujarPixel(193+72,338, g);
         pixel.dibujarPixel(191+76,340, g);
         pixel.dibujarPixel(189+80,342, g);
         pixel.dibujarPixel(187+84,344, g);
         pixel.dibujarPixel(185+88,346, g);
         pixel.dibujarPixel(183+92,348, g);
         pixel.dibujarPixel(181+96,350, g);
         pixel.dibujarPixel(179+100,352, g);
         pixel.dibujarPixel(177+104,354, g);
         pixel.dibujarPixel(175+108,356, g);
         pixel.dibujarPixel(173+112,358, g);
         pixel.dibujarPixel(171+116,360, g);
         pixel.dibujarPixel(169+120,362, g);
         //centro
         //derec
         pixel.dibujarPixel(231,336, g);
         pixel.dibujarPixel(233,336, g);
         pixel.dibujarPixel(235,338, g);
         pixel.dibujarPixel(237,340, g);
         pixel.dibujarPixel(239,342, g);
         pixel.dibujarPixel(241,344, g);
         pixel.dibujarPixel(243,346, g);
         pixel.dibujarPixel(245,346, g);
         pixel.dibujarPixel(247,344, g);
         pixel.dibujarPixel(249,342, g);
         pixel.dibujarPixel(251,340, g);
         pixel.dibujarPixel(253,338, g);
         pixel.dibujarPixel(255,336, g);
         pixel.dibujarPixel(257,336, g);
         pixel.dibujarPixel(259,336, g); 
         pixel.dibujarPixel(261,336, g);
         //izzq
         pixel.dibujarPixel(232,336, g);
         pixel.dibujarPixel(233,336, g);
         pixel.dibujarPixel(229,338, g);
         pixel.dibujarPixel(227,340, g);
         pixel.dibujarPixel(225,342, g);
         pixel.dibujarPixel(223,344, g);
         pixel.dibujarPixel(221,346, g);
         pixel.dibujarPixel(219,346, g);
         pixel.dibujarPixel(217,344, g);
         pixel.dibujarPixel(215,342, g);
         pixel.dibujarPixel(213,340, g);
         pixel.dibujarPixel(211,338, g);
         pixel.dibujarPixel(209,336, g);
         pixel.dibujarPixel(207,336, g);
         pixel.dibujarPixel(205,336, g);
         pixel.dibujarPixel(203,336, g);
         pixel.dibujarPixel(201,336, g);
         pixel.dibujarPixel(199,336, g);
         pixel.dibujarPixel(197,336, g);
         //inverso-abajo
         pixel.dibujarPixel(231,336+40, g);
         pixel.dibujarPixel(233,336+40, g);
         pixel.dibujarPixel(235,338+40, g);
         pixel.dibujarPixel(237,340+40, g);
         pixel.dibujarPixel(239,342+40, g);
         pixel.dibujarPixel(241,344+40, g);
         pixel.dibujarPixel(243,346+40, g);
         pixel.dibujarPixel(245,346+40, g);
         pixel.dibujarPixel(247,344+40, g);
         pixel.dibujarPixel(249,342+40, g);
         pixel.dibujarPixel(251,340+40, g);
         pixel.dibujarPixel(253,338+40, g);
         pixel.dibujarPixel(255,336+40, g);
         pixel.dibujarPixel(257,336+40, g);
         pixel.dibujarPixel(259,336+40, g); 
         pixel.dibujarPixel(261,336+40, g);
         //izzq
         pixel.dibujarPixel(232,336+40, g);
         pixel.dibujarPixel(233,336+40, g);
         pixel.dibujarPixel(229,338+40, g);
         pixel.dibujarPixel(227,340+40, g);
         pixel.dibujarPixel(225,342+40, g);
         pixel.dibujarPixel(223,344+40, g);
         pixel.dibujarPixel(221,346+40, g);
         pixel.dibujarPixel(219,346+40, g);
         pixel.dibujarPixel(217,344+40, g);
         pixel.dibujarPixel(215,342+40, g);
         pixel.dibujarPixel(213,340+40, g);
         pixel.dibujarPixel(211,338+40, g);
         pixel.dibujarPixel(209,336+40, g);
         pixel.dibujarPixel(207,336+40, g);
         pixel.dibujarPixel(205,336+40, g);
         pixel.dibujarPixel(203,336+40, g);
         pixel.dibujarPixel(201,336+40, g);
         pixel.dibujarPixel(199,336+40, g);
         pixel.dibujarPixel(197,336+40, g);
         
         //correcciones izq
         pixel.dibujarPixel(195,334+40, g);
         pixel.dibujarPixel(193,332+40, g);
         pixel.dibujarPixel(191,330+40, g);
         pixel.dibujarPixel(189,330+40, g);
         pixel.dibujarPixel(187,330+40, g);
         pixel.dibujarPixel(185,328+40, g);
         pixel.dibujarPixel(183,326+40, g);
         pixel.dibujarPixel(181,324+40, g);
         pixel.dibujarPixel(181,324+40, g);
         pixel.dibujarPixel(179,324+40, g);
         pixel.dibujarPixel(177,324+40, g);
         pixel.dibujarPixel(175,322+40, g);
         pixel.dibujarPixel(173,322+40, g);
         //der
         pixel.dibujarPixel(195+68,334+42, g);
         pixel.dibujarPixel(193+72,334+42, g);
         pixel.dibujarPixel(195+72,334+42, g);
         pixel.dibujarPixel(197+72,334+42, g);
         pixel.dibujarPixel(199+72,334+40, g);
         pixel.dibujarPixel(201+72,334+38, g);
         pixel.dibujarPixel(203+72,334+36, g);
         pixel.dibujarPixel(205+72,332+38, g);
         pixel.dibujarPixel(207+72,332+38, g);
         pixel.dibujarPixel(209+72,332+36, g);
         pixel.dibujarPixel(211+72,332+34, g);
         pixel.dibujarPixel(213+72,332+34, g);
         pixel.dibujarPixel(215+72,332+32, g);

   }//end paint
   
}//class