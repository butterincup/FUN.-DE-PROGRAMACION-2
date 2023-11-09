/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_20_while_retiros;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_20_WHILE_RETIROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int can=1000;
        Scanner su=new Scanner (System.in);
        
        
        while(can>0){
            System.out.println("¿Cuanto deseas retirar?");
            int retiro = su.nextInt();
            //acumuladores
            can=-retiro;
            //can=can1-retiro;
            
            System.out.println("te quedan $"+can+" de saldo");
            
            
        }
        
    }
    
}
