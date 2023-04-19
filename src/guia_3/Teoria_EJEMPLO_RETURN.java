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
public class Teoria_EJEMPLO_RETURN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        /*  .....................TEORIA....................
        Subprogramas:
        Un método muy útil para solucionar un problema complejo es dividirlo en
subproblemas —problemas más sencillos— y a continuación dividir estos
subproblemas en otros más simples, hasta que los problemas más pequeños
sean fáciles de resolver. Esta técnica de dividir el problema principal en
subproblemas se suele denominar “divide y vencerás”.
El problema principal se soluciona por el correspondiente programa o algoritmo
principal, mientras que la solución de los subproblemas será a través de
subprogramas, conocidos como procedimientos o funciones. Un subprograma
es un como un mini algoritmo, que recibe los datos, necesarios para realizar
una tarea, desde el programa y devuelve los resultados de esa tarea.
        
        Funciones
Las funciones o métodos son un conjunto de líneas de código (instrucciones),
encapsulados en un bloque, usualmente según los parámetros definidos en la
función, esta recibe argumentos, cuyos valores se utilizan para efectuar
operaciones y adicionalmente retornan un valor. En otras palabras, una función
según sus parámetros puede recibir argumentos (algunas no reciben nada),
hace uso de dichos valores recibidos como sea necesario y retorna un valor
usando la instrucción return, si no retorna es otro tipo de función. 
 
Los tipos que pueden usarse en la función son: int, doble, long, boolean, String y char.

A estas funciones les vamos a asignar un tipo de acceso y un modificador.
Estos dos conceptos los vamos a ver mejor más adelante, pero por ahora
siempre vamos a crear las funciones con el acceso public y el modificador
static. Para saber más sobre estos dos temas, leer la explicación del método
main.
                
        GRAMATICA:
        
[acceso][modificador][tipo] nombreFuncion([tipo] nombreArgumento, …….){

* Bloque de instrucciones
return valor;
}
        Consejos acerca de return:
· Cualquier instrucción que se encuentre después de la ejecución de
return NO será ejecutada. Es común encontrar funciones con
múltiples sentencias return al interior de condicionales, pero una vez
que el código ejecuta una sentencia return lo que haya de allí hacia
abajo no se ejecutará.
· El tipo de valor que se retorna en una función debe coincidir con el
del tipo declarado a la función, es decir si se declara int, el valor
retornado debe ser un número entero.
   
        EJEMPLO
        
*/
       Scanner leer = new Scanner(System.in);

        int num1 = 5;
        int num2 = 7;
   
//Puedo invocar el retorno de esta funcion de esta manera
System.out.println("La suma de ambos es: " + sumar(num1,num2));
int retorno = sumar(num1, num2);
System.out.println("La suma de ambos es: " + retorno);
}
// Pero, recomendamos hacerlo de esta manera, ya que los
// retornos deben alojarse en variables para su posterior uso

    public static int sumar(int num1, int num2) // Funcion Publica que quedara estatica en la memorioa - int (devuelva un entero - Variable num1 y num2)
  //Cuerpo de la función
{ 
int suma; //nombre de la funcion
suma = num1 + num2; // funcion suma las dos variables
return suma; //Lo que va a devolver la funcion
}



    }   


        
        
