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
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner sc = new Scanner(System.in);
            int tam;
            System.out.println("Ingrese tamaño del cuadrado:");
            tam = sc.nextInt();
            pintar(tam);
    }
    
    public static void pintar(int tam){
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if(i==0 || i==tam-1){
                    System.out.print("*");
                }else if(j==0 || j==tam-1){
                    System.out.print("*");
                }else{
                
                    System.out.print(" ");}
            }
            System.out.println(" ");
        }
    }
}
