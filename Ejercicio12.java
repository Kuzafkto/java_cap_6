/*
 * Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
convertir un entero en un carácter.
*
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("");
        boolean infinite =true;
        while (infinite=true){
            System.out.print((char)(((int)(Math.random()*126)+32)));
        }
        sc.close();
    }
}
