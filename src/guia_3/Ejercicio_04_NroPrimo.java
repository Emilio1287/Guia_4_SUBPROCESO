package guia_3;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kuchi
 */
public class Ejercicio_04_NroPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        4.
Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o no un
número primo, debe devolver true si es primo, sino false.

Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
17 si es primo.
        */ 
        
        
        Scanner Leer = new Scanner(System.in);
        boolean ret; //Creando una variable para cargar el retorno de la funcion primo
        int num1;
        
        System.out.println("Por favor ingrese un número");
        
        num1=Leer.nextInt(); 
        ret=primo (num1);
        if (ret==true)
        {
            System.out.println("El Numero " +num1 +" es PRIMO");
        }
        else
        {
            System.out.println("El Numero " +num1 +" NO es PRIMO");
        }

        
    }
    
    
    public static boolean primo(int num1) 
    {
       // boolean v=false; //Variable que puede ser unicamente VERDADERA o FALSA
        int contador=0;
        if (num1==1)
            { 
           return /*v=*/false;
            }
        else
            { for (int i = 2; i <= num1; i++) 
            {
                if (num1%i==0)
                {
                    contador++;                   
                }
                
            }
            }
        if (contador==1)
            {
            return /*v=*/true; //ES primo
            }
        else 
        {
        return /*v=*/false; //NO es primo
        }
        
    }
    
}

