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
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Ingrese el primer número");
        num1 = sc.nextInt();
        
        System.out.println("Ingrese el segundo número");
        num2 = sc.nextInt();
        
        suma(num1, num2);
    }
    
    public static void suma(int num1, int num2){
        int res = 0;
        res = num1 + num2;
        
        System.out.println("El resultado de la suma de "+num1+" + "+num2+" = "+res);
    }
}
