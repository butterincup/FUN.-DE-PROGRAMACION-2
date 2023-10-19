/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_6_and_or_operadores;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_6_AND_OR_OPERADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CAPOTURALA CALIFICACION
        int cal;
        Scanner input =new Scanner(System.in);
        System.out.println("ingrece la calificacion");
        cal=input.nextInt();
        //(and) ambas se deben cumplir (el operador de esto es &&)
        //vamos a evaluar
        if ((cal>=0)&&(cal<=100)){
            System.out.println("La calificacion" + cal + "es valida");
            if (cal>=70)
                System.out.println("Acreditas");
            else
                System.out.println("No acreditas");
            
        }else
            System.out.println("La calificacion" + cal + "no es valida");
    }
    
}
