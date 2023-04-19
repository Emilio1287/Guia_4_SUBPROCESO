/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_3;

import java.util.Scanner;

/**
 *
 * @author kuchi
 */
public class Ejercicio_03_Libra_$_EUROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        03
        Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €
        */
        Scanner Leer = new Scanner(System.in);
        
        double euros;  //double se utiliza para decimales
        double dolares;
        double yenes;
        double libras;
        
        System.out.println("Por Favor Ingrese la cantidades de Euros a convertir");
        euros=Leer.nextDouble();
        
        
        System.out.println(euros +" equivale a "+ libras(euros)+" LIBRAS");
        System.out.println(euros +" equivale a "+ dolares(euros)+" USD");
        System.out.println(euros +" equivale a "+ yenes(euros)+" YENES");
      
    }
   
    
     public static double libras (double euros)
     {
     return euros*0.86;
     }
    
     public static double dolares (double euros)
     {   
     return euros*1.28611;
     }
     
     public static double yenes (double euros)
     {
     return euros*129.852;
     }
    
     
}
