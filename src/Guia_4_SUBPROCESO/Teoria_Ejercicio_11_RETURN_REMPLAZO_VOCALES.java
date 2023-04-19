/*
 * To change this license header,choose License Headers in Project Properties.
 * To change this template file,choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_4_SUBPROCESO;

import java.util.Scanner;

/**
 *
 * @author kuchi
 */
public class Teoria_Ejercicio_11_RETURN_REMPLAZO_VOCALES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
     
        /*
        Ejercicio 11
Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto,y luego codifique la palabra o frase ingresada de
la siguiente manera: 

 cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.
a e i o u
@ # $ % *

Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la
transformación.

Por ejemplo,si el usuario ingresa: Ayer,lunes,salimos a las once y 10.
La salida del programa debería ser: @y#r,l*n#s,s@l$m%s @ l@s %nc# y 10.

        INVESTIGAR= CONCAT () de la clase String = VARIABLE.concat(parametro) RETORNA STRING LA UNION DE LA VARIABLE Y DEL PARAMETRO  
                    TRIM() = Elimina los espacios en blanco del frente y del final (devuelve un String)
        
        */
        
        Scanner leer = new Scanner(System.in);
        
        String Frase;/*="Ayer lunes salimos a las once y 10."; */
        String Frase2;
        String Letra;
        System.out.println("ingresa una frase y finaliza con un punto");//almacena toda la line
        Frase = leer.nextLine();
        reemplazo(Frase); //Llamar a la Funcion (Subprograma)
        
      
    }
    ///------------------------SUBPROGRAMA----------------------------////           
    public static String reemplazo (String Texto) // Public (va a ser publico) - Static (no lo pueden modificar) - String (va a devolver una palabra) - Reemplazo el nombre del subproceso - (String Texto) - La variable que se va a utilizar
                {
                String Frase2=""; //(donde se va a ir concatecanado todo)   
                String Letra; //(se va a ir identificando con cada letra)
                int n=Texto.length();
                    
                    for (int i = 0; i < n; i++) 
                       {
                        Letra=Texto.substring(i,i+1); //Substring recorre toda la palabra
                        switch (Letra.toLowerCase())
                            {   //Switch es un segun (lo que quiero comparar) - pase todo a minuscula (toLoverCase)
                            case "a":
                            Letra= "@";
                            break;
                            case "e":
                            Letra= "#";
                            break;
                            case "i":
                            Letra= "$";
                            break;
                            case "o":
                            Letra= "%";
                            break;
                            case "u":
                            Letra= "*";
                            break;  
                           }
                           Frase2= Frase2+Letra;
                           System.out.print(Letra);
                        }
                    System.out.println("");
                    return Frase2;
                }
                
                

 /*   -----RESULTO DE MANERA SIMPLE SIN USAR RETURN----------
        String Frase;//="Ayer lunes salimos a las once y 10."; 
        System.out.println("ingresa una frase y finaliza con un punto");//almacena toda la line
        Frase = leer.nextLine();
        
        String a="a";
        String a2="@";
        String e="e";
        String e2="#";
        String y="i";
        String y2="%";
        String o="o";
        String o2="%";
        String u="u";
        String u2="*";  
        
        int n = Frase.length();
   

         for (int i = 0; i < n-1; i++) {                       
         Frase= Frase.replaceAll(a,a2);
         Frase= Frase.replaceAll(e,e2);
         Frase= Frase.replaceAll(y,y2);
         Frase= Frase.replaceAll(o,o2);
         Frase= Frase.replaceAll(u,u2);

         System.out.println(Frase);
*/
       
  
    }
    

