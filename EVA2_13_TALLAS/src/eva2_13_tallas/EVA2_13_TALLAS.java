/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_13_tallas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_13_TALLAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int talla;
        Scanner input=new Scanner(System.in);
        System.out.println("ingrece el numero de talla");
        talla= input.nextInt();
        
        switch (talla){
            case 29:
                System.out.println("la talla es small");
                break;
            case 42:
                System.out.println("la talla es medium");
                break;
            case 44:
                System.out.println("la talla es large");
                break;
            case 48:
                System.out.println("la talla es xlarge");
                break;
                
            default:
                System.out.println("estas tallas son desconocidas porfavor pruebe otra vez ");
                
                      
        }
    }
    
}
