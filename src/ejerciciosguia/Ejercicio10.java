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
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limite = 0, num, suma=0;
        System.out.println("¿Cual es el límite?");
        limite = leer.nextInt();
        do{
            System.out.println("Ingrese un numero");
            num=leer.nextInt();
            suma=suma+num;
        }while(suma<limite);
        System.out.println("La suma es:"+suma);
    }
}
