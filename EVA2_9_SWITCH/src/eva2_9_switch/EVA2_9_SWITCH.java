/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_9_switch;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_9_SWITCH {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      int mes;
      Scanner input= new Scanner(System.in);
      System.out.println("Introduce el numero del mes");
      mes = input.nextInt();
      //switch se usa scuando sabes las opciones (como el else if pero mejor) 
      //el switch utiliza el case para dar inicio a las opciones y el break para concluir
      switch(mes){
         case 1:
            System.out.println("enero");
            break;
         case 2:
            System.out.println("febrero");
            break;
         case 3:
            System.out.println("marzo");
            break;
         case 4:
            System.out.println("abril");
            break;
         case 5:
            System.out.println("mayo");
            break;
         case 6:
            System.out.println("junio");
            break;
         case 7:
            System.out.println("julio");
            break;
         case 8:
            System.out.println("agosto");
            break;
         case 9:
            System.out.println("septiembre");
            break;
         case 10:
            System.out.println("octubre");
            break;
         case 11:
            System.out.println("noviembre");
            break;
         case 12:
            System.out.println("dicembre");
            break;
            //defaul es como el else de if (siempre va al finasl/no lleva break)
         default: 
            System.out.println("el numero "+mes+" no es valido");
      }
      }
   
   
   }
   

