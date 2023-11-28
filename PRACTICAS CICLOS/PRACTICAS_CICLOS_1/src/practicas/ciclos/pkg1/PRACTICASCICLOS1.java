/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas.ciclos.pkg1;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class PRACTICASCICLOS1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2;
        Scanner su =new Scanner(System.in);
      
        System.out.println("ingrece su primer numero positivo");
        num1= su.nextInt();
        System.out.println("ingrece el segundo numero positivo");
        num2= su.nextInt();
        
        if (num1>=0){
            if (num2>=0)
                System.out.println("los números entre ellos son: ");
        for (int i= num1; i <= num2; i++) {
            
            System.out.print(i + " - ");
        }
        }
        else 
            System.out.println("alguno de los numeros no es valido, prueve otra vez");
        
    }
    
}
