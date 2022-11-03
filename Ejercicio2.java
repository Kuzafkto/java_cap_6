/*
 *Realiza un programa que muestre al azar el nombre de una carta de la baraja
francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
1). Para convertir un número en una cadena de caracteres podemos usar
String.valueOf(n).
 *
 *@author KuzaFkto
 */

import javax.imageio.ImageTranscoder;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int value = (int)(Math.random()*13)+1;
        String card="";
        int suit =(int)(Math.random()*4)+1;



        switch (value){
            case 10:
                card+="J de ";
                break;
            case 11:
                card+="Q de ";
                break;
            case 12:
                card+="K de ";
                break;
            case 1:
                card+="A de ";
                break;

            default:
                card+= value + " de ";
                break;

        }

        switch (suit){
            case 1:
                card+="corazones";
                break;
            case 2:
                card+="picas";
                break;
            case 3:
                card+="diamantes";
                break;
            case 4:
                card+="treboles";
                break;
        }

        System.out.print(card);
    }
}
