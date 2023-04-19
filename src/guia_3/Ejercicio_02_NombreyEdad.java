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
public class Ejercicio_02_NombreyEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
/*        
2. Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. 
Después de cada persona, el programa debe preguntarle al usuario
si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
*/

        Scanner Leer = new Scanner (System.in);
        
        String Nombre;
        int Edad;
        String respuesta;

        do {         
        System.out.println("Por Favor Ingrese el Nombre");
        Nombre=Leer.next();   //Next solo par texto - Int numeros
        System.out.println("Por Favor Ingrese la Edad");
        Edad=Leer.nextInt();
            
        if (Edad>=18)
        {
            System.out.println(Nombre +" Es MAYOR de EDAD");
        }
        else
        {
            System.out.println(Nombre +" Es MENOR de EDAD");
        }
    
            System.out.println("Desea continuar S/N");
            respuesta=Leer.next();
            
            
        } while (respuesta.equalsIgnoreCase("s"));
        
        
    }
    
    /*
    
    
    
    
    */

    
}
