/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_32_arreglos_multidim;

/**
 *
 * @author invitado
 */
public class EVA2_32_ARREGLOS_MULTIDIM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int [3][4];
        // primer [] son filas y el segundo [] son columnas
        matriz [1][3] = 100;
        System.out.println("matriz[1][3] = " +matriz[1][3]);
        //-------------------
        System.out.println(matriz.length);
        // llenatr con valires aleatiruis la matruz:
        //FILAS
        for (int i = 0; i < matriz.length; i++) {
            //por cada fula debo revorrer vada vilimna
            //COLUMNAS
            for (int j = 0; j <  matriz[i].length; j++) {
                matriz[i][j]= (int)(Math.random()*100);
                
            }
            
        }
        for (int i = 0; i < matriz.length; i++) {
            //por cada fula debo revorrer vada vilimna
            //COLUMNAS
            for (int j = 0; j <  matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] +"]");
                
            }
            System.out.println("");
        }
        
        
    }
    
    
}
