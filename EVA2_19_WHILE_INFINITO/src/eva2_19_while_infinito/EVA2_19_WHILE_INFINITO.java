/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_19_while_infinito;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_19_WHILE_INFINITO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nume=100;
        int cap=0;
        Scanner su=new Scanner (System.in);
        
        while (true){//true lo hace infinito nunca se va a detener
            System.out.println("Introduce un numero");
            cap= su.nextInt();
            if (cap==nume){
                System.out.println("Adivinaste");
                break; //Romper--> detiene la ejecucion
        }
        }
    }
    
}
