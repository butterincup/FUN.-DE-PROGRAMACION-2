/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_14_ciclo_for;

/**
 *
 * @author invitado
 */
public class EVA2_14_CICLO_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //for-->desde
        //se ejecuta desde un punto
        //for(punto de inicio; condicion para el termino; manera de avanzar( o retroceder)
        for (int i = 0; i < 10; i++) {
            //++(operador de incremento en 1) le suma uno a la variable
            //--(operador de decremento en 1) le restan uno a la variable
            //+=(operador de incremento en N) le aumenta N a la variable
            //-=(
            System.out.println(i);
        }
        System.out.println("----------");
        for(int i=9; i >=0; i--){
            System.out.println(i);
            
            
            //numeros pares 0 a 100
        }
            for (int i=0; i<=100; i+=2){
                System.out.println(i + "-");
        }
        
    }
    
    
}
