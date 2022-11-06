/*
 * Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno
de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria
entre 1 y 40 caracteres.
 *
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        char randchar='c';

        for (int i= 0 ; i<10; i ++){
            switch ((int)((Math.random()*7))){
                case 1:
                    randchar='*';
                    break;
                case 2:
                    randchar='-';
                    break;
                case 3:
                    randchar='.';
                    break;
                case 4:
                    randchar='|';
                    break;
                case 5:
                    randchar = '=';
                    break;
                case 6:
                    randchar ='@';
                    break;
            }
            int length=(int)(Math.random()*41)+1;
            for (int x=0; x<length;x++){
                System.out.print(randchar);
            }
            System.out.println("");
        }
    }
}
