/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_4_SUBPROCESO;

import java.util.Scanner;

/**
 *
 * @author kuchi
 */
public class Ejercicio_01_SumarRestarMultiplicarDividir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
        1. Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.        
         */
        Scanner Leer = new Scanner(System.in);
        int Selec = 1;

        int Num1;
        int Num2;
        do {
            System.out.println("Por Favor ingrese un numero");
            Num1 = Leer.nextInt();
            System.out.println("Por Favor ingrese otro numero");
            Num2 = Leer.nextInt();

            System.out.println("Seleccione una opción:");
            System.out.println("1- Sumar");
            System.out.println("2- Restar");
            System.out.println("3- Dividir");
            System.out.println("4- Multiplicar");
            System.out.println("5- Salir");

            int opcion = Leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("La suma es " + Suma(Num1, Num2));
                    break;

                case 2: 
                    System.out.println("La Resta es " + Resta(Num1, Num2));
                    break;

                case 3:
                    System.out.println("La División es " + Division(Num1, Num2));
                    break;

                case 4:
                    System.out.println("La Multiplicación es " + Multiplicacion(Num1, Num2));
                    break;

                case 5:
                    System.out.println("Gracias por utilizar el sistema");
                    break;

            }
            System.out.println("Desea Vulver al menu inicial: \n"
                    + "1.si\n"
                    + "2.no"); // dentro de las comillas \n hace un salto de linea 
            Selec=Leer.nextInt();
        } while (Selec == 1);
        System.out.println("Muchas gracias");

    }

    public static int Suma(int Num1, int Num2) {
        return Num1 + Num2;
    }

    public static int Resta(int Num1, int Num2) {
        return Num1 - Num2;
    }

    public static int Division(int Num1, int Num2) {
        return Num1 / Num2;
    }

    public static int Multiplicacion(int Num1, int Num2) {
        return Num1 * Num2;
    }

}
