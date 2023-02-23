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
 */
public class Ejercicio11 {
     public static void main(String[] args) {
        // TODO code application logic here
            Scanner input = new Scanner(System.in);
        int num1, num2, opcion, resultado;
        char confirmacion;

        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            System.out.print("Elija opción: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    num1 = input.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = input.nextInt();
                    resultado = num1 + num2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    System.out.print("Ingrese el primer número: ");
                    num1 = input.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = input.nextInt();
                    resultado = num1 - num2;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3:
                    System.out.print("Ingrese el primer número: ");
                    num1 = input.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = input.nextInt();
                    resultado = num1 * num2;
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                case 4:
                    System.out.print("Ingrese el primer número: ");
                    num1 = input.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = input.nextInt();
                    if (num2 == 0) {
                        System.out.println("No se puede dividir por cero.");
                    } else {
                        resultado = num1 / num2;
                        System.out.println("El resultado de la división es: " + resultado);
                    }
                    break;
                case 5:
                    System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                    confirmacion = input.next().charAt(0);
                    if (confirmacion == 'S' || confirmacion == 's') {
                        System.out.println("Saliendo del programa...");
                        System.exit(0);
                        break;
                    }else{
                        opcion=0;
                    }
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 5);
    }
}
