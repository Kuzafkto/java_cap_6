/*
 * Realiza un generador de melodía con las siguientes condiciones:
a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol,
la y si.
*
b) Una melodía está formada por un número aleatorio de notas mayor o igual
a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
*
c) Cada grupo de 4 notas será un compás y estará separado del siguiente
compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
con dos barras.
*
d) La última nota de la melodía debe coincidir con la primera.
*
Ejemplo 1:
do mi fa mi | si do sol fa | fa re si do | sol mi re do ||
Ejemplo 2:
la re mi sol | fa mi mi si | do la sol fa | fa re si sol | do sol mi re | fa la do la ||
 *
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        String lastChord = "";
        String chord="";
        int melodies = 4*(int)(Math.random()*7+1);
        for (int i=1; i<=melodies;i++){
            switch ((int)(Math.random()*7)+1){
                case 1:
                    chord="do";
                    break;
                case 2:
                    chord="re";
                    break;
                case 3:
                    chord="mi";
                    break;
                case 4:
                    chord="fa";
                    break;
                case 5:
                    chord="sol";
                    break;
                case 6:
                    chord="la";
                    break;
                case 7:
                    chord="si";
                    break;
            }
            if (i==1){
                lastChord=chord;
            }
            if (i==melodies){
                chord=lastChord;
            }
            System.out.print(chord+" ");

            if(i==melodies){
                System.out.print("||");
            }else if (i%4==0){
                System.out.print(" | ");
            }
        }
    }
}
