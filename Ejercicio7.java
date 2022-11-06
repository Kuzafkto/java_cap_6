/*
 *Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
para los 14 partidos y el pleno al quince (15 filas).
 *
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        for (int i=1; i<=14; i++){
            System.out.printf("%-2s",i);
            System.out.print(" | ");
            switch ((int)(Math.random()*3)+1){
                case 1:
                    System.out.print("1");
                    break;
                case 2:
                    System.out.print("x");
                    break;
                case 3:
                    System.out.print("2");
                    break;
            }
            System.out.print(" | ");
            switch ((int)(Math.random()*3)+1){
                case 1:
                    System.out.print("1");
                    break;
                case 2:
                    System.out.print("x");
                    break;
                case 3:
                    System.out.print("2");
                    break;
            }
            System.out.print(" | ");
            switch ((int)(Math.random()*3)+1){
                case 1:
                    System.out.print("1");
                    break;
                case 2:
                    System.out.print("x");
                    break;
                case 3:
                    System.out.print("2");
                    break;
            }
            System.out.print(" | ");
            System.out.println("");
        }

        System.out.printf("%-2s",15);
        System.out.print(" | ");

        switch ((int)(Math.random()*3)+1){
            case 1:
                System.out.print("1");
                break;
            case 2:
                System.out.print("x");
                break;
            case 3:
                System.out.print("2");
                break;
        }
        System.out.print(" | ");
    }
}
