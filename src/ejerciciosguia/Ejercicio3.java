/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia;

import java.util.Scanner;

/**
 *
 * @author LizzW
 * 
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
 * Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String frase;
        
        System.out.println("Ingrese una frase:");
        frase = sc.nextLine();
        
        if(esMayuscula(frase)){
            System.out.println("La frase esta en mayúsculas, te la muestro en minusculas:");
            System.out.println(minuscula(frase));
        }else if(esMinuscula(frase)){
            System.out.println("La frase esta en minusculas, te la muestro en mayusculas:");
            System.out.println(mayuscula(frase));
        }else{
            System.out.println("La frase esta en formato mixto, te la muestro en mayusculas:");
            System.out.println(mayuscula(frase));
            System.out.println("y tambien en minusculas:");
            System.out.println(minuscula(frase));
        }
    }
    
    public static boolean esMayuscula(String s) {
        // Regresa el resultado de comparar la original con su versión mayúscula
	return s.equals(s.toUpperCase());
    }

    public static boolean esMinuscula(String s) {
	// Regresa el resultado de comparar la original con su versión minúscula
	return s.equals(s.toLowerCase());
    }
    
    public static String minuscula(String frase){
        return frase.toLowerCase();
    }
    
    public static String mayuscula(String frase){
        return frase.toUpperCase();
    }
}
