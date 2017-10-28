import java.awt.*;
import java.applet.*;

/**
*  @autor: J. Said Llamas Manriquez
*  @materia: Graficacion
*  @descripcion: Dibujar objetos
*  @link: https://bitbucket.org/saidllamas/
*/

public class Practica3 extends Applet{

   Pixel pixel = new Pixel();
   
   public void paint(Graphics g){
   
      // Cuadrado
      int unidadesLargo = 200, unidadesInicio = 20;
      int inicioX = unidadesInicio, inicioY = inicioX, largo = inicioX+unidadesLargo, alto = largo;
      int promX = (int)(largo+inicioX)/2, promY = promX;
      
      for(int i = inicioX; i <= largo ; i++){
         pixel.dibujarPixel(i, inicioY, new Color(100,200,110), g);
      }//for
      for(int i = inicioY; i <= alto ; i++){
         pixel.dibujarPixel(inicioX, i, g);
      }//for
      for(int i = inicioX; i <= largo ; i++){
         pixel.dibujarPixel(i, alto, g);
      }//for
      for(int i = inicioY; i <= alto ; i++){
         pixel.dibujarPixel(inicioX+unidadesLargo, i, g);
      }//for
      
      //diagonales
      for(int  i = inicioX; i <= largo; i++){
         pixel.dibujarPixel(i, i++, g);
      }
      for(int  i = inicioX; i <=  largo; i++){
         pixel.dibujarPixel(i, alto--, g);
      }
      for(int  i = inicioX; i <=  largo; i++){
         pixel.dibujarPixel(i, promX, g);
      }
      
      //recuperar valores originales
      alto = largo;
      promX = (int)(largo+inicioX)/2;
      
      for(int i = inicioY; i <= alto; i++){
         pixel.dibujarPixel(promX, i, g);
      }
      
      //Puntas
      int promX2 = (int)((promX+inicioX) / 2);
      int promY2 = (int)((promY+inicioY) / 2);
      int promX3 = promX2 + promX - unidadesInicio;
      int promY3 = promY2 + promY - unidadesInicio;
      
      for(int i = promX2; i  <= promX; i++ ){
         pixel.dibujarPixel(i, inicioY+=2, g);
      }
      
      //recuperar valores originales
      inicioY = inicioX;
      
      for(int i = promX3; i  >= promX; i--){
         pixel.dibujarPixel(i, inicioY+=2, g);
      }
      
      //recuperar valores originales
      inicioY = inicioX;
      
      for(int i = promX3; i  >= promX; i--){
         pixel.dibujarPixel(i, alto-=2, g);
      }
      
      //recuperar valores originales
      alto = largo;
      
      for(int i = promX2; i  <= promX; i++){
         pixel.dibujarPixel(i, alto-=2, g);
      }
      
      //Puntas
      for(int i = promY2; i <= promY; i++){
         pixel.dibujarPixel(inicioX+=2, i, g);
      }
      
      //Restaurar valores originales
      inicioX = unidadesInicio;
      
      for(int i = promY3; i >= promY; i--){
         pixel.dibujarPixel(inicioX+=2, i, g);
      }
      
      //Restaurar valores originales
      inicioX = unidadesInicio;
      
      for(int i = promY3; i >= promY; i--){
         pixel.dibujarPixel(largo-=2, i, g);
      }
      
      //Restaurar valores originales
      largo = inicioX+unidadesLargo;
      System.out.println(promY2 + " " +promY);
      for(int i = promY2; i <= promY; i++){
         pixel.dibujarPixel(largo-=2, i, g);
      }
      
      pixel.dibujarPixel(promX, promY, 4, g);//centro
      
      //Restaurar valores originales
      largo = inicioX+unidadesLargo;
      // end Cuadrado     
      
      
      // Circulo
      int espacio = 10, radio = 100, lgth = 70;
      int margen = largo + espacio;
      int[] centro = { margen + 100, promY };
      
      pixel.dibujarPixel(centro[0], centro[1], 2, g);
      
      //izq
      pixel.dibujarPixel(centro[0]-lgth, centro[1]+10, 10, g);
      pixel.dibujarPixel(centro[0]-lgth, centro[1], 10, g);
      pixel.dibujarPixel(centro[0]-lgth, centro[1]-10, 10, g);
      //der
      pixel.dibujarPixel(centro[0]+lgth, centro[1]+10, 10, g);
      pixel.dibujarPixel(centro[0]+lgth, centro[1], 10, g);
      pixel.dibujarPixel(centro[0]+lgth, centro[1]-10, 10, g);
      //abj
      pixel.dibujarPixel(centro[0]+10, centro[1]+lgth, 10, g);
      pixel.dibujarPixel(centro[0], centro[1]+lgth, 10, g);
      pixel.dibujarPixel(centro[0]-10, centro[1]+lgth, 10, g);
      //arb
      pixel.dibujarPixel(centro[0]+10, centro[1]-lgth, 10, g);
      pixel.dibujarPixel(centro[0], centro[1]-lgth, 10, g);
      pixel.dibujarPixel(centro[0]-10, centro[1]-lgth, 10, g);
      //arriba 
         //contorno
         pixel.dibujarPixel(centro[0]-20, centro[1]-lgth+10, 10, g);
         pixel.dibujarPixel(centro[0]-30, centro[1]-lgth+10, 10, g);
         pixel.dibujarPixel(centro[0]+20, centro[1]-lgth+10, 10, g);
         pixel.dibujarPixel(centro[0]+30, centro[1]-lgth+10, 10, g);
         //cap2
         pixel.dibujarPixel(centro[0]-40, centro[1]-lgth+20, 10, g);
         pixel.dibujarPixel(centro[0]-50, centro[1]-lgth+20, 10, g);
         pixel.dibujarPixel(centro[0]+40, centro[1]-lgth+20, 10, g);
         pixel.dibujarPixel(centro[0]+50, centro[1]-lgth+20, 10, g);
         //cap3
         pixel.dibujarPixel(centro[0]-60, centro[1]-lgth+30, 10, g);
         pixel.dibujarPixel(centro[0]-60, centro[1]-lgth+40, 10, g);
         pixel.dibujarPixel(centro[0]-60, centro[1]-lgth+50, 10, g);
         pixel.dibujarPixel(centro[0]+60, centro[1]-lgth+30, 10, g);
         pixel.dibujarPixel(centro[0]+60, centro[1]-lgth+40, 10, g);
         pixel.dibujarPixel(centro[0]+60, centro[1]-lgth+50, 10, g);
      //abajo
         //cap4
         pixel.dibujarPixel(centro[0]-60, centro[1]-lgth+90, 10, g);
         pixel.dibujarPixel(centro[0]-60, centro[1]-lgth+100, 10, g);
         pixel.dibujarPixel(centro[0]-60, centro[1]-lgth+110, 10, g);
         pixel.dibujarPixel(centro[0]+60, centro[1]-lgth+90, 10, g);
         pixel.dibujarPixel(centro[0]+60, centro[1]-lgth+100, 10, g);
         pixel.dibujarPixel(centro[0]+60, centro[1]-lgth+110, 10, g);
         //cap5
         pixel.dibujarPixel(centro[0]-40, centro[1]-lgth+120, 10, g);
         pixel.dibujarPixel(centro[0]-50, centro[1]-lgth+120, 10, g);
         pixel.dibujarPixel(centro[0]+40, centro[1]-lgth+120, 10, g);
         pixel.dibujarPixel(centro[0]+50, centro[1]-lgth+120, 10, g);
         //cap6
         pixel.dibujarPixel(centro[0]-20, centro[1]-lgth+130, 10, g);
         pixel.dibujarPixel(centro[0]-30, centro[1]-lgth+130, 10, g);
         pixel.dibujarPixel(centro[0]+20, centro[1]-lgth+130, 10, g);
         pixel.dibujarPixel(centro[0]+30, centro[1]-lgth+130, 10, g);
         
      //centro
      pixel.dibujarPixel(centro[0]-20, centro[1]-20, 55, g);
      pixel.dibujarPixel(centro[0], centro[1], 15, new Color(255, 255, 255), g);
      
      //end circulo
      
      // camino
      int inicioCamino = centro[0] +100;
      for(int i = 1; i <= 65; i++){
         inicioCamino++;
         pixel.dibujarPixel(inicioCamino, promY+100, 3, new Color(100,200,110), g);
      }
      int altura = 0;
      for(int i = 1; i <= 130; i++){
         altura = (promY+100)-i;
         pixel.dibujarPixel(inicioCamino, altura, 3, g);
      }
      for(int i = 1; i <= 65; i++){
         inicioCamino++;
         pixel.dibujarPixel(inicioCamino, altura, 3, g);
      }
      for(int i = 130; i >= 1; i--){
         altura = (promY+100)-i;
         pixel.dibujarPixel(inicioCamino, altura, 3, g);
      }
      for(int i = 1; i <= 65; i++){
         inicioCamino++;
         pixel.dibujarPixel(inicioCamino, altura, 3, new Color(100,200,110), g);
      }
      for(int i = 1; i <= 130; i++){
         altura = (promY+100)-i;
         pixel.dibujarPixel(inicioCamino, altura, 3, g);
      }
      for(int i = 1; i <= 65; i++){
         inicioCamino++;
         pixel.dibujarPixel(inicioCamino, altura, 3, g);
      }
      //end camino
      
      
      //casa
         //triangulo
         inicioX = centro[0]+410;
         int c = 120;
         for(int p = 1; p <= 60; p++){
            for(int i = inicioX; i <= inicioX+c; i++){
               pixel.dibujarPixel(i, promY-p, g);
            }
            inicioX++;
            c-=2;
         }
         //cuadrado
         inicioX = centro[0] +410;
         for(int i = 1; i <= 120 ; i++){
            pixel.dibujarPixel(inicioX, promY+i, new Color(100,200,110), g);
         }//for
         for(int i = 1; i <= 120 ; i++){
            pixel.dibujarPixel(inicioX+120, promY+i, g);
         }//for
         //piso
         for(int i = 1; i <= 120 ; i++){
            pixel.dibujarPixel(inicioX+i, promY+120, g);
         }//for
        //ventana
        int comienzo = inicioX+30;
        for(int i = 1; i <= 40; i++){
            pixel.dibujarPixel(comienzo+i, promY+60, g);
        }
        for(int i = 1; i <= 40; i++){
            pixel.dibujarPixel(comienzo+i, promY+45, g);
        }
        comienzo+=40; 
        for(int i = 1; i <= 15; i++){
            pixel.dibujarPixel(comienzo, promY+45+i, g);
        }
        for(int i = 1; i <= 15; i++){
            pixel.dibujarPixel(comienzo-40, promY+45+i, g);
        }
      //puerta
          comienzo+=28;
          promY+=58;
        for(int i = 1; i <= 20; i++){
            pixel.dibujarPixel(comienzo+i, promY+60, g);
        }
        for(int i = 1; i <= 20; i++){
            pixel.dibujarPixel(comienzo+i, promY+25, g);
        }
        for(int i = 1; i <= 35; i++){
         pixel.dibujarPixel(comienzo, promY+25+i, g);
        }
        
        
      //nombre
         inicioX = 20;
         int cont = 0;
         //j
         for(int i = 1; i <= 45; i++){
            cont = inicioX+i;
            pixel.dibujarPixel(cont, promY+220, g);
         }
         for(int i = 1; i <= 80; i++){
            pixel.dibujarPixel(cont, promY+220-i, g);
         }
         //l
         inicioX = cont+50;
         cont = inicioX;
         for(int i = 1; i <= 80; i++){
            pixel.dibujarPixel(cont, promY+220-i, g);
         }
         for(int i = 1; i <= 45; i++){
            cont = inicioX+i;
            pixel.dibujarPixel(cont, promY+220, g);
         }
         //m
         inicioX = cont+50;
         cont = inicioX;
         for(int i = 1; i <= 80; i++){
            pixel.dibujarPixel(cont, promY+220-i, g);
         }
         int p = promY+220-80;
         int cc = 0;
         for(int i = 1; i<= 40; i++){   
            cc = cont+i;
            pixel.dibujarPixel(cc, p++, g);
         }
         for(int i = 1; i<= 40; i++){   
            pixel.dibujarPixel(cc++, p--, g);
         }
         for(int i = 1; i <= 80; i++){
            pixel.dibujarPixel(cc, promY+220-i, g);
         }
      
   }//end paint
   
}// end class