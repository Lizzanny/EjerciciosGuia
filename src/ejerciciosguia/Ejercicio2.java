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
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nombre;
        
        System.out.println("Ingrese su nombre:");
        nombre = sc.nextLine();
        
        saluda(nombre);
    }
    
    public static void saluda(String nombre){
        System.out.println("¡"+nombre+" bienvenid@ a programación Full Stack de Egg!");
    }
}
