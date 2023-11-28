/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_31_arreglos_2;

import java.util.Scanner;
import static javafx.beans.binding.Bindings.length;

/**
 *
 * @author Invitado
 */
public class EVA2_31_ARREGLOS_2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
           int [] arreglo= new int [15];
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i]=(int)(Math.random() * 100);
                
             
            }
              for (int i = 0; i < arreglo.length; i++) {
                  System.out.print("[" + arreglo[i] + "]");
                
            }
              Scanner su =new Scanner (System.in);
              System.out.println("");
              System.out.println("¿Que valor buscas?");
              Scanner input =new Scanner (System.in);
              int valor = input.nextInt();
              int posi=-1;
            for (int i = 0; i < 10; i++) {
                if (valor == arreglo [i]){
                    System.out.println("El valor esta en la posicion" + i);
                    posi = i;
                    break;
                }
                if (posi != -1)
                    System.out.println("el valor esta en la posicion: " + posi);
                else
                    System.out.println("Valor no encontrado");
                break;
            }
            }
        }
        
        
        
    
    

