import java.util.Scanner;
import java.util.Arrays;

/**
*  @autor: J. Said Llamas Manriquez
*  @materia: Graficacion
*  @descripcion: Calculadora de matrices NXM con validacion
*  @link: https://bitbucket.org/saidllamas/
*/

public class MultiplicarMatrices{

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
   
   public static void main(String[] args){
      Scanner en = new Scanner(System.in);
      
      System.out.println("Matriz M");
      System.out.println("Ingrese numero de renglones");
      int rowsM = en.nextInt();
      
      System.out.println("Ingrese numero de columnas");
      int colsM = en.nextInt();
      
      int[][] m = new int[rowsM][colsM];
      System.out.println("Llenar matriz [M]");
      for (int i = 0; i < rowsM; i++) 
         for (int j = 0; j < colsM; j++) 
              m[i][j] = en.nextInt();
      System.out.println("Matriz M: "+Arrays.deepToString(m)); 
      
      System.out.println("Matriz M2");
      System.out.println("Ingrese numero de renglones");
      int rowsM2 = en.nextInt();
      
      System.out.println("Ingrese numero de columnas");
      int colsM2 = en.nextInt();
      
      int[][] m2 = new int[rowsM2][colsM2];
      System.out.println("Llenar matriz [M2]");
      for (int i = 0; i < rowsM2; i++) 
         for (int j = 0; j < colsM2; j++) 
              m2[i][j] = en.nextInt();
      System.out.println("Matriz M2: "+Arrays.deepToString(m2)); 

      int[][] res = multiplicarMatriz(m, m2);
      System.out.println("Resultado [M3]: "+Arrays.deepToString(res)); 

   }//end main
     
}//end class