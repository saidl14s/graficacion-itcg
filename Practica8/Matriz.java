import java.awt.*;
import java.applet.*;

/**
*  @autor: J. Said Llamas Manriquez
*  @materia: Graficacion
*  @descripcion: Operaciones con matrices
*  @link: https://github.com/saidl14s/graficacion-itcg
*/

public class Matriz{
      
   public static int[][] multiplicarMatriz(int[][] m, int[][] m2) {
        int rowsM = m.length, rowsM2 = m2.length; //renglon
        int colsM = m[0].length, colsM2 = m2[0].length; //columna
        
        System.out.println("Matriz M: "+rowsM+","+colsM+" &  Matriz M2: "+rowsM2+","+colsM2);
        
        int[][] mResult = new int[rowsM][colsM2];
        if (colsM == rowsM2) 
            for (int i = 0; i < m.length; i++) 
                for (int j = 0; j < colsM2; j++) 
                    for (int k = 0; k < colsM; k++) 
                        mResult[i][j] += m[i][k] * m2[k][j];
        else System.out.println("Ocurrio un error con la matriz: Mostrando... [0][0][0]");
                
        return mResult;
    }//end multipplicarMatriz

   
}//end class