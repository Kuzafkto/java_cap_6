/*
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
el programa dirá cuántas oportunidades quedan y si el número introducido es menor o mayor que el número secreto.
*
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("");
        int secret=(int)(Math.random()*101);
        int guess=0;
        int attempts=5;

        while (attempts>=1){
            System.out.println("Tienes "+ attempts+ " intentos");
            guess=sc.nextInt();
            attempts--;
            if (guess==secret){
                System.out.println("Felicidades, has adivinado el número secreto");
                attempts=0;
            }else if(guess>secret){
                System.out.println("El número ingresado es mayor al número secreto");
            } else if (guess<secret) {
                System.out.println("El número ingresado es menor al número secreto");
            }
        }
        sc.close();
    }
}
