/*
 *
 *  Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
programa intentará adivinar el número que estás pensando - un número entre 0
y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa
debe preguntar si el número que estás pensando es mayor o menor que el que
te acaba de decir.
*
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número secreto: ");
        int secret = sc.nextInt();
        int maxNum=101;
        int minNum=0;
        while (secret<0||secret>100){
            System.out.println("Número incorrecto, por favor, vuelva a ingresarlo");
            secret=sc.nextInt();
        }
        int attempts=5;
        int guess=100;

        while (attempts>0 && guess!=secret){

            guess=minNum+(int)(Math.random()*(maxNum-minNum))+1;
            if (guess==secret){
                System.out.print(guess+" es el número secreto! ");
            }else{
                System.out.print(guess+ " es incorrecto ");
            }

            if (guess>secret){
                System.out.println(guess + " es un número muy grande");
                maxNum=guess;
            }else{
                System.out.println(guess+ " es mas pequeño que el número secreto");
                minNum=guess;
            }
            attempts--;
            System.out.println("Quedan "+ attempts + " intentos ");
        }
        sc.close();
    }
}
