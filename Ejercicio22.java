/*
 *Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
aleatorio. La cabeza se representará con el carácter @ y se debe colocar
exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
el cuerpo irá serpenteando de la siguiente manera: se generará de forma
aleatoria un valor entre tres posibles que hará que el siguiente carácter se
coloque una posición a la izquierda del anterior, alineado con el anterior o una
posición a la derecha del anterior. La longitud de la serpiente se pedirá por
teclado y se supone que el usuario introducirá un dato correcto.
Ejemplo:
Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: 6
            @
            *
           *
            *
            *
             *
Ejercicio 2
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: ");
        int heigth=sc.nextInt();
        int spaces=12;

        System.out.print("            @");
        System.out.println("");
        for(int i=0; i<heigth-1; i++){
            spaces+=(-1+(int)(Math.random()*3));
            for (int x=0;x<spaces; x++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
        }
        sc.close();
    }
}
