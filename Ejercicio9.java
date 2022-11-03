/*
 * Realiza un programa que vaya generando números aleatorios pares entre 0
y 100 y que no termine de generar números hasta que no saque el 24. El
programa deberá decir al final cuántos números se han generado.
 *
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numrand=0;
        int counter =1;
        while (numrand!=24){
            numrand=(int)((Math.random())*101);
            if (numrand%2==0){
                System.out.println(numrand);
                counter++;
            }
        }
        System.out.printf(" \n Se han ingresado %d números",counter);
        sc.close();
    }
}
