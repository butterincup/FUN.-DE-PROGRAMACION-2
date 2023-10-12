package com.mycompany.eva2_1_if;

import java.util.Scanner;
public class EVA2_1_IF {
    private static final Scanner input = new Scanner (System.in);

    public static void main(String[] args) {
        System.out.println("Introduce calificacion");
        int califa = input.nextInt();
        
        if(califa >=70) {//if (expresion a evaluar)
            System.out.println("Aprobado");
            System.out.println("Felicidades!");
        }
        else {//esle -> si no, ES OPCIONAL.
            System.out.println("Reprobado");
            System.out.println("Recursar materia");
        }
        System.out.println("Fin del Programa");
    }
}