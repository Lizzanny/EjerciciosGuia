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
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        System.out.println("Ingrese un número");
        num = sc.nextInt();
        
        System.out.println("El doble es:"+doble(num));
        System.out.println("El triple es:"+triple(num));
        System.out.println("La raiz cuadrada es:"+raiz(num));
        
    }
    
    public static int doble(int num){
        return 2*num;
    }
    
    public static int triple(int num){
        return 3*num;
    }
    
    public static double raiz(int num){
        return Math.sqrt(num);
    }
}
