/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_28_uso.arreglos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_28_USOARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cant;
        int[] califas;//aqui el arreglo no eciste
        Scanner su = new Scanner (System.in);
        System.out.println("Cuantas calificaciones quieres capturar?");
        cant =su.nextInt();
        //ya que saben¿mos cuantas calificaciones son sen
        califas = new int [cant];//creamos el arreglo
        for (int i = 0; i < cant; i++) {
            
            System.out.println("Introduce la canlificacion");
            califas[i] = su.nextInt();
            
            
            
        }
        for (int i = 0; i < cant; i++) {
            
            System.out.print("[" + califas[i] + "]");
            
        
        
    }
    
}
