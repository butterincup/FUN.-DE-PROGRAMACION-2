/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_bisiesto;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_4_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int year, residuo;
        Scanner input = new Scanner (System.in);
        // para crear el System facil es sout(control+espacio)
        System.out.println("ingrece el año a verificar");
        year=input.nextInt();
        
        residuo=year%4;
        //si es mas de una instruccion agregas llaves
        if (residuo==0){//verdad: el año es divisible entre 4
            residuo=year%100;
            if(residuo==0){//verdad:es divisible entre 100
                residuo=year%400;
                    if (residuo==0)//verdad:el año es divisibl entre 400
                        System.out.println("es año bisiesto");
                        else
                            System.out.println("no es año bisiesto");
            }else
                System.out.println("es año bisiesto");
            
        }
        else
            System.out.println("no es bisiesto");
        
    }
    
}
