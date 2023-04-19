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
public class Teoria_EJEMPLO_SUBPROCESO_FUNCION_SIN_RETORNO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       /* -----------TERORIA-------------------- 
Procedimientos (Funciones sin retorno)
Los procedimientos son básicamente un conjunto de instrucciones que se
ejecutan sin retornar ningún valor, hay quienes dicen que un procedimiento no
recibe valores o argumentos, sin embargo, en la definición no hay nada que se
lo impida. En el contexto de Java un procedimiento es básicamente una función
cuyo tipo de retorno es void, los que indica que devuelven ningún resultado.
        
        
        [acceso][modificador] void nombreFuncion([tipo] nombreArgumento)
        {
        Bloque de instrucciones
        }
        
        
        
        Acerca de los argumentos o parámetros:
· Hay algunos detalles respecto a los argumentos de un método,
veamos:
· Una función, un método o un procedimiento pueden tener una
cantidad infinita de parámetros, es decir pueden tener cero, uno, tres,
diez, cien o más parámetros. Aunque habitualmente no suelen tener
más de 4 o 5.
· Si una función tiene más de un parámetro cada uno de ellos debe ir
separado por una coma.
· Los argumentos de una función también tienen un tipo y un nombre
que los identifica. El tipo del argumento puede ser cualquiera y no
tiene relación con el tipo del método.
· Al recibir un argumento nada nos obliga a hacer uso de éste al
interior del método, sin embargo, para que recibirlo si no lo vamos a
usar.
· En java los ***argumentos*** que sean variables de tipos primitivos (int,
double, char, etc.) se van a pasar por ***valor***, mientras que los """objetos"""
(String, Integer, etc.) y los arreglos se van a pasar por """referencia""".
Nota: el concepto de objetos lo vamos a ver más adelante.

        */
String nombre = "Mariano";
int edad = 29;
mostrarInfo(nombre, edad); //LLAMA AL SUBPROCESO - SOLO EJECUTA - NO TRAE NINGUN VALOR
}
public static void mostrarInfo(String nombre, int edad)//VOID NO RETORNA NADA 
{
System.out.println("El nombre del usuario es: " + nombre + "y su edad:" + edad);
}
       
      
   
       
}

        
    
    
