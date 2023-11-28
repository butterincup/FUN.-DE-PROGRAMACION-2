/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_20_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class EVA2_20_USO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] listaProd = new String[10];
        listaProd [0] = "Tacos";
        listaProd [1] = "Tortas";
        listaProd [2] = "Tamales";
        listaProd [3] = "Tlacoyos";
        listaProd [4] = "Tlayudas";
        listaProd [5] = "Tampicoyos";
        listaProd [6] = "Torrtas ahogadas";
        listaProd [7] = "Tchilaquiles";
        listaProd [8] = "T-bone";
        listaProd [9] = "Tripitas";
        
        double[] listPrecios ={20,40,15,50,30,54,60,200,400,10};
        System.out.println("------MENU------");
        for (int i = 0; i < listaProd.length; i++) {
            System.out.println(" - " + listaProd[i] +": $" + listPrecios[i]);
            
        }
        Scanner su= new Scanner (System.in);
        int opc, cant;
        System.out.println("¿Que deseas ordenar?");
        opc = su.nextInt();
        System.out.println("¿Cuantas desea ordenar?");
        cant = su.nextInt();
        System.out.println("tu total es de: $" + (cant * listPrecios[opc]));
        
    }
    
}
