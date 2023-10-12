package com.mycompany.eva2_2_if_2;

import java.util.Scanner;
public class EVA2_2_IF_2 {
    private static final Scanner input = new Scanner (System.in);

    public static void main(String[] args) {
        System.out.println("Introduce valor 1");
        int valor1 = input.nextInt();
        System.out.println("Introduce valor 2");
        int valor2 = input.nextInt();
        
        if(valor1 > valor2) {
            System.out.println("El valor mas grande es" + valor1);
        } else 
        {if (valor1 == valor2) {
            System.out.println("Ambos valores son iguales");
        } else {
            System.out.println("El valor mas grande es" + valor2);
        }
        System.out.println("Fin del Programa");
    }
    }
}