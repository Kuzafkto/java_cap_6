/*
 *Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su
jugada y luego el ordenador genera al azar una de las opciones. Si el usuario
introduce una opción incorrecta, el programa deberá mostrar un mensaje de
error.
*
Ejemplo 1:
*
Turno del jugador (introduzca piedra, papel o tijera): papel
Turno del ordenador: papel
Empate
*
Ejemplo 2:
Turno del jugador (introduzca piedra, papel o tijera): papel
Turno del ordenador: tijera
Gana el ordenador
*
Ejemplo 3:
Turno del jugador (introduzca piedra, papel o tijera): piedra
Turno del ordenador: tijera
Gana el jugador

 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean error=true;
        String choice ="";
        while (error){
            System.out.print("Turno del jugador (introduzca piedra, papel, o tijera): ");
             choice =sc.next();
            if (choice.equals("tijera")==false && choice.equals("papel")==false && choice.equals("piedra")==false){
                System.out.println("Error, valor introducido incorrectamente");
            }else{
                error=false;
            }
        }
        int enChoice=1+(int)(Math.random()*3);
        System.out.print("Turno del ordenador: ");
        switch (enChoice){
            case 1:
                System.out.println("piedra");
                break;
            case 2:
                System.out.println("papel");
                break;
            case 3:
                System.out.println("tijera");
                break;
        }
        switch (choice){
            case "tijera":
                if (enChoice==1){
                    System.out.println("Gana el ordenador");
                }else if (enChoice==2){
                    System.out.println("Gana el jugador");
                }else{
                    System.out.println("Empate");
                }
                break;
            case "papel":
                if (enChoice==1){
                    System.out.println("Gana el jugador");
                }else if (enChoice==2){
                    System.out.println("Empate");
                }else{
                    System.out.println("Gana el ordenador");
                }
                break;
            case "piedra":
                if (enChoice==1){
                    System.out.println("Empate");
                }else if (enChoice==2){
                    System.out.println("Gana el ordenador");
                }else{
                    System.out.println("Gana el jugador");
                }
                break;

        }
        sc.close();
    }
}
