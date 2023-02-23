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
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double c;
        
        System.out.println("¿Cuantos grados centigrados?");
        c = sc.nextDouble();
        System.out.println("Elequivalente de "+ c + "°C es "+convertir(c)+"°F");
    }
    
    public static double convertir(double c){
        double f;
        f = 32 + (9*c/5);
        return f;
    }
}
