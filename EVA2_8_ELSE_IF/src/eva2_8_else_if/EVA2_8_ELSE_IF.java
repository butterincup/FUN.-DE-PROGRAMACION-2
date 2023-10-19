/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_8_else_if;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_8_ELSE_IF {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      //sireve para multiples occiones 
      int mes;
      Scanner input= new Scanner(System.in);
      System.out.println("Introduce el numero del mes");
      mes = input.nextInt();
      //if ((mes >=1)&&(mes<=12)){
        // System.out.println("El numero" + mes + "es valido");
         
         if(mes==1)
            System.out.println("Enero");
         // se pone el else if para evaluar multiples opciones (es lo mismo que el if)
         // si no es ningun punto establecido se ira al else
         else if (mes==2)
            System.out.println("febrero");
         else if (mes==3)
            System.out.println("Marzo");
         else if (mes==4)
            System.out.println("Abril");
         else if (mes==5)
            System.out.println("Mayo");
         else if (mes==6)
            System.out.println("Junio");
         else if (mes==7)
            System.out.println("Julio");
         else if (mes==8)
            System.out.println("Agosto");
         else if (mes==9)
            System.out.println("Septiembre");
         else if (mes==10)
            System.out.println("Octubre");
         else if (mes==11)
            System.out.println("Novembre");
         else if (mes==12)
            System.out.println("Dicembre");
         
         else 
            System.out.println("el numero" +mes+"no es valido ");
         
      //}else
       //  System.out.println("El numero"+mes+" no corresponde a ningun mes");
      }
   
   }
   

