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
        System.out.println("Piensa en un número entre 1 y 100");
        int maxNum=101;
        int minNum=0;
        boolean correct = false;
        int attempts=5;
        int guess=minNum+(int)(Math.random()*(maxNum-minNum));
        int choice;

        while (attempts>0 && !correct){
            System.out.print("Es "+guess+" el número en el que estabas pensando? (1.Si | 2.Mas pequeño | 3.Mas grande): ");
            choice=sc.nextInt();
            while (choice>4||choice<0){
                    System.out.println("La opción introducida es incorrecta, por favor vuelva a introducirla: .");
                    choice=sc.nextInt();
                }
            if (choice==1){
                System.out.print("El "+guess+" es el número que estabas pensando! ");
                correct=true;
            }else if (choice==2){
                System.out.println(guess + " es un número muy grande");
                maxNum=guess;
            }else{
                System.out.println(guess+ " es muy pequeño? ok");
                minNum=guess;
            }
                guess=minNum+(int)(Math.random()*(maxNum-minNum));
                attempts--;
                if(!correct){
                    System.out.println("Quedan "+ attempts + " intentos ");
                }

            }
        sc.close();
    }
    }

