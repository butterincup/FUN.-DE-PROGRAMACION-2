/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_12_califas_eua;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_12_CALIFAS_EUA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cal;
        Scanner input=new Scanner (System.in);
        System.out.println("ingrece la calificacion ");
        cal= input.nextInt();
        
           if ((90<=cal)&&(cal<=100))
            System.out.println(" su calificacion es A");
                else if ((80<=cal)&&(cal<=89))
                System.out.println("su calificacion es B");
                else if ((70<=cal)&&(cal<=79))
                System.out.println("su calificacion es C");
                else if ((60<=cal)&&(cal<=69))
                System.out.println("su calificacion es D");
                else if ((0<=cal)&&(cal<=59))
                System.out.println("su calificacion es F");
        
        else
            System.out.println("esa no es una calificaccion aceptable, prueve otra vez");
    }
}
