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
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner sc = new Scanner(System.in);
            String cadena;
            int correctos=0;
            int incorrectos = 0;
            //cadena=null;
            do{
                System.out.println("Ingrese una cadena de caracteres");
                cadena = sc.nextLine();
                    //System.out.println("LON"+cadena.length());
                if(cadena.length()<=5){
                    int lim_i=cadena.length()-1;
                    int lim_s=cadena.length();
                    //System.out.println(cadena.substring(0,1)+"  "+ cadena.substring(lim_i,lim_s));
                    //System.out.println("entra");
                    if("X".equalsIgnoreCase(cadena.substring(0,1)) && "O".equalsIgnoreCase(cadena.substring(lim_i,lim_s))){
                        //System.out.println("contando");
                        correctos++;
                    }else{
                        if(!cadena.equals("&&&&&")){
                            //System.out.println("no cumple");
                            incorrectos++;
                        }
                    }

                }else{
                    System.out.println("incorrecto");
                    incorrectos++;
                }
            }
           while(!cadena.equals("&&&&&"));
            System.out.println("numero de veces correcto: "+correctos);
            System.out.println("numero de veces incorrecto: "+incorrectos);
            
    }
}
