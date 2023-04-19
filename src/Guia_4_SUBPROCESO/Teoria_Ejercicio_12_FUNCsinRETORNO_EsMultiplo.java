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
public class Teoria_Ejercicio_12_FUNCsinRETORNO_EsMultiplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
Ejercicio 12
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
usuario, validando que el primer número múltiplo del segundo e imprima si el
primer número es múltiplo del segundo, sino informe que no lo son.
   
        num1%num2===0 (son primos)
   
         */
        Scanner Leer = new Scanner(System.in);

        int Num1;
        int Num2;
        System.out.println("Por Favor ingrese un numero");
        Num1 = Leer.nextInt();
        System.out.println("Por Favor ingrese otro numero, así averiguar si el numero anterior es multiplo del actual");
        Num2 = Leer.nextInt();

        EsMultiplo(Num1, Num2);

    }



//---------------SUBPROCESO----------
public static void EsMultiplo(int Num1, int Num2)//VOID NO RETORNA NADA 
{
    if (Num1%Num2==0)
    {
    System.out.println("El numero ingresa : " + Num1 + "--SÍ-- es Multiplo de " + Num2);
}
        else
        {
        System.out.println("El numero ingresa : " + Num1 + "--NO-- es Multiplo de " + Num2);
        }
}
}
