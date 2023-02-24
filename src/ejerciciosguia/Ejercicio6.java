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
 * Crear un programa que dado un numero determine si es par o impar.
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Ingrese un numero");
        num = sc.nextInt();

        esPar(num);
    }

    public static void esPar(int num) {
        if (num % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }
}
